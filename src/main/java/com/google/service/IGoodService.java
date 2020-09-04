package com.google.service;

import java.util.List;

public interface IGoodService {
    List<Goods> loadGoods(int page, int pageSize);
    int calcPage(int pageSize);
}
