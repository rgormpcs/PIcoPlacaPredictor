/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.rgor.PicoPlacaPreditor.controller;

import com.rgor.PicoPlacaPreditor.DAO.MomentRestrictedImplements;
import com.rgor.PicoPlacaPreditor.DAO.MomentRestrictedInterface;
import com.rgor.PicoPlacaPreditor.DAO.VehicleImplements;
import com.rgor.PicoPlacaPreditor.DAO.VehicleInterface;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.rgor.PicoPlacaPreditor.Entity.Vehicle;
import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;

/**
 * @author rortiz
 */
@RestController
@RequestMapping("/")
public class PicoPlacaPredictorController {

    VehicleInterface vehicleInterface = new VehicleImplements();

    @ApiOperation(value = "Pico y placa Predictor", notes = "Returns whether or not vehicle can be on the road" +
            "\n Example:" +
            "\n date: dd/MM/yyyy" +
            "\n plate: ABCD0123"+
            "\n time: 00:59")

    @GetMapping("/predict/{plate}/{date}/{time}")
    public String canBeOntheRoad( String plate, String date, String time) {
        String message = "";
        Vehicle vehicle = new Vehicle(plate);

        MomentRestricted moment = new MomentRestricted(date, time);
        MomentRestrictedInterface momentRestrictedInterface = new MomentRestrictedImplements();
        VehicleInterface vehicleInterface = new VehicleImplements();
        if ((vehicleInterface.getRestrictedDay(vehicle).equals(momentRestrictedInterface.dayOfMomentRestricted(moment))) && (momentRestrictedInterface.isRestrictedTime(moment))) {
            message = "El vehiculo con placas " + vehicle.getPlate() + " no puede circular";
        } else {
            message = "El vehiculo con placas " + vehicle.getPlate() + " puede circular";
        }
        return message;
    }

}
