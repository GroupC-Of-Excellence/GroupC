package com.google.mapper;

import com.google.entity.Article;

public interface ArticleMapper {
    //添加文章
    int addArticle(Article article);
    //删除文章
    int deleteArticle(int artno);
}
