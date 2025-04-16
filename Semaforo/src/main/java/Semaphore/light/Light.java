package Semaphore.light;

import Semaphore.light.util.TurnOnOff;

public interface Light extends TurnOnOff {
	enum OnOff {ON, OFF};
	void turnOn();
	void turnOff();

	boolean isOn();
	boolean isOff();
}
