package Semaphore.light.e27;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Semaphore.util.TurnOnOff;

class E27LightBulbTest {
	@Test
	void shouldTurnOn() {
		//given
		TurnOnOff light = new E27LightBulb();
		//do action
		light.turnOff();
		light.turnOn();
		//check
		assertTrue(light.isOn());
	}

}
