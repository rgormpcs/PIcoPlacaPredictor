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
    public void canbeOnRoadTest(){
        Vehicle vehicle = new Vehicle("pbo123");
        
        Assertions.assertEquals("el auto con placas pbo123 no puede circular", vehicleImplements.getRestrictedDay(vehicle));
    }
}
