/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Person;
import java.util.ArrayList;
import model.Hospital.Encounter;

/**
 *
 * @author kiranreddy
 */
public class PersonDirectory {
    ArrayList<Person> personList;
    
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }
    
    public void addPerson(Person P){
        personList.add(P);
    }
    
    public void UpdatePersonDetails(Person p, int i){
        personList.set(i, p);
    }
//    public void removePerson(Person p){
//        personList.remove(p);
//    }
    
    public void DeletePersonDetails(Person p){
        personList.remove(p);
    }
    
    
    public ArrayList<Person> getPersonList(){
        return personList;
    }
    
    
    public Person getPersonData(int personId){
        int ind = 0;
        int i =0;
        for(i=0; i < this.personList.size(); i++)
        {
            if(personList.get(i).getPersonId() == personId)
            {
                ind = i;
                break;
            }
        }
        return personList.get(ind);
    }
    
    public void AddEncounterForPerson(int personId, Encounter ecc){
        int ind = 0;
        int i = 0;
        for(i = 0; i < this.personList.size(); i++)
        {
            if(personList.get(i).getPersonId() == personId)
            {
                ind = i;
                break;
            }
        }
        personList.get(ind).addEncounter(ecc);
    }
    
    
    
}


