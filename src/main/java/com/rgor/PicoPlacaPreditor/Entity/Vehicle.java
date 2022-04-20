package com.rgor.PicoPlacaPreditor.Entity;

import lombok.Data;

@Data
public class Vehicle {
    private String plate;
    private Boolean beOnTheRoad;

    public void Vehicle(String plate){
        this.plate=plate;
    }

}
