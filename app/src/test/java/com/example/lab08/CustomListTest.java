package com.example.lab08;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void hasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void deleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void countCities() {
        CustomList list = new CustomList();

        assertEquals(0, list.countCities());

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        assertEquals(2, list.countCities());

        list.deleteCity(calgary);

        assertEquals(1, list.countCities());

        list.deleteCity(edmonton);

        assertEquals(0, list.countCities());
    }
}
