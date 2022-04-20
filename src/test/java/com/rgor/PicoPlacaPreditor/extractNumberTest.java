/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rgor.PicoPlacaPreditor;

import com.rgor.PicoPlacaPreditor.DAO.VehicleImplements;
import com.rgor.PicoPlacaPreditor.DAO.VehicleInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author rortiz
 */
@SpringBootTest
public class extractNumberTest {
    VehicleInterface vehicleInterface = new VehicleImplements();
    @Test
    public void extractNumberTest(){
        Assertions.assertEquals("1",vehicleInterface.extractNumberPlate("BPO0321"));     
    }
    @Test
    public void extractNumberTestFail(){
        Assertions.assertEquals("No es un numero de placa permitido debe tener el formato EJ : AAA 0123",vehicleInterface.extractNumberPlate("BPO0321B"));     
    }
}