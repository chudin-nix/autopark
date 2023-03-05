package org.training.autopark;

import org.training.autopark.logic.CarCalculator;
import org.training.autopark.model.*;

public class Runner {
        public static void main(String[] args) {
        /* Мы собираем автопарк, он будет состоять из 4-х автомобилей. Ниже создаем 4 переменные классов
        BusCar, LightCommercialCar, PassengerCar, GrillageCandies и передадим в конструктор */

            BusCar oneBusCar = new BusCar("Youtong 45278", 12.5, 40, Color.BROWN, BusCarType.BIG);

            LightCommercialCar oneLightCommercialCar = new LightCommercialCar("Peugeot Boxer", 20, 7, Color.RED, 10 );

            PassengerCar onePassengerCar = new PassengerCar("Toyota Corolla", 1.1, 15, Color.GREEN,InteriorColor.BLACKWHITE);

            TruckCar oneTruckCar = new TruckCar("freightliner Cascadia", 23.4, 50, Color.YELLOW,5, 3,2);

            //Создаем объект класса Autopark для дальнейшего использования при подсчете грузоподъемности и общей стоимости автомобилей
            Autopark autopark = new Autopark();

            //Передаем в объект класса Autopark объекты автомобилей
            autopark.add(oneBusCar);
            autopark.add(oneLightCommercialCar);
            autopark.add(onePassengerCar);
            autopark.add(oneTruckCar);

            //Создаем объект класса CarCalculator для дальнейшего подсчета грузоподъемности и общей стоимости автомобилей
            CarCalculator calculator = new CarCalculator();

            //Подсчитываем общий вес
            double loadСapacity = calculator.calculateTotalCarLoadСapacity(autopark);

            //Подсчитываем стоимость подарка
            int totalCost = calculator.calculateTotalPrice(autopark);

        }

    }