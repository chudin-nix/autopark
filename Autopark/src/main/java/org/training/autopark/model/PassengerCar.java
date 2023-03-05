package org.training.autopark.model;

public class PassengerCar extends AbstractCar {
    // Ниже переменная, в которой мы храним цвет салона автомобиля
    private InteriorColor interiorColor;

    public PassengerCar(String name, double weight, int cost, Color color,InteriorColor interiorColor) {
        super(name, weight, cost);
        this.setColor(color);
        this.interiorColor = interiorColor;
    }

    // Ниже методы гетторы и сетторы для установления и получения значений переменной

    public void setInnerColor (InteriorColor carInnerColor) {

        interiorColor = carInnerColor;
    }

    public InteriorColor getInnerColor () {

        return interiorColor;
    }
}

