/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Patient;
import model.Address.House;
import model.Hospital.Encounter;
import model.Person.Person;
import model.Hospital.VitalSigns;

/**
 *
 * @author kiranreddy
 */
public class Patient extends Person {
    
    public Encounter patientEncount;
    
    
    public Patient(String firstName, String lastName, String address, int id, 
            String community, String city){
        super(firstName, lastName, address, id, community, city);
    }
    
    public Patient(String firstName, String lastName, Person p, Encounter ecc){
        super(firstName, lastName, p.getPersonAddress(), p.getPersonId());
        this.patientEncount = ecc;
    }
    
    public int getAge(){
        return patientEncount.getAge();
    }
    
    @Override
    public String toString(){
        return getPersonFirstName();
    }
}





