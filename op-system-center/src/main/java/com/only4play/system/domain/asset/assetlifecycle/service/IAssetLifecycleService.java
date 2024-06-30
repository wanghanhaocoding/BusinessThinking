// ---Auto Generated by Only4Play ---
package com.only4play.system.domain.asset.assetlifecycle.service;

import com.only4play.common.model.PageRequestWrapper;
import com.only4play.system.domain.asset.assetlifecycle.creator.AssetLifecycleCreator;
import com.only4play.system.domain.asset.assetlifecycle.query.AssetLifecycleQuery;
import com.only4play.system.domain.asset.assetlifecycle.updater.AssetLifecycleUpdater;
import com.only4play.system.domain.asset.assetlifecycle.vo.AssetLifecycleVO;
import java.lang.Long;
import java.util.List;

import org.springframework.data.domain.Page;

public interface IAssetLifecycleService {
  /**
   * create
   */
  Long createAssetLifecycle(AssetLifecycleCreator creator);

  /**
   * 批量保存
   * @param batchNo 批号
   * @param creatorList
   */
  void batchCreateLifecycle(String batchNo,List<AssetLifecycleCreator> creatorList);

  /**
   * update
   */
  void updateAssetLifecycle(AssetLifecycleUpdater updater);

  /**
   * valid
   */
  void validAssetLifecycle(Long id);

  /**
   * invalid
   */
  void invalidAssetLifecycle(Long id);

  /**
   * findById
   */
  AssetLifecycleVO findById(Long id);

  /**
   * findByPage
   */
  Page<AssetLifecycleVO> findByPage(PageRequestWrapper<AssetLifecycleQuery> query);
}