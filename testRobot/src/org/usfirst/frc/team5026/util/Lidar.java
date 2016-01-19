package org.usfirst.frc.team5026.util;

import edu.wpi.first.wpilibj.I2C;

public class Lidar {
	
	public I2C s_I2C;
	public static final int LIDARLITE_ADDRESS = 0x62; // I2C Address
	public static final int REGISTER_MEASURE = 0x00; // Register to write to initiate ranging
	public static final int MEASURE_VALUE = 0x04; // Value to initiate ranging
	public static final int REGISTER_HIGH_LOW_B = 0x8f; // Register to get both High and Low bytes in 1 call
	
	byte[] distanceArray = new byte[2];
	
	public Lidar(int port) {
		I2C.Port s_Port = I2C.Port.values()[port];
		s_I2C = new I2C(s_Port, LIDARLITE_ADDRESS);
	}
	
	public double getDistance() {
		s_I2C.write(REGISTER_MEASURE, MEASURE_VALUE);
		s_I2C.read(REGISTER_HIGH_LOW_B, 2, distanceArray);
		double distance = (distanceArray[0] << 8) + distanceArray[1];
		return distance;
	}

}
