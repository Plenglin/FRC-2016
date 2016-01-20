package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Hardware;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A shooter subsystem
 *
 */
public class Shooter extends Subsystem {
	
	private PIDController left, right;
	
	public void initDefaultCommand() {
		left = new PIDController(
				Constants.kShooterP, Constants.kShooterI, Constants.kShooterD, 
				Hardware.leftShooterEncoder, Hardware.leftShooterMotor
		);
		right = new PIDController(
				Constants.kShooterP, Constants.kShooterI, Constants.kShooterD, 
				Hardware.rightShooterEncoder, Hardware.rightShooterMotor
		);
		Hardware.leftShooterEncoder.setDistancePerPulse(1/Constants.kShooterEncoderPPR);
	}
	
	/**
	 * Set the speed of the left motor
	 * @param speed new right speed
	 */
	public void setLeftSpeed(double speed) {
		left.setSetpoint(speed);
	}
	
	/**
	 * Set the speed of the right motor
	 * @param speed new right speed
	 */
	public void setRightSpeed(double speed) {
		right.setSetpoint(speed);
	}
	
	/**
	 * Set both motors' speeds
	 * @param left new left speed
	 * @param right new right speed
	 */
	public void setSpeed(double left, double right) {
		setLeftSpeed(left);
		setRightSpeed(right);
	}
	
	/**
	 * Set both motors' speeds
	 * @param speed both motors' new speeds
	 */
	public void setSpeed(double speed) {
		setSpeed(speed, speed);
	}
	
	/**
	 * Get the left motor's target speed
	 * @return
	 */
	public double getLeftSpeed() {
		return left.getSetpoint();
	}
	
	/**
	 * Get the right motor's target speed
	 * @return
	 */
	public double getRightSpeed() {
		return right.getSetpoint();
	}

	/**
	 * Get the left motor's actual speed
	 * @return left motor's actual speed in rotations per second
	 */
	public double getActualLeftSpeed() {
		return Hardware.leftShooterEncoder.getRate();
	}

	/**
	 * Get the right motor's actual speed
	 * @return right motor's actual speed in rotations per second
	 */
	public double getActualRightSpeed() {
		return Hardware.rightShooterEncoder.getRate();
	}

}
