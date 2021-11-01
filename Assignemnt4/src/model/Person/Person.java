/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Person;
import java.util.ArrayList;
import model.Address.City;
import model.Address.House;
import model.Hospital.Encounter;
import model.Hospital.EncounterHistory;

/**
 *
 * @author kiranreddy
 */
public class Person {
    private String personFirstName;
    private String personLastName;
    private String personAddress;
    private int personId;
    private String community;
    private String city;
    
    private EncounterHistory encounterHistory;
    
    public Person(String firstName, String lastName, String address, Integer id,
                   String community, String city){
        this.personFirstName = firstName;
        this.personLastName = lastName;
        this.personAddress = address;
        this.personId = id;
        this.community = community;
        this.city = city;
        this.encounterHistory = new EncounterHistory();
    }
    
    public Person(String firstName, String lastName, String address, Integer id){
        this.personFirstName = firstName;
        this.personLastName = lastName;
        this.personAddress = address;
        this.personId = id;
        this.encounterHistory = new EncounterHistory();
    }


    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public int getPersonId() {
        return personId;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    
    
    public void addEncounter(Encounter ecc){
        this.encounterHistory.addEncounter(ecc);
    }
    
    public void deleteEncounter(Encounter ecc){
        this.encounterHistory.deleteEncounter(ecc);
    }
    
    public ArrayList<Encounter> getEncounterHistory(){
        return this.encounterHistory.viewEncounters();
    }
    
    
    @Override
    public String toString(){
        return personFirstName;
    }
    
}

 

