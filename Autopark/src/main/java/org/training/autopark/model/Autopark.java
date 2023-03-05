package org.training.autopark.model;

import java.util.ArrayList;
import java.util.List;

// создаем класс Autopark, в который будем передавать объекты-машины и вести подсчет грузоподъемности и стоимости
public class Autopark {

    private List<AbstractCar> cars;

    // конструктор при помощи которого мы создаем пустой список
    public Autopark () {
        cars = new ArrayList<>();
    }

    // создаем метод, с помощью которого мы наполняем List автомобилями
    public void add(AbstractCar car) {
        cars.add(car);
    }

    // метод для получения объектов автомобилей из этого класса
    public List<AbstractCar> getCars() {
        return cars;
    }

}