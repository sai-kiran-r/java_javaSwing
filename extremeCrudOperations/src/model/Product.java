/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kiranreddy
 */
public class Product {
//    private boolean CarAvaliablity;
    private String CarAvaliablity;
    private int carCount;
    private String carCompany;
    private int carYear;
    private int carSeats;
    private int carSerialnum;
    private String carModelnum;
    private String carCity;
    private String carExpired;
    public static Set<Integer> unSerial = new HashSet<Integer>(); 

    public String getCarAvaliablity() {
        return CarAvaliablity;
    }

    public void setCarAvaliablity(String CarAvaliablity) {
        this.CarAvaliablity = CarAvaliablity;
    }

    
    public String getCarExpired() {
        return carExpired;
    }

    public void setCarExpired(String carExpired) {
        this.carExpired = carExpired;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
    }

    public int getCarSerialnum() {
        return carSerialnum;
    }

    public void setCarSerialnum(int carSerialnum) {
        this.carSerialnum = carSerialnum;
    }

    public String getCarModelnum() {
        return carModelnum;
    }

    public void setCarModelnum(String carModelnum) {
        this.carModelnum = carModelnum;
    }


    public String getCarCity() {
        return carCity;
    }

    public void setCarCity(String carCity) {
        this.carCity = carCity;
    }

//    public int getCarExpired() {
//        return carExpired;
//    }
//
//    public void setCarExpired(int carExpired) {
//        this.carExpired = carExpired;
//    }

//    public boolean isCarAvaliablity() {
//        return CarAvaliablity;
//    }
//
//    public void setCarAvaliablity(boolean CarAvaliablity) {
//        this.CarAvaliablity = CarAvaliablity;
//    }
    public Product(){
        
    }
    public Product( 
     String carCompany, int carYear, int carSeats, int carSerialnum, String carModelnum,
     String CarAvaliablity, String carCity, String carExpired){
        this.carCompany = carCompany;
        this.carYear = carYear;
        this.carSeats = carSeats;
        this.carSerialnum = carSerialnum;
        this.carModelnum = carModelnum;
        this.CarAvaliablity = CarAvaliablity;
        this.carCity = carCity;
        this.carExpired = carExpired;
        
}
    
    @Override
    public String toString(){
        return carCompany;
    }
    
}
