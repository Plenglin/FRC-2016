package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import org.usfirst.frc.team5026.robot.Hardware;

public class Shifter extends Subsystem {
    
	DoubleSolenoid leftSolenoid;
	DoubleSolenoid rightSolenoid;
	
	boolean isHigh;
	
	public Shifter(boolean highShift) {
		leftSolenoid = Hardware.leftShiftSolenoid;
		rightSolenoid = Hardware.rightShiftSolenoid;
		
		setShift(highShift);
	}
	
    public void setShift(boolean highShift) {
    	if(highShift) {
    		leftSolenoid.set(Value.kForward);
    		rightSolenoid.set(Value.kForward);
    		isHigh = true;
    	}
    	
    	else {
    		leftSolenoid.set(Value.kReverse);
    		rightSolenoid.set(Value.kReverse);
    		isHigh = false;
    	}
    }
    
    public void toggleShift() {
    	setShift(!isHigh);
    }
    
    public void initDefaultCommand() {}

}