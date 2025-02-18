package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCardService {
    /*
     * 添加购物车
     * param shoppingCardDto
     */
    void addShoppCard(ShoppingCartDTO shoppingCartDTO);
    /*
    * 查看购物车
    * */

    List<ShoppingCart> showShoppingCart();
}
