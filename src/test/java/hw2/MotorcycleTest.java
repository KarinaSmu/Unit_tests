package hw2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MotorcycleTest {
    @Test
    void motorcycleInstanceIsVehicleInstance() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Sportster", 2022);
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Sportster", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void motorcycleTestDriveSetsSpeedTo75() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Sportster", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void motorcycleParkSetsSpeedToZero() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Sportster", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}

