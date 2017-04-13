package com.mybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lvjian on 2017/4/10.
 */
@Mapper
public interface DemoMapper {

    @Results({@Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")})
    @Select("select * from Demo where name=#{name}")
    public List<Demo> likeName(String name);

    @Insert("insert into demo (name) values(#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insertByObject(Demo demo);

    @Update("update demo set name='哈哈' where id=#{id}")
    int updateById(String id);


}
