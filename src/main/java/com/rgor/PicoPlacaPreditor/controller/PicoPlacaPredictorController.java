/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.rgor.PicoPlacaPreditor.controller;


import com.rgor.PicoPlacaPreditor.DAO.VehicleImplements;
import com.rgor.PicoPlacaPreditor.DAO.VehicleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.rgor.PicoPlacaPreditor.Entity.Vehicle;
import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;

/**
 *
 * @author rortiz
 */
@RestController
@RequestMapping("/")
public class PicoPlacaPredictorController {
    
    VehicleInterface vehicleInterface= new VehicleImplements();
  

    @GetMapping("/predict/{plate}/{date}/{time}")
    public String get(@PathVariable String plate, String date,String time) {
       Vehicle vehicle = new Vehicle(plate);
       MomentRestricted  moment = new MomentRestricted(date, time);
        
        return vehicleInterface.getRestrictedDay(vehicle);
    }
    
    
}
