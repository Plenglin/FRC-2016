package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team5026.robot.Hardware;

import org.usfirst.frc.team5026.robot.commands.Shift;

public class OI {
    
	Button button1 = new JoystickButton(Hardware.primaryDriver, 1);
	
	public OI() {
		button1.whenPressed(new Shift());
	}
}