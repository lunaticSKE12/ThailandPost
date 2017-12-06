package com.example.mr_ja.thailandpost;

import android.content.Intent;

import java.io.Serializable;

/**
 * Created by Napong Dungduangsasitorn on 12/1/2017.
 *
 * Goods is product in store.
 */

public class Goods{

    private int exchange_item = 0;
    private int balance_item = 0;
    private int serial = 0;

    /**
     * Goods constructor
     * @param exchange_item is number of exchange item in store.
     * @param balance_item is number of balance item in store.
     */
    public Goods(int exchange_item, int balance_item, int serial) {
        this.exchange_item = exchange_item;
        this.balance_item = balance_item;
        this.serial = serial;
    }

    public Goods() {
        this.exchange_item = 30;

        this.balance_item = 100;
        this.serial = 7392;
    }


    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    /**
     * getExchange_item for get number of exchange item in store.
     * @return number of exchange item.
     */
    public int getExchange_item() {
        return exchange_item;
    }

    /**
     * setExchange_item for set number in exchange item,
     * @param exchange_item number for set number in exchange item.
     */
    public void setExchange_item(int exchange_item) {
        this.exchange_item = exchange_item;
    }

    /**
     * getBalance_item for get number of balance item in store.
     * @return number of balance item.
     */
    public int getBalance_item() {
        return balance_item;
    }

    /**
     * setBalance_item for set number in balance item,
     * @param balance_item number for set number in balance item.
     */
    public void setBalance_item(int balance_item) {
        this.balance_item = balance_item;
    }

    /**
     * exchange_toString prase integer of exchange_item to string.
     * @return string number of exchange_item.
     */
    public String exchange_toString() {
        return Integer.toString(exchange_item);
    }

    /**
     * balance_toString prase integer of balance_item to string.
     * @return string number of balance_item.
     */
    public String balance_toString(){
        return Integer.toString(balance_item);
    }

    public String serial_toString() {return Integer.toString(serial); }

    /**
     * update_goods is for update exchange_item and balance_item in store.
     */
    public void update_goods(){
        this.exchange_item--;
        this.balance_item--;
        this.serial++;
    }
}
