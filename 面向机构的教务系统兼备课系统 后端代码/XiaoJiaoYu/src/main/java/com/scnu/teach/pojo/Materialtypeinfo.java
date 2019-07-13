package com.scnu.teach.pojo;

public class Materialtypeinfo {
    private Integer materialTypeId;

    private String materialTypeName;

    public Integer getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(Integer materialId) {
        this.materialTypeId = materialId;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialName) {
        this.materialTypeName = materialName == null ? null : materialName.trim();
    }
}