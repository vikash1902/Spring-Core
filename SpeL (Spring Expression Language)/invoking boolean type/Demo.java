package spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{52+98}")
	private int x;
	@Value("#{35+62+65+35}")
	private int y;
	
	// calling Static method
	@Value("#{T(java.lang.Math).sqrt(4464)}")
	private double z;
	// calling static variable
	@Value("#{T(java.lang.Math).E}")
	private double v;
	// Passing Object 
	@Value("#{new java.lang.String('Vikash')}")
	private String name;
	// using boolean type
	@Value("#{8>3}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", v=" + v + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
