/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rgor.PicoPlacaPreditor;

import com.rgor.PicoPlacaPreditor.DAO.MomentRestrictedImplements;
import com.rgor.PicoPlacaPreditor.DAO.MomentRestrictedInterface;
import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author rortiz
 */
@SpringBootTest
public class verifyRestrictedTimeTest {
    MomentRestrictedInterface momentRestrictedInterface= new MomentRestrictedImplements();
    
     @Test
    public void verifyRestrictedTimeTest(){
        MomentRestricted moment = new MomentRestricted("05/02/2020", "8:59");
         Assertions.assertEquals(true, momentRestrictedInterface.restrictedTime(moment));
         MomentRestricted moment2 = new MomentRestricted("05/02/2020", "16:00");
         Assertions.assertEquals(true, momentRestrictedInterface.restrictedTime(moment2));
    }
     @Test
      public void verifyNORestrictedTimeTest(){
        MomentRestricted moment = new MomentRestricted("05/02/2020", "10:00");
         Assertions.assertEquals(false, momentRestrictedInterface.restrictedTime(moment));
         MomentRestricted moment2 = new MomentRestricted("05/02/2020", "15:59");
         Assertions.assertEquals(false, momentRestrictedInterface.restrictedTime(moment2));
    }
}
