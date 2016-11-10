package org.usfirst.frc.team1076.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class FakeMain {
    public static void main(String[] args) {
//        Robot robot = new Robot();
//        robot.robotInit();
//        robot.teleopInit();
//        while (true) {
//            robot.teleopPeriodic();
//        }
        Joystick stick = new Joystick(0);
        Button button = new JoystickButton(stick, 0);
        while (true) {
        System.out.println(stick.getRawButton(0));
        }
        
    }
}
