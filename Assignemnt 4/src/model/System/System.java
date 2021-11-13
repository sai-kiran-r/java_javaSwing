/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.System;

import java.util.ArrayList;
import model.Address.City;
import model.Address.CityDirectory;
import model.Address.HouseDirectory;
import model.Patient.PatientDirectory;
import model.Person.PersonDirectory;

/**
 *
 * @author kiranreddy
 */
public class System {
    
    
    
    public PersonDirectory personDirectory;
    public PatientDirectory patientDirectory;
    public CityDirectory cityDirectory;
    public HouseDirectory houseDirectory;
    
    public System(){
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory(personDirectory);
        cityDirectory = new CityDirectory();
        houseDirectory = new HouseDirectory();
    }
}

