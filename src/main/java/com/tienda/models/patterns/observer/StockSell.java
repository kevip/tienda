package com.tienda.models.patterns.observer;

import com.tienda.models.Stock;

public class StockSell implements Observer{
    private Stock stock;
    private double sellPrice;

    public StockSell(Stock stock, double sellPrice) {
        this.stock = stock;
        this.sellPrice = sellPrice;
        stock.add(this);
    }

    public void update() {
        if(stock.getPrice() >= sellPrice) {
            System.out.println("Puedes vender el producto" + stock.getProduct());
        } else {
            System.out.println("No puedes vendera un precio menor de S/." + sellPrice);
        }
    }
}
