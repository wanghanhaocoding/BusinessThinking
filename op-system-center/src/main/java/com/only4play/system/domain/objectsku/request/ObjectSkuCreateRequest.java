// ---Auto Generated by Only4Play ---
package com.only4play.system.domain.objectsku.request;

import com.only4play.common.model.Request;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;

@Schema
public class ObjectSkuCreateRequest implements Request {
  @Schema(
      title = "sku名称"
  )
  private String skuName;

  @Schema(
      title = "模板ID"
  )
  private Long templateId;

  @Schema(
      title = "编码"
  )
  private String code;

  @Schema(
      title = "备注"
  )
  private String remark;

  @Schema(
      title = "sku类型"
  )
  private Integer skuType;

  @Schema(
      title = "子sku ID list"
  )
  private List<Long> children;

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Integer getSkuType() {
    return skuType;
  }

  public void setSkuType(Integer skuType) {
    this.skuType = skuType;
  }

  public List<Long> getChildren() {
    return children;
  }

  public void setChildren(List<Long> children) {
    this.children = children;
  }
}
