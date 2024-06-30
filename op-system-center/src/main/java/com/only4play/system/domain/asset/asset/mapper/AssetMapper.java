// ---Auto Generated by Only4Play ---
package com.only4play.system.domain.asset.asset.mapper;

import com.only4play.common.mapper.DateMapper;
import com.only4play.common.mapper.GenericEnumMapper;
import com.only4play.system.domain.asset.asset.Asset;
import com.only4play.system.domain.asset.asset.creator.AssetCreator;
import com.only4play.system.domain.asset.asset.query.AssetQuery;
import com.only4play.system.domain.asset.asset.request.AssetCreateRequest;
import com.only4play.system.domain.asset.asset.request.AssetQueryRequest;
import com.only4play.system.domain.asset.asset.request.AssetUpdateRequest;
import com.only4play.system.domain.asset.asset.response.AssetResponse;
import com.only4play.system.domain.asset.asset.updater.AssetUpdater;
import com.only4play.system.domain.asset.asset.vo.AssetVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
    uses = {
        GenericEnumMapper.class,
        DateMapper.class
    }
)
public interface AssetMapper {
  AssetMapper INSTANCE = Mappers.getMapper(AssetMapper.class);

  Asset dtoToEntity(AssetCreator dto);

  AssetUpdater request2Updater(AssetUpdateRequest request);

  AssetCreator request2Dto(AssetCreateRequest request);

  AssetQuery request2Query(AssetQueryRequest request);

  AssetResponse vo2Response(AssetVO vo);

  default AssetResponse vo2CustomResponse(AssetVO vo) {
    AssetResponse response = vo2Response(vo);
    return response;
  }
}