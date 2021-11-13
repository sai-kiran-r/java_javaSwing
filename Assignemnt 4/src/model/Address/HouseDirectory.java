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
public class HouseDirectory {
    ArrayList<House> houseListing;
    
    
    public HouseDirectory(){
        houseListing = new ArrayList();
    }
    public void addNewHouse(House e){
        houseListing.add(e);
    }
    public void deleteNewHouse(int i){
        houseListing.remove(i);
    }
    public void updateHouseDetails(int i, House updateAddress){
        houseListing.set(i, updateAddress);
    }
}

