package com.example.gestaocantinas;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReservationServiceTest {

    private ReservationService reservationService;

    @Before
    public void setUp() {
        reservationService = new ReservationService();
    }

    @Test
    public void testCreateReservation() {
        User user = new User(1, "John Doe", "123456", "employee");
        Meal meal = new Meal(1, "Fish Dish", "Soup + dish", 12.99);

        Meal reservedMeal = reservationService.createReservation(user, meal);

        assertNotNull(reservedMeal);
        assertEquals(meal.getName(), reservedMeal.getName());
    }

    @Test
    public void testGetReservation() {
        // Assuming some logic to get reservation by ID
        Meal retrievedMeal = reservationService.getReservation(1);

        // For simplicity, we are assuming that the retrieved meal is not null
        assertNotNull(retrievedMeal);
    }
}

