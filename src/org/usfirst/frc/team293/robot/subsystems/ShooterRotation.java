package org.usfirst.frc.team293.robot.subsystems;

import org.usfirst.frc.team293.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterRotation extends Subsystem {
	private CANTalon shooterrotation;
    
	public ShooterRotation(){
		super();
		shooterrotation= new CANTalon(RobotMap.shooterRotation);
		shooterrotation.changeControlMode(TalonControlMode.Position);//Change control mode of talon, default is PercentVbus (-1.0 to 1.0)
		shooterrotation.setFeedbackDevice(FeedbackDevice.AnalogPot); //Set the feedback device that is hooked up to the talon
		shooterrotation.setPID(3, 0.001, 0.0); //Set the PID constants (p, i, d)
		
		shooterrotation.enableControl(); //Enable PID control on the talon
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setsetpoint(double angle){
    	shooterrotation.set(angle);
    }
}

