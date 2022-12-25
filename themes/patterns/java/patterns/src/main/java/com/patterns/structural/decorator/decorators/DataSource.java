package com.patterns.structural.decorator.decorators;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
