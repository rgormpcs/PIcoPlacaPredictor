package com.rgor.PicoPlacaPreditor.Entity;

import lombok.Data;

@Data
public class Vehicle {
    private String plate;
    private String restrictedDay;

 

    public  Vehicle(String plate){
        this.plate=plate;
    }

}
