package com.walker.mybatis;

import com.walker.mybatis.mapper.ArticleMapper;
import com.walker.mybatis.model.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/1/17
 */
@SpringBootApplication
public class MyBatisApplication {
    public static void main(String[] args) {
        // 1. mybatis 初始化
        String resource = "mybatis-config.xml";
        // 配置文件输入流
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 数据读写
        try (SqlSession session = sqlSessionFactory.openSession()) {
            ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
            List<Article> articles = articleMapper.findByAuthor("123");
            for (Article article : articles) {
                System.out.println(article);
            }
        }
    }
}
