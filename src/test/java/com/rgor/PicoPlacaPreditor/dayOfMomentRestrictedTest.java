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
public class dayOfMomentRestrictedTest {
    MomentRestrictedInterface momentRestrictedInterface= new MomentRestrictedImplements();
    @Test
    public void dayOfMomentRestrictedTest(){
        MomentRestricted momentRestricted= new MomentRestricted("21/04/2022","9:00");
        Assertions.assertEquals("Jueves", momentRestrictedInterface.dayOfMomentRestricted(momentRestricted));
    }

    @Test
    public void dayOfMomentRestrictedTest2(){
        MomentRestricted momentRestricted= new MomentRestricted("16/04/2022","9:00");
        Assertions.assertEquals("Sabado", momentRestrictedInterface.dayOfMomentRestricted(momentRestricted));
    }
}
