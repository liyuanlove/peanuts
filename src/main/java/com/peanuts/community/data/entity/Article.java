package com.peanuts.community.data.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * Articles
 * 
 * @author 31826
 * @since 2018/10/26
 */
@Data
@Entity(name = "article")
@EqualsAndHashCode(callSuper = false)
public class Article implements BaseEntity {
    @Id
    private int articleId;
    private User user;
    private Category category;
    private Comment[] comments;
    private Tag[] tags;
    private String content;
    private boolean publicFlg;
}
