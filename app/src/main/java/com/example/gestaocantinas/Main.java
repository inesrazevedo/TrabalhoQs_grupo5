package com.example.gestaocantinas;

public class Main {
    public static void main(String[] args) {
        // Demonstrating the use of the code
        ReservationService reservationService = new ReservationService();
        AuthenticationService authService = new AuthenticationService();

        // Sample user registration
        authService.registerEmployee("employee1", "password123");

        // Sample user authentication
        boolean isAuthenticated = authService.authenticateUser("employee1", "password123");
        if (isAuthenticated) {
            User user = new User(1, "John Doe", "123456", "employee");
            Meal meal = new Meal(1, "Fish Dish", "Soup + dish", 12.99);

            // Creating a reservation
            Meal reservedMeal = reservationService.createReservation(user, meal);
            System.out.println("Reservation made for: " + reservedMeal.getName());
        }
    }
}
