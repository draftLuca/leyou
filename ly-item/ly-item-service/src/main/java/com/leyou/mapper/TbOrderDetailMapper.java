package com.leyou.mapper;

import com.leyou.po.TbOrderDetail;
import com.leyou.po.TbOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderDetailMapper {
    long countByExample(TbOrderDetailExample example);

    int deleteByExample(TbOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderDetail record);

    int insertSelective(TbOrderDetail record);

    List<TbOrderDetail> selectByExample(TbOrderDetailExample example);

    TbOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrderDetail record, @Param("example") TbOrderDetailExample example);

    int updateByExample(@Param("record") TbOrderDetail record, @Param("example") TbOrderDetailExample example);

    int updateByPrimaryKeySelective(TbOrderDetail record);

    int updateByPrimaryKey(TbOrderDetail record);
}