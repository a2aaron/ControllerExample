package org.usfirst.frc.team1076.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Springshoe extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Springshoe() {
        System.out.println("Pretend this calls some motors");
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void jump(int force) {
        System.out.println("I jumped with a force of: " + force + "N");
    }
}

