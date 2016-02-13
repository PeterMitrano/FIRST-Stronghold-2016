package org.usfirst.frc.team293.robot.commands;

import org.usfirst.frc.team293.robot.Robot;
//import org.usfirst.frc.team293.robot.subsystems.ShooterWheel;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunShooterWheel extends Command {

    public RunShooterWheel() {
    	requires(Robot.shooterwheel);
    	requires(Robot.ledbuttons);
    	
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    Robot.shooterwheel.setShooterRPM();
    Robot.drivercamera.Lookup();
	//Robot.ledbuttons.flash();
//    Robot.ledbuttons.on();
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
