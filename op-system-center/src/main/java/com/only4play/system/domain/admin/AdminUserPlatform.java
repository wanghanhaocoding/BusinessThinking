package com.only4play.system.domain.admin;

/**
 * @author noon
 * @date 2022/8/31
 */

import com.only4play.codegen.processor.repository.GenRepository;
import com.only4play.codegen.processor.vo.GenVo;
import com.only4play.common.annotation.FieldDesc;
import com.only4play.jpa.support.BaseJpaAggregate;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@GenVo(pkgName = "com.only4play.system.domain.admin.vo")
@GenRepository(pkgName = "com.only4play.system.domain.admin.repository")
@Entity
@Table(name = "admin_platform")
@Data
public class AdminUserPlatform extends BaseJpaAggregate {

  @FieldDesc(name = "用户id")
  private Long userId;

  @FieldDesc(name = "平台id")
  private Long platformId;
}
