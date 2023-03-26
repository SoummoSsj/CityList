package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This deletes a city to the list if that city exists
     * throws exceptions if city doesn't exist
     * @param city
     *      This is the city to delete
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * This gives the number of cities
     * @return count of cities
     *      This is the city to delete
     */

    public int count() {

       return cities.size();
    }
    /**
     * This gives the sorted cityList based on city or province
     * @param int city
     *            this chooses whether to sort by city or province(1 for city and 2 for province)
     * @return cityList
     *      This returns the cityList
     */


    public List<City> getCities(int city) {
        List<City> cityList = cities;
        if(city==1)
        {Collections.sort(cityList);

        }
        else
        {
          Collections.sort(cityList, new Comparator<City>() {
              @Override
              public int compare(City city, City o1) {
                  return city.getProvinceName().compareTo(o1.getProvinceName());
              }
          });
        }
        return cityList;
    }


}
