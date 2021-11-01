/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;
import model.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author kiranreddy
 */
public class House {
    
    private int houseNum;
    private String street;
    public ArrayList<Person> personList;



    public House(int houseNum, String street){
        this.houseNum = houseNum;
        this.street = street;
        this.personList = new ArrayList<Person>();
    }
    
    
    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    
     
}