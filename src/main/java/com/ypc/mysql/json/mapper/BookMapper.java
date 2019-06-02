package com.ypc.mysql.json.mapper;

import com.ypc.mysql.json.model.Book;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKeyWithBLOBs(Book record);

    int updateByPrimaryKey(Book record);
}