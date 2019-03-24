package org.gallant.spring.transaction.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gallant.spring.transaction.entity.GallantOrder;
import org.gallant.spring.transaction.entity.GallantOrderExample;

public interface GallantOrderMapper {
    long countByExample(GallantOrderExample example);

    int deleteByExample(GallantOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GallantOrder record);

    int insertSelective(GallantOrder record);

    List<GallantOrder> selectByExample(GallantOrderExample example);

    GallantOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GallantOrder record, @Param("example") GallantOrderExample example);

    int updateByExample(@Param("record") GallantOrder record, @Param("example") GallantOrderExample example);

    int updateByPrimaryKeySelective(GallantOrder record);

    int updateByPrimaryKey(GallantOrder record);
}