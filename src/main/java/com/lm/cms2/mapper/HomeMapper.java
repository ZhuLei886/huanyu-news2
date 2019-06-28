package com.lm.cms2.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
@Service
public interface HomeMapper {
    @Select("select * from t_rece_node")
    public List<Map<String,Object>> getHomeNode();

    @Select("select count(t_article_id) from t_article ")
    public int getArticleCount();

    @Select("select * from t_article order by t_article_id desc limit #{offset},#{limit}")
    public List<Map<String,Object>> getArticle(@Param("offset") int offset, @Param("limit") int limit);



}
