package com.walker.mybatis.model;

import lombok.Data;

import java.util.Date;

/**
 * @author walker
 * @date 2018/12/27
 */
@Data
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Date createTime;
}
