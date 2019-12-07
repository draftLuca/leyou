package com.leyou.mapper;

import com.leyou.po.TbCategoryBrandExample;
import com.leyou.po.TbCategoryBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCategoryBrandMapper {
    long countByExample(TbCategoryBrandExample example);

    int deleteByExample(TbCategoryBrandExample example);

    int deleteByPrimaryKey(TbCategoryBrandKey key);

    int insert(TbCategoryBrandKey record);

    int insertSelective(TbCategoryBrandKey record);

    List<TbCategoryBrandKey> selectByExample(TbCategoryBrandExample example);

    int updateByExampleSelective(@Param("record") TbCategoryBrandKey record, @Param("example") TbCategoryBrandExample example);

    int updateByExample(@Param("record") TbCategoryBrandKey record, @Param("example") TbCategoryBrandExample example);
}