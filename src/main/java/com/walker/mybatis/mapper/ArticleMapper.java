package com.walker.mybatis.mapper;

import com.walker.mybatis.model.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author walker
 * @date 2018/12/27
 */
public interface ArticleMapper {

    List<Article> findByAuthorAndCreateTime(@Param("author") String author,
                                            @Param("createTime") String createTime);

    List<Article> findByAuthor(@Param("author") String author);
}
