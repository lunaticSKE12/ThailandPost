package com.example.mr_ja.thailandpost;

import java.io.Serializable;

/**
 * Created by Mr_Ja on 12/1/2017.
 */

public class Goods{

    private int exchange_item;
    private int balance_item;

    public Goods(int exchange_item, int balance_item) {
        this.exchange_item = exchange_item;
        this.balance_item = balance_item;
    }

    public Goods() {
        this.exchange_item = 30;
        this.balance_item = 100;
    }

    public int getExchange_item() {
        return exchange_item;
    }

    public void setExchange_item(int exchange_item) {
        this.exchange_item = exchange_item;
    }

    public int getBalance_item() {
        return balance_item;
    }

    public void setBalance_item(int balance_item) {
        this.balance_item = balance_item;
    }

    public String exchange_toString() {
        return Integer.toString(exchange_item);
    }

    public String balance_toString(){
        return Integer.toString(balance_item);
    }

    public void update_goods(){
        this.exchange_item--;
        this.balance_item--;
    }
}
