// ---Auto Generated by Only4Play ---
package com.only4play.system.domain.template.objecttemplate.response;

import com.only4play.common.constants.ValidStatus;
import com.only4play.common.model.AbstractJpaResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.String;

@Schema
public class TemplateCategoryResponse extends AbstractJpaResponse {
  @Schema(
      title = "分类名称"
  )
  private String name;

  @Schema(
      title = "分类编码"
  )
  private String code;

  @Schema(
      title = "validStatus"
  )
  private ValidStatus validStatus;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ValidStatus getValidStatus() {
    return validStatus;
  }

  public void setValidStatus(ValidStatus validStatus) {
    this.validStatus = validStatus;
  }
}