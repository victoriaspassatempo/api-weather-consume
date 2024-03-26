package com.mycompany.weatherapiconsumer.model;

import java.util.Locale;

public class Main {

    private double temp;
    private double temp_min;
    private double temp_max;

    // convertendo diretamente para Celsius
    public double getTemp() {
        double tempCelsius =  temp - 273.15;
        return Double.parseDouble(String.format(Locale.US, "%.2f", tempCelsius));

    }

    public double getTemp_min() {
        double tempCelsius = temp_min - 273.15;
        return Double.parseDouble(String.format(Locale.US, "%.2f", tempCelsius));

    }

    public double getTemp_max() {
        double tempCelsius = temp_max - 273.15;
        return Double.parseDouble(String.format(Locale.US, "%.2f", tempCelsius));
    }

}

