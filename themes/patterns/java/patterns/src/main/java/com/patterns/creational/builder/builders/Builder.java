package com.patterns.creational.builder.builders;

import com.patterns.creational.builder.cars.CarType;
import com.patterns.creational.builder.components.Engine;
import com.patterns.creational.builder.components.GPSNavigator;
import com.patterns.creational.builder.components.Transmission;
import com.patterns.creational.builder.components.TripComputer;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
