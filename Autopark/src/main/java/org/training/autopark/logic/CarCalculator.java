package org.training.autopark.logic;

import org.training.autopark.model.AbstractCar;
import org.training.autopark.model.Autopark;

import java.util.List;

    public class CarCalculator {

        // метод для подсчета общей грузоподъемности
        public double calculateTotalCarLoadСapacity(Autopark autopark){
            List<AbstractCar> cars = autopark.getCars();
            double totalLoadСapacity = 0;
            for(int i = 0; i < cars.size(); i++) {
                AbstractCar car = cars.get(i);
                totalLoadСapacity = totalLoadСapacity + car.getLoadСapacity();
            }
            return totalLoadСapacity;
        }
        // метод для подсчета стоимости автомобилей
        public int calculateTotalPrice(Autopark autopark){
            List<AbstractCar> cars = autopark.getCars();
            int totalCost = 0;
            for(int i = 0; i < cars.size(); i++) {
                AbstractCar car = cars.get(i);
                totalCost = totalCost + car.getCost();
            }
            return totalCost;
        }
    }
