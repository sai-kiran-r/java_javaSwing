/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;

/**
 *
 * @author kiranreddy
 */
public class VitalSigns {
 
    
    private int temperature;
    private int age;
    private int bp;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }
    
    public VitalSigns(int temperature, int age, int bp){
        this.temperature = temperature;
        this.age = age;
        this.bp = bp;
    }
    
}



