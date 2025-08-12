package com.codepipes;

public class BasketWeightCalculator {

    private int totalWeight = 0;

    public void addItem(int itemWeight) // Assume weight is always an integer number
    {
        totalWeight = totalWeight + itemWeight;

        /* Feature request BWC-356. Weight can never be negative */
        if (totalWeight < 0) {
            totalWeight = 0;
        }
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}