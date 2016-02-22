package org.usfirst.frc.team293.robot.commands;

import org.usfirst.frc.team293.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DropCenterWheel extends Command {

    public DropCenterWheel() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lifterdrivetrain);
    	requires(Robot.ledCenterWheel);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.ledCenterWheel.on();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.ledCenterWheel.flash();
    	Robot.lifterdrivetrain.drop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.lifterdrivetrain.getStatus();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ledCenterWheel.on();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}