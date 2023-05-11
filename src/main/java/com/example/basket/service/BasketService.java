package com.example.basket.service;

import java.util.List;

public interface BasketService {
    void addBasket(int item);

    List<Integer> getBasket();
}
