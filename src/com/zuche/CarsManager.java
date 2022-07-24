package com.zuche;

import com.zuche.cheliang.BaseCar;
import com.zuche.cheliang.BenzCar;
import com.zuche.cheliang.BigTruck;
import com.zuche.cheliang.Buggy;
import com.zuche.cheliang.Minibus;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 7/24/22
 *
 * @author hehao
 */
public class CarsManager {

    private static List<BaseCar> allCars = new ArrayList<>();

    static {
        allCars.add(new BenzCar());
        allCars.add(new BigTruck());
        allCars.add(new Buggy());
        allCars.add(new Minibus());
    }

    public static List<BaseCar> getAllCars (){
        return allCars;
    }
}
