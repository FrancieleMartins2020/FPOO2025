package Semaphore.light.spot;

import Semaphore.light.e27.E27LightBulb;
import Semaphore.spot.SpotLight;
import Semaphore.light.e27.AbstractLightE27;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpotLightTest {

	@Test
	void shouldTurnOn() {
		//given
		AbstractLightE27 light = new E27LightBulb();
		SpotLight spot = new SpotLight(null);
		spot.setLight(light);
		
		//do action
		light.turnOff();
		spot.turnOn();
		
		//check
		assertTrue(light.isOn());
		assertTrue(spot.isOn());
	}
}
