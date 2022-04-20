package com.rgor.PicoPlacaPreditor;

import com.rgor.PicoPlacaPreditor.Interface.VehicleImplements;
import com.rgor.PicoPlacaPreditor.Interface.VehicleInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleTest {

    VehicleImplements vehicleImplements = new VehicleImplements();
    @Test
    public void canbeOnRoadTest(){
        Assertions.assertEquals("el auto con placas pbo123", vehicleImplements.camBeOnTHeRoad("pbo123"));
    }
}
