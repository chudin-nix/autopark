package org.training.autopark.model;

    public class TruckCar extends AbstractCar {
        // Ниже мы храним в переменных ширину, высоту и длину грузового автомобиля
        private int carSizeWidth;
        private int carSizeHeight;
        private int carSizeLength;

        public TruckCar(String name, double loadСapacity, int cost, Color color, int carSizeWidth, int carSizeHeight, int carSizeLength) {
            super(name, loadСapacity, cost);
            this.setColor(color);
            this.setCarSizeWidth(carSizeWidth);
            this.setCarSizeHeight(carSizeHeight);
            this.setCarSizeLength(carSizeLength);

        }

        // Ниже методы гетторы и сетторы для установления и получения значений переменных
        public void setCarSizeWidth (int carSizeWidth) {
            carSizeWidth = carSizeWidth;
        }

        public int getCarSizeWidth () {

            return carSizeWidth;
        }

        public void setCarSizeHeight (int carSizeHeight) {
            carSizeHeight = carSizeHeight;
        }

        public int getCarSizeHeight () {
            return carSizeHeight;
        }

        public void setCarSizeLength (int carSizeLength) {
            carSizeLength = carSizeLength;
        }

        public int getCarSizeLength () {
            return carSizeLength;
        }
    }