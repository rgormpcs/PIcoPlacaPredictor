package com.rgor.PicoPlacaPreditor.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Data
public class Vehicle {
    private String plate;
    private String restrictedDay;

    public  Vehicle(String plate){
        this.plate=plate;
    }

}
