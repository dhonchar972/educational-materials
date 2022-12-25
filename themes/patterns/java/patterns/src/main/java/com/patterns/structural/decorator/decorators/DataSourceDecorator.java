package com.patterns.structural.decorator.decorators;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class DataSourceDecorator implements DataSource {
    private final DataSource target;

    DataSourceDecorator(DataSource source) {
        this.target = source;
    }

    @Override
    public void writeData(String data) {
        target.writeData(data);
    }

    @Override
    public String readData() {
        return target.readData();
    }
}
