package com.tienda.models.patterns.observer;

import com.tienda.models.Stock;

public class StockPrint implements Observer {
    private Stock stock;

    public StockPrint(Stock stock) {
        this.stock = stock;
        stock.add(this);
    }

    public void update() {
        System.out.print("Intentando vender" + stock.getProduct() + "por S/." + stock.getPrice());
    }
}
