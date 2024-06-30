package com.only4play.system.domain.permission.platform;

import com.only4play.codegen.processor.creator.GenCreator;
import com.only4play.codegen.processor.creator.IgnoreCreator;
import com.only4play.codegen.processor.query.GenQuery;
import com.only4play.codegen.processor.query.QueryItem;
import com.only4play.codegen.processor.updater.GenUpdater;
import com.only4play.codegen.processor.updater.IgnoreUpdater;
import com.only4play.codegen.processor.vo.GenVo;
import com.only4play.common.annotation.FieldDesc;
import com.only4play.common.constants.ValidStatus;
import com.only4play.jpa.converter.ValidStatusConverter;
import com.only4play.jpa.support.BaseJpaAggregate;
import lombok.Data;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 平台对象
 * @author admin
 */
@GenVo(pkgName = "com.only4play.system.domain.permission.platform.vo")
@GenCreator(pkgName = "com.only4play.system.domain.permission.platform.creator")
@GenUpdater(pkgName = "com.only4play.system.domain.permission.platform.updater")
@GenQuery(pkgName = "com.only4play.system.domain.permission.platform.query")
@Entity
@Table(name = "platform")
@Data
public class Platform extends BaseJpaAggregate {

  @FieldDesc(name = "编码")
  private String code;

  @FieldDesc(name = "平台名称")
  @QueryItem(desc = "平台名称")
  private String name;

  @Convert(converter = ValidStatusConverter.class)
  @IgnoreUpdater
  @IgnoreCreator
  private ValidStatus validStatus;

  public void init() {
    setValidStatus(ValidStatus.VALID);
  }

  public void valid(){
    setValidStatus(ValidStatus.VALID);
  }

  public void invalid(){
    setValidStatus(ValidStatus.INVALID);
  }
}
