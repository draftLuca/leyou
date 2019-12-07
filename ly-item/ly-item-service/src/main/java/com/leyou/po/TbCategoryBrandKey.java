package com.leyou.po;

import java.io.Serializable;

public class TbCategoryBrandKey implements Serializable {
    private Long categoryId;

    private Long brandId;

    private static final long serialVersionUID = 1L;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}