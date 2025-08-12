package com.codepipes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasketWeightTest {

    @Test
    public void oneItem() {
        BasketWeightCalculator weightCalculator = new BasketWeightCalculator();
        weightCalculator.addItem(5);

        assertEquals("Expected 5", 5, weightCalculator.getTotalWeight());
    }

    @Test
    public void twoItems() {
        BasketWeightCalculator weightCalculator = new BasketWeightCalculator();
        weightCalculator.addItem(5);
        weightCalculator.addItem(13);

        assertEquals("Expected 18", 18, weightCalculator.getTotalWeight());
    }

    @Test
    public void orderDoesNotMatter() {
        BasketWeightCalculator weightCalculator1 = new BasketWeightCalculator();
        weightCalculator1.addItem(5);
        weightCalculator1.addItem(13);

        BasketWeightCalculator weightCalculator2 = new BasketWeightCalculator();
        weightCalculator2.addItem(13);
        weightCalculator2.addItem(5);

        assertEquals("Expected 18", 18, weightCalculator1.getTotalWeight());
        assertEquals("Expected 18", 18, weightCalculator2.getTotalWeight());
    }
}