package Semaphore.light.spot;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import Semaphore.light.Light;
import Semaphore.light.e27.AbstractLightE27;
import Semaphore.light.util.TurnOnOff;

public class SpotLight implements TurnOnOff{
	private Light light;
	private Image mask;
	
	private Point position = new Point(0,0);
	private Dimension dimension = new Dimension(20,20);
	
	public SpotLight (Image mask) {
		this.mask = mask;
	}
	public void setLight (AbstractLightE27 light) {
		this.light = light;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isOff() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setPosition(int xLeft, int yTop) {
		this.position = new Point( xLeft, yTop);
	}
	
	public Point getPosition() {
		return (Point) this.position.clone();
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension = new Dimension(dimension);
	}
	
	public Dimension getDimension() {
		return (Dimension) this.dimension.clone();
	}
	
	public void setSize(int width, int height)
	{
		this.dimension = new Dimension(width, height);
	}
}
