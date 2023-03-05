package org.training.autopark;

import org.junit.Assert;
import org.junit.Test;
import org.training.autopark.logic.CarCalculator;
import org.training.autopark.model.Autopark;
import org.training.autopark.model.BusCar;
import org.training.autopark.model.BusCarType;
import org.training.autopark.model.Color;

public class CarCalculatorTest {
    @Test
    public void testCalculateTotalWeight(){
        //given
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator();

        //when
        double result = calculator.calculateTotalCarLoadСapacity(autopark);

        //then
        Assert.assertEquals(1.0, result, 0.01);
    }

    @Test
    public void testCalculateTheCostOfGift(){
        //given
        Autopark autopark = new Autopark();
        BusCar bus = new BusCar("Beautiful", 1.0, 4, Color.RED, BusCarType.BIG);
        autopark.add(bus);
        CarCalculator calculator = new CarCalculator();

        //when
        int result = calculator.calculateTotalPrice(autopark);

        //then
        Assert.assertEquals(4, result);
    }
}