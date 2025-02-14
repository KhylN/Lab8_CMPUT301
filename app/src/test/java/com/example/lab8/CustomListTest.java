package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        City city = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Charlottetown", "Prince Edward Island");
        assertTrue(city.getClass() == city2.getClass());
    }

    @Test
    void testDeleteCity() {
        CustomList cityList = MockCityList();
        assertEquals(1,cityList.getCities().size());
        cityList.deleteCity(cityList.getCities().get(0));
        assertEquals(0,cityList.getCities().size());
    }


}
