/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import model.Hospital.Encounter;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author kiranreddy
 */
public class PatientDirectory {
    
    public ArrayList<Patient> patientList;
    PersonDirectory personDirectory;
    
    
    public final int minBloodPressure = 50;
    public final int maxBloodPressure = 180;
    public final int minTemperature = 85;
    public final int maxTemperature = 120;
    
    
    public PatientDirectory(PersonDirectory personDirectory){
        patientList = new ArrayList<Patient>();
        this.personDirectory = personDirectory;
    }
    
    public void addPatient(Patient pa){
        patientList.add(pa);
    }
    
    
    public void removePatient(Patient pa){
        patientList.remove(pa);
        
    }
    
    
    public void UpdatePatient(Patient pa, int i){
        patientList.set(i, pa);
    }
    
    public ArrayList<Patient> getPatientList(){
    LinkedHashSet<Patient> hashSet = new LinkedHashSet<>(patientList);
    ArrayList<Patient> listWithoutDuplicates = new ArrayList<>(hashSet);
    return listWithoutDuplicates;
    }
    
    public boolean populatePatients(){
        for(Person p : personDirectory.getPersonList()){
            
        System.out.println(p.getCommunity());
        System.out.println(this.personDirectory.getPersonData(p.getPersonId()).getCommunity());
        
            ArrayList<Encounter> encounterArray = p.getEncounterHistory();
            Collections.sort(encounterArray);
            int encHistorySize = encounterArray.size();
            if(encHistorySize ==0) continue; 
            Encounter ecc = encounterArray.get(encHistorySize-1);
            
            if(ecc.getBp() >= maxBloodPressure || 
               ecc.getBp() <= minBloodPressure ||
               ecc.getTemperature() >= maxTemperature || 
               ecc.getTemperature() <= minTemperature)
            {
                this.removePatient(p);
                patientList.add(new Patient(p.getPersonFirstName(),p.getPersonLastName(), p, ecc));
                System.out.println(this.patientList);
            }
            else
            {
                this.removePatient(p);
//                Iterator<Patient> it = patientList.iterator();
//                while(it.hasNext()){
//                    int personId = it.next().getPersonId();
//                    if(personId == p.getPersonId()){
//                        it.remove();
//                        
//                    }
//                }
            }
            
        }
        return true;
    }
    
        private void removePatient(Person p){
            Iterator<Patient> itr = patientList.iterator();
            while(itr.hasNext()){
                int id = itr.next().getPersonId();
                if(id == p.getPersonId()){
                    itr.remove();
                }
            }
        }

    
    
}



