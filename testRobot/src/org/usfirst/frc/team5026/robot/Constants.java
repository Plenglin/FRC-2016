package org.usfirst.frc.team5026.robot;

public class Constants {
	
	// Joysticks
	public static final int kPrimaryJoystick = 0;
	public static final int kSecondaryJoystick = 1;
	
	public static final double kJoystickDeadZone = 0;
	public static final double kJoystickSensitivity = 0;
	
	// Motors
	public static final int kLeftDrive1 = 0;
	public static final int kLeftDrive2 = 1;
	public static final int kLeftDrive3 = 2;
	
	public static final int kRightDrive1 = 3;
	public static final int kRightDrive2 = 4;
	public static final int kRightDrive3 = 5;
	
	public static final int kUpperShooter = 6;
	public static final int kLowerShooter = 7;
	
	// DoubleSolenoids
	public static final int kLeftShiftSolenoidForwardChannel = 0;
	public static final int kLeftShiftSolenoidReverseChannel = 1;
	
	public static final int kRightShiftSolenoidForwardChannel = 2;
	public static final int kRightShiftSolenoidReverseChannel = 3;
	
	// DIO
	public static final int kLidarChannel = 1;
	
	// Shooter
	public static final int kLeftShooterChannel = 8;
	public static final int kRightShooterChannel = 9;
	public static final int kLeftEncoderAChannel = 10;
	public static final int kLeftEncoderBChannel = 11;
	public static final int kRightEncoderAChannel = 12;
	public static final int kRightEncoderBChannel = 13;
	public static final double kShooterEncoderPPR = 256; // PPR = pulses per rotation
	
	// Math Constants
	public static final int kWheelRadius = 6; //inches
	public static final int kEncoderCPR = 256;
	
	public static final double kDriveP = 0;
	public static final double kDriveI = 0;
	public static final double kDriveD = 0;
	
	public static final double kShooterP = 0;
	public static final double kShooterI = 0;
	public static final double kShooterD = 0;

}