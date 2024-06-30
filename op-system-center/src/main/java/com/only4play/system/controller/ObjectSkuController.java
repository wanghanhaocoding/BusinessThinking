// ---Auto Generated by Only4Play ---
package com.only4play.system.controller;

import com.only4play.common.constants.CodeEnum;
import com.only4play.common.model.JsonObject;
import com.only4play.common.model.PageRequestWrapper;
import com.only4play.common.model.PageResult;
import com.only4play.system.domain.objectsku.creator.ObjectSkuCreator;
import com.only4play.system.domain.objectsku.mapper.ObjectSkuMapper;
import com.only4play.system.domain.objectsku.query.ObjectSkuQuery;
import com.only4play.system.domain.objectsku.request.ObjectSkuCreateRequest;
import com.only4play.system.domain.objectsku.request.ObjectSkuQueryRequest;
import com.only4play.system.domain.objectsku.request.ObjectSkuUpdateRequest;
import com.only4play.system.domain.objectsku.response.ObjectSkuResponse;
import com.only4play.system.domain.objectsku.service.IObjectSkuService;
import com.only4play.system.domain.objectsku.updater.ObjectSkuUpdater;
import com.only4play.system.domain.objectsku.vo.ObjectSkuVO;
import java.lang.Long;
import java.lang.String;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("objectSku/v1")
@RequiredArgsConstructor
public class ObjectSkuController {
  private final IObjectSkuService objectSkuService;

  /**
   * createRequest
   */
  @PostMapping("createObjectSku")
  public JsonObject<Long> createObjectSku(@RequestBody ObjectSkuCreateRequest request) {
    ObjectSkuCreator creator = ObjectSkuMapper.INSTANCE.request2Dto(request);
    return JsonObject.success(objectSkuService.createObjectSku(creator));
  }

  /**
   * update request
   */
  @PostMapping("updateObjectSku")
  public JsonObject<String> updateObjectSku(@RequestBody ObjectSkuUpdateRequest request) {
    ObjectSkuUpdater updater = ObjectSkuMapper.INSTANCE.request2Updater(request);
    objectSkuService.updateObjectSku(updater);
    return JsonObject.success(CodeEnum.Success.getName());
  }

  /**
   * valid
   */
  @PostMapping("valid/{id}")
  public JsonObject<String> validObjectSku(@PathVariable Long id) {
    objectSkuService.validObjectSku(id);
    return JsonObject.success(CodeEnum.Success.getName());
  }

  /**
   * invalid
   */
  @PostMapping("invalid/{id}")
  public JsonObject<String> invalidObjectSku(@PathVariable Long id) {
    objectSkuService.invalidObjectSku(id);
    return JsonObject.success(CodeEnum.Success.getName());
  }

  /**
   * findById
   */
  @GetMapping("findById/{id}")
  public JsonObject<ObjectSkuResponse> findById(@PathVariable Long id) {
    ObjectSkuVO vo = objectSkuService.findById(id);
    ObjectSkuResponse response = ObjectSkuMapper.INSTANCE.vo2CustomResponse(vo);
    return JsonObject.success(response);
  }

  /**
   * findByPage request
   */
  @PostMapping("findByPage")
  public JsonObject<PageResult<ObjectSkuResponse>> findByPage(
      @RequestBody PageRequestWrapper<ObjectSkuQueryRequest> request) {
    PageRequestWrapper<ObjectSkuQuery> wrapper = new PageRequestWrapper<>();
    wrapper.setBean(ObjectSkuMapper.INSTANCE.request2Query(request.getBean()));
    wrapper.setSorts(request.getSorts());
        wrapper.setPageSize(request.getPageSize());
        wrapper.setPage(request.getPage());
    Page<ObjectSkuVO> page = objectSkuService.findByPage(wrapper);
    return JsonObject.success(
            PageResult.of(
                page.getContent().stream()
                    .map(vo -> ObjectSkuMapper.INSTANCE.vo2CustomResponse(vo))
                    .collect(Collectors.toList()),
                page.getTotalElements(),
                page.getSize(),
                page.getNumber())
        );
  }
}
