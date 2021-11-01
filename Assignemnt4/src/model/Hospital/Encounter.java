/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;
import model.Hospital.VitalSigns;
import java.util.Date;

/**
 *
 * @author kiranreddy
 */
public class Encounter implements Comparable<Encounter>{
    
    
    private Date encounterDate;
    VitalSigns vss;
    int personId;

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public int getAge(){
        return this.vss.getAge();
    }
    public int getBp(){
        return this.vss.getBp();
    }

    public int getTemperature(){
        return this.vss.getTemperature();
    }
    
    
    public Encounter(VitalSigns vss, Date encounterDate, int personId){
        this.vss = vss;
        this.encounterDate = encounterDate;
        this.personId = personId;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.vss.getAge());
    }
    
    @Override
    public int compareTo(Encounter ecc){
        int last = this.encounterDate.compareTo(ecc.encounterDate);
        return last;
    }
    
}
