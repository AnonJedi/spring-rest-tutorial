package it.sevenbits.springtutorial.core.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {

    @Insert("INSERT INTO test (content) VALUES (#{content});")
    void create(@Param("content") final String content);

}
