package com.zuche.com.cheliang;

/**
 * Date: 7/22/22
 *
 * @author hehao
 */
public class BaseCar {
    /**
     * rizujin
     */
    public int price;
    /**
     * zaikeliang
     */
    public int size;
    /**
     * the name of the car
     */
    public String name;

    public BaseCar(int price, int size, String name) {
        this.price = price;
        this.size = size;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
