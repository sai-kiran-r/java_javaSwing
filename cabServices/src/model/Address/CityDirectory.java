/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

import java.util.ArrayList;

/**
 *
 * @author kiranreddy
 */
public class CityDirectory {
    
    ArrayList<City> cityList;
    
    public CityDirectory(){
        cityList = new ArrayList();
    }
    
    public CityDirectory(ArrayList<City> cityNames){
        cityList = cityNames;
    }

    public void addCity(String cityName){
        cityList.add(new City(cityName));
    }
    
    public ArrayList<String> getCityNames(){
        ArrayList<String> cityNames = new ArrayList<String>();
        for (City name : cityList){
            cityNames.add(name.getCityName());
        }
        return cityNames;
    }
    
}

