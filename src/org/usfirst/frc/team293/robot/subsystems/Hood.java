package org.usfirst.frc.team293.robot.subsystems;

import org.usfirst.frc.team293.robot.Robot;
import org.usfirst.frc.team293.robot.RobotMap;
import org.usfirst.frc.team293.robot.commands.HoodRestPosition;
import org.usfirst.frc.team293.robot.commands.ManualHood;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Hood extends Subsystem {//the hood that aims up and down and manipulates.  PID
	private static CANTalon Hood;
	
	private static final double UP = 10.0;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public Hood() {
		super();
		Hood = new CANTalon(RobotMap.hoodMotor);
		Hood.changeControlMode(TalonControlMode.Position);
		Hood.setFeedbackDevice(FeedbackDevice.AnalogPot);
		Hood.reverseSensor(false);
		Hood.setPID(8.5,.0075,.25); // Set the PID constants (p, i, d);
		Hood.setIZone(50);
		Hood.setCloseLoopRampRate(.01);
		
		//Hood.reverseOutput(true);
		Hood.enableControl(); // Enable PID control on the talon
	}

	public void initDefaultCommand() {
		
		// Set the default command for a subsystem here.
		 setDefaultCommand(new ManualHood());
	}

	public static void setPosition(double i) {
		Hood.enableControl();
		Hood.setSetpoint(i);
		if (Hood.GetIaccum()>.1){
		Hood.clearIAccum();
		}
	}
	
	public static double getPosition(){
		return Hood.getPosition();
	}
	public static double getI(){
		return Hood.GetIaccum();
	}
	
	public static boolean hoodIsUp(){
		if(getPosition() >= 9.9){
			return true;
		}
		return false;
	}

	public static void disable() {
		Hood.disable();	
	}
	public static void enable(){
		Hood.enable();
	}

}
