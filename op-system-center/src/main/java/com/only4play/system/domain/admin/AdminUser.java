package com.only4play.system.domain.admin;

import com.only4play.codegen.processor.creator.GenCreator;
import com.only4play.codegen.processor.creator.IgnoreCreator;
import com.only4play.codegen.processor.query.GenQuery;
import com.only4play.codegen.processor.updater.GenUpdater;
import com.only4play.codegen.processor.updater.IgnoreUpdater;
import com.only4play.codegen.processor.vo.GenVo;
import com.only4play.codegen.processor.vo.IgnoreVo;
import com.only4play.common.annotation.FieldDesc;
import com.only4play.common.constants.ValidStatus;
import com.only4play.jpa.converter.ValidStatusConverter;
import com.only4play.jpa.support.BaseJpaAggregate;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * 后台用户
 * @author admin
 */
@GenVo(pkgName = "com.only4play.system.domain.admin.vo")
@GenCreator(pkgName = "com.only4play.system.domain.admin.creator")
@GenUpdater(pkgName = "com.only4play.system.domain.admin.updater")
@GenQuery(pkgName = "com.only4play.system.domain.admin.query")
@Entity
@Table(name = "admin_user")
@Data
public class AdminUser extends BaseJpaAggregate {

  @FieldDesc(name = "手机号")
  @NotBlank(message = "手机号不能为空")
  private String phone;

  @FieldDesc(name = "密码")
  @IgnoreVo
  @NotBlank(message = "密码不能为空")
  private String password;

  @FieldDesc(name = "用户名")
  private String username;

  @FieldDesc(name = "部门ID")
  private Long departmentId;

  @FieldDesc(name = "额外信息")
  @Column(columnDefinition = "text")
  private String extInfo;

  @Convert(converter = ValidStatusConverter.class)
  @IgnoreUpdater
  @IgnoreCreator
  private ValidStatus validStatus;

  public void init(String encodePass) {
    setPassword(encodePass);
    setValidStatus(ValidStatus.VALID);
  }

  public void valid(){
    setValidStatus(ValidStatus.VALID);
  }

  public void invalid(){
    setValidStatus(ValidStatus.INVALID);
  }
}
