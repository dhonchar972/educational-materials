package com.patterns.creational.builder;

import com.patterns.creational.builder.builders.CarBuilder;
import com.patterns.creational.builder.builders.CarManualBuilder;
import com.patterns.creational.builder.cars.Car;
import com.patterns.creational.builder.cars.Manual;
import com.patterns.creational.builder.director.Director;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
