/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class VitalSigns {
    private double Temperature;
    private double Bloodpressure;
    private int Pulse;
    private String Date;

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public double getBloodpressure() {
        return Bloodpressure;
    }

    public void setBloodpressure(double Bloodpressure) {
        this.Bloodpressure = Bloodpressure;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    @Override
    public String toString(){
        return  Date;
    }
    

    }
    
    
    

