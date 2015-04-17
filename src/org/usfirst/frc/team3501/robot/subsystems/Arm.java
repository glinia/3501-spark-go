package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.RobotMap;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

    private CANJaguar left, right;

    public Arm() {
        left  = new CANJaguar(RobotMap.LEFT_WINCH_ADDRESS);
        right = new CANJaguar(RobotMap.RIGHT_WINCH_ADDRESS);
    }

    public void set(double speed) {
        left.set(-speed);
        right.set(speed);
    }

    public void moveLeft(double speed) {
        left.set(speed);
        right.set(0);
    }

    public void moveRight(double speed) {
        right.set(speed);
        left.set(0);
    }

    public double getSpeedFromJoystick(double speed) {
        if (Math.abs(speed) < RobotMap.MIN_ARM_JOYSTICK_INPUT)
            speed = 0;

        return speed;
    }

    public void initDefaultCommand() {}
}

