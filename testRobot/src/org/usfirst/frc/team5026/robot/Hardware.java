package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc.team5026.robot.subsystems.ThreeMotorGroup;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team5026.util.Lidar;

public class Hardware {
	
	// Joysticks
	public static Joystick primaryDriver = new Joystick(Constants.kPrimaryJoystick);
	public static Joystick secondaryDriver = new Joystick(Constants.kSecondaryJoystick);
	
	//DriveTrain
	public static ThreeMotorGroup leftDrive = new ThreeMotorGroup(new Talon(Constants.kLeftDrive1), new Talon(Constants.kLeftDrive2), new Talon(Constants.kLeftDrive3), true);
	public static ThreeMotorGroup rightDrive = new ThreeMotorGroup(new Talon(Constants.kRightDrive1), new Talon(Constants.kRightDrive2), new Talon(Constants.kRightDrive3), false);
	
	// DoubleSolenoids
	public static DoubleSolenoid leftShiftSolenoid = new DoubleSolenoid(Constants.kLeftShiftSolenoidForwardChannel, Constants.kLeftShiftSolenoidReverseChannel);
	public static DoubleSolenoid rightShiftSolenoid = new DoubleSolenoid(Constants.kRightShiftSolenoidForwardChannel, Constants.kRightShiftSolenoidReverseChannel);
	
	// Sensors
	public static Lidar lidar = new Lidar(Constants.kLidarChannel);
}