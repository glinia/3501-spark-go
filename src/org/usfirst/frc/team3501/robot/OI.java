package org.usfirst.frc.team3501.robot;

import org.usfirst.frc.team3501.robot.commands.*;

public class OI {
    private Joystick left, right;

    public OI() {
        left  = new Joystick(RobotMap.LEFT_JOYSTICK_PORT);
        right = new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);

        right.whenPressed(1, new CloseClaw());
        right.whenReleased(1, new OpenClaw());
    }

    public double getForwardL() {
        return left.getY();
    }

    public double getForwardR() {
        return right.getY();
    }

    public double getTwistR() {
        return right.getTwist();
    }
}
