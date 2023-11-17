package com.example.gestaocantinas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MealTest {

    @Test
    public void testMealCreation() {
        Meal meal = new Meal(1, "Fish Dish", "Soup + dish", 12.99);

        assertNotNull(meal);
        assertEquals(1, meal.getId());
        assertEquals("Fish Dish", meal.getName());
        assertEquals("Soup + dish", meal.getType());
        assertEquals(12.99, meal.getPrice(), 0.01);
    }
}
