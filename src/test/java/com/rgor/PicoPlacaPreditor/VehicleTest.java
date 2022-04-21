package com.rgor.PicoPlacaPreditor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rgor.PicoPlacaPreditor.DAO.VehicleImplements;
import com.rgor.PicoPlacaPreditor.DAO.VehicleInterface;
import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;
import com.rgor.PicoPlacaPreditor.Entity.Vehicle;
/**
 *
 * @author rortiz
 */
@SpringBootTest
public class VehicleTest {

    VehicleInterface vehicleImplements = new VehicleImplements();
    @Test
    public void getDayRestriction(){
        Vehicle vehicle = new Vehicle("pbo127");
        
        Assertions.assertEquals("Jueves", vehicleImplements.getRestrictedDay(vehicle));
    }
}
