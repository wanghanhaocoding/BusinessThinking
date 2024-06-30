// ---Auto Generated by Only4Play ---
package com.only4play.system.domain.asset.assetrecord.service;

import com.only4play.common.model.PageRequestWrapper;
import com.only4play.system.domain.asset.assetrecord.creator.AssetInOutRecordCreator;
import com.only4play.system.domain.asset.assetrecord.query.AssetInOutRecordQuery;
import com.only4play.system.domain.asset.assetrecord.vo.AssetInOutRecordVO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IAssetInOutRecordService {
  /**
   * create
   */
  Long createAssetInOutRecord(List<String> uniqueCodes, AssetInOutRecordCreator creator);

  /**
   * findById
   */
  AssetInOutRecordVO findById(Long id);

  /**
   * findByPage
   */
  Page<AssetInOutRecordVO> findByPage(PageRequestWrapper<AssetInOutRecordQuery> query);
}
