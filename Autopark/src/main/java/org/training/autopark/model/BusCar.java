package org.training.autopark.model;


public class BusCar extends AbstractCar {
    // Ниже переменная, в которой мы храним данные об автобусах
    private BusCarType carType;
    private Color color;

    public BusCar (String name, double loadСapacity, int cost, Color color, BusCarType carType) {
        super(name, loadСapacity, cost);
        this.color = color;
        this.carType = carType;
    }


    // Ниже метод сеттер и геттер для установления и получения значений переменной carType
    public void setCarType(BusCarType carType) {

        carType = carType;
    }

    public BusCarType getCarType() {

        return carType;
    }
    }
