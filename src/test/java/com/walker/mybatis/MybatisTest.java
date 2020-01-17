package com.walker.mybatis;

import com.walker.mybatis.mapper.ArticleMapper;
import com.walker.mybatis.model.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author walker
 * @date 2018/12/27
 */
public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @BeforeAll
    public void prepare() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    @Test
    public void findArticle() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ArticleMapper articleMapper = sqlSession.getMapper(ArticleMapper.class);
        List<Article> articles = articleMapper.findByAuthorAndCreateTime("123", "2018-12-12");
        articles.forEach(System.out::println);
        sqlSession.commit();
        sqlSession.close();
    }
}
