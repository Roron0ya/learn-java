package com.zuche.com.cheliang;

/**
 * Date: 7/22/22
 *
 * @author hehao
 */
public class BenzCar extends BaseCar {

    public BenzCar(){
        super(200,6,"benchi");
    }

    public BenzCar(int price,int size){
        super(price,size,"benchi");
    }


    public String print(){
        return this.getName() + ":" + this.getPrice() + ":"+ this.getSize();
    }

    public static void main(String[] args) {
        BenzCar benzCar = new BenzCar();
        System.out.println(benzCar);
        BenzCar benzCar2 = new BenzCar(400,7);
        System.out.println(benzCar2.print());
        benzCar2.setPrice(300);
        System.out.println(benzCar2);

    }
}
