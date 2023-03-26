package com.example.citylist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "AB");
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities(1).size());

        City city = new City("Regina", "SK");
        cityList.add(city);

        assertEquals(2, cityList.getCities(1).size());
        assertTrue(cityList.getCities(1).contains(city));
    }

    @Test
    public void testAddException() {
        CityList cityList = new CityList();
        City city = mockCity();
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }


    @Test
    public void testdelete(){
        CityList cityList = new CityList();
        City city = new City("Jessore","Khulna");
        City city2 = new City("Mirpur","Dhaka");

        cityList.add(city);
        cityList.add(city2);

        cityList.delete(city);
        assertTrue(!cityList.getCities(1).contains(city));
        assertEquals(1,cityList.getCities(1).size());

    }
    @Test
    public void testdeleteexception(){
        CityList cityList = new CityList();
        City city = new City("Jessore","Khulna");
        City city2 = new City("Mirpur","Dhaka");

        cityList.add(city);
        cityList.add(city2);

        cityList.delete(city);
       assertThrows(IllegalArgumentException.class ,()-> {
           cityList.delete(city);
       });

    }
    @Test
    public void testCount(){
        CityList cityList = new CityList();
        City city = new City("Jessore","Khulna");
        City city2 = new City("Mirpur","Dhaka");

        cityList.add(city);
        cityList.add(city2);


        assertEquals(2,cityList.count());
        cityList.delete(city);
        assertEquals(1,cityList.count());


    }
    @Test
    public void testSortCities() {
        CityList cityList = new CityList();


        City city1 = new City("Charlottetown", "England");
        City city2 = new City("Dakota", "America");
        cityList.add(city1);
        cityList.add(city2);

        assertEquals(0, city1.compareTo(cityList.getCities(1).get(0)));//city sort
        assertEquals(0, city2.compareTo(cityList.getCities(2).get(0)));//province sort
    }

}
