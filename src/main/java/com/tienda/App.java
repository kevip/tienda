package com.tienda;

import com.tienda.models.Stock;
import com.tienda.models.patterns.observer.StockPrint;
import com.tienda.models.patterns.observer.StockSell;

public class App {

    public static void main( String[] args ) {
        Stock stock = new Stock("Samsung Galaxy S10", 1800);
        StockPrint print = new StockPrint(stock);
        StockSell sell = new StockSell(stock, 1999.99);//precio minimo de venta

        stock.setPrice(1850);
        stock.setPrice(1999.99);
        stock.setPrice(2000);
    }
}
