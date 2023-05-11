package com.example.basket.service;

import com.example.basket.model.Baskett;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

 private final List<Integer> baskettList = new ArrayList<>();
    @Override
    public void addBasket(int item) {
       baskettList.add(item);
    }

    @Override
    public List<Integer> getBasket() {
        return baskettList;
    }
}
