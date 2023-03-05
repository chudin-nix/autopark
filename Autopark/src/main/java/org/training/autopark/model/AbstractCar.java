package org.training.autopark.model;

public class AbstractCar {
        // Перемененные, в которых мы храним общие свойства машин
        private String name;
        private Color color;
        private double loadСapacity;
        private int cost;

        public AbstractCar (String name, double loadСapacity, int cost) {
            this.name = name;
            this.loadСapacity = loadСapacity;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        // Ниже методы, сеттор и геттор для установления и получения значений переменной color
        public void setColor (Color candyColor) {

            color = candyColor;
        }
        public Color getColor () {

            return color;
        }
        //Ниже методы, сеттор и геттор для установления и получения значения переменной loadСapacity
        public void setLoadСapacity (double carLoadСapacity) {

            loadСapacity = carLoadСapacity;
        }
        public double getLoadСapacity () {

            return loadСapacity;
        }
        //Ниже методы, сеттор и геттор для установления и получения значения переменной cost
        public void setCost (int carCost) {

            cost = carCost;
        }
        public int getCost () {

            return cost;
        }
    }
