package com.walker.mybatis;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.junit.Test;

/**
 * @author walker
 * @date 2019/1/8
 */
public class MetaClassTest {

    private class Author {
        private Integer id;
        private String name;
        private Integer age;
        private Article[] articles;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Article[] getArticles() {
            return articles;
        }

        public void setArticles(Article[] articles) {
            this.articles = articles;
        }
    }

    private class Article {
        private Integer id;
        private String title;
        private String content;
        private Author author;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }
    }

    @Test
    public void testHasSetter() {
        MetaClass metaClass = MetaClass.forClass(Author.class, new DefaultReflectorFactory());
        System.out.println("---------☆ Author ☆----------");
        System.out.println("id -->" + metaClass.hasSetter("id"));
        System.out.println("name -->" + metaClass.hasSetter("name"));
        System.out.println("age -->" + metaClass.hasSetter("age"));
        System.out.println("articles -->" + metaClass.hasSetter("articles"));
        System.out.println("articles[] -->" + metaClass.hasSetter("articles[]"));
        System.out.println("title -->" + metaClass.hasSetter("title"));

        MetaClass articleMetaClass = MetaClass.forClass(Article.class, new DefaultReflectorFactory());
        System.out.println("---------☆ Article ☆----------");
        System.out.println("id -->" + articleMetaClass.hasSetter("id"));
        System.out.println("title -->" + articleMetaClass.hasSetter("title"));
        System.out.println("content -->" + articleMetaClass.hasSetter("content"));
        System.out.println("author.id -->" + articleMetaClass.hasSetter("author.id"));
        System.out.println("author.name -->" + articleMetaClass.hasSetter("author.name"));
    }
}
