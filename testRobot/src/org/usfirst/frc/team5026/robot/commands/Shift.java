package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Shift extends Command {

    public Shift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Shift called");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shifter.toggleShift();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("Shift completed");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
