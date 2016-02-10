package org.usfirst.frc.team293.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	//VictorSP Stuff
     public static int 
     leftMotor = 0,  //splitter
     rightMotor = 1, //splitter
     outsideFeeder=2,
     insideFeeder=3;
    
     //TalonSRX Stuff
     public static int 
     shooterwheel=0,
     hoodMotor=1,
     shooterRotation=2,
     lifterMotor=3;
     
     //TalonSRX Sensors
     /*
     Shooter Encoder
     shooterRotation Potentionmeter
     Hood Potentiometer
     drivetrainLifterMotor Potentiometer
     
     */
     //Servos
     public static int
     drivercamera=7,
     horizontalvisioncamera=8,
     verticalvisioncamera=9;
     
     //Sensors
     public static int
     //digital sensors
     leftEncoderone=0,
     leftEncodertwo=1,
     rightEncoderone=2,
     rightEncodertwo=3,
     opticallimit=4;  
}
