package com.example.basket.controller;

import com.example.basket.model.Baskett;
import com.example.basket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addBasketItem(@RequestParam int item){
        basketService.addBasket(item);
    }

    @GetMapping("/get")
    public List<Integer> getBasketItems(){
        return basketService.getBasket();
    }
}
