package com.only4play.system.domain.permission.role;

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
 * 角色
 * @author admin
 */
@GenVo(pkgName = "com.only4play.system.domain.permission.role.vo")
@GenCreator(pkgName = "com.only4play.system.domain.permission.role.creator")
@GenUpdater(pkgName = "com.only4play.system.domain.permission.role.updater")
@GenQuery(pkgName = "com.only4play.system.domain.permission.role.query")
@Entity
@Table(name = "role")
@Data
public class Role extends BaseJpaAggregate {

  @FieldDesc(name = "角色编码")
  private String role;

  @FieldDesc(name = "角色名称")
  @QueryItem
  private String name;

  @QueryItem
  @FieldDesc(name = "平台Id")
  private Long platformId;

  @FieldDesc(name = "备注")
  private String remark;

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