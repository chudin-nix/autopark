package org.training.autopark.model;

    public class LightCommercialCar extends AbstractCar {
        // Ниже переменная, в которой мы храним % тонировки стекол
        private int toning;

        public LightCommercialCar(String name, double loadСapacity, int cost, Color color, int toning) {
            super(name, loadСapacity, cost);
            this.setColor(color);
            this.toning = toning;
        }

        // Ниже методы сеттер и геттр для установления и получения значений переменной toning
        public void setToning (int carToning) {
            toning = carToning;
        }
        public int getToning () {
            return toning;
        }
    }