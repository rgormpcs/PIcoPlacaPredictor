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
        MomentRestricted moment = new MomentRestricted("05/02/2020", "7:00");
         Assertions.assertEquals(true, momentRestrictedInterface.isRestrictedTime(moment));
    }
    @Test
    public void verifyRestrictedTimeTest2(){
        MomentRestricted moment2 = new MomentRestricted("05/02/2020", "9:00");
        Assertions.assertEquals(true, momentRestrictedInterface.isRestrictedTime(moment2));
    }
    @Test
    public void verifyRestrictedTimeTest3(){
        MomentRestricted moment = new MomentRestricted("05/02/2020", "16:00");
        Assertions.assertEquals(true, momentRestrictedInterface.isRestrictedTime(moment));
    }
    @Test
    public void verifyRestrictedTimeTest4(){
        MomentRestricted moment2 = new MomentRestricted("05/02/2020", "19:30");
        Assertions.assertEquals(true, momentRestrictedInterface.isRestrictedTime(moment2));
    }
     @Test
      public void verifyNORestrictedTimeTest(){
        MomentRestricted moment = new MomentRestricted("05/02/2020", "9:31");
         Assertions.assertEquals(false, momentRestrictedInterface.isRestrictedTime(moment));
    }
    @Test
    public void verifyNORestrictedTimeTest2(){
        MomentRestricted moment2 = new MomentRestricted("05/02/2020", "15:59");
        Assertions.assertEquals(false, momentRestrictedInterface.isRestrictedTime(moment2));
    }
    @Test
    public void verifyNORestrictedTimeTest3(){
        MomentRestricted moment = new MomentRestricted("05/02/2020", "19:31");
        Assertions.assertEquals(false, momentRestrictedInterface.isRestrictedTime(moment));
    }
    @Test
    public void verifyNORestrictedTimeTest4(){
        MomentRestricted moment2 = new MomentRestricted("05/02/2020", "6:59");
        Assertions.assertEquals(false, momentRestrictedInterface.isRestrictedTime(moment2));
    }
}
