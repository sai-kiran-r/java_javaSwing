/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;
import java.util.ArrayList;

/**
 *
 * @author kiranreddy
 */
public class EncounterHistory {
    
    
    ArrayList<Encounter> EcountList;
    
    public EncounterHistory(){
        EcountList = new ArrayList<>();
    }
    public void addEncounter(Encounter ecc){
        EcountList.add(ecc);
    }
    public void deleteEncounter(Encounter ecc){
        EcountList.remove(ecc);
    }
    public void UpdateEncounter(Encounter ecc, int i){
        EcountList.set(i, ecc);
    }
    public ArrayList<Encounter> viewEncounters(){
        return EcountList;
    }
}

