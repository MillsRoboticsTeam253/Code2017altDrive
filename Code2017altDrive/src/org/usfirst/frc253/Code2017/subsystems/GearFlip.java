// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2017.subsystems;

import org.usfirst.frc253.Code2017.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearFlip extends Subsystem {

	//Declares actuator, connects to RobotMap
    private final Spark spark1 = RobotMap.gearFlipSpark1;

    public void initDefaultCommand() {}

    public GearFlip() {
       	super();
       	 DeployGear();
       	 Retract();
       	 FullStop();
    }
    public void DeployGear(){
    	//Deploys gear
    	spark1.set(-.7);
    }
    public void Retract(){
    	//Retracts gear flip
    	spark1.set(.5);
    }
    public void FullStop(){
    	//Stops gear flip
    	spark1.set(0.00);
    }
}


