package com.rgor.PicoPlacaPreditor;
import com.rgor.PicoPlacaPreditor.controller.PicoPlacaPredictorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

/**
 *
 * @author rortiz
 */
@SpringBootTest
class PicoPlacaPreditorApplicationTests {

	
    @Autowired
	private PicoPlacaPredictorController picoPlacaPredictorController;
	@Test
	void contextLoads() {
		Assertions.assertEquals("El vehiculo con placas pb0157 puede circular",picoPlacaPredictorController.canBeOntheRoad("pb0157","21/4/2022","15:00"));
	}

}
