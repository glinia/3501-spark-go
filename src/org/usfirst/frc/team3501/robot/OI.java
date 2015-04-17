package org.usfirst.frc.team3501.robot;

import org.usfirst.frc.team3501.robot.commands.*;

public class OI {
    public Joystick left, right;

    public OI() {
        left  = new Joystick(RobotMap.LEFT_JOYSTICK_PORT);
        right = new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);

        right.whenPressed(1, new CloseClaw());
        right.whenReleased(1, new OpenClaw());
    }

    public double getForwardSpeed() {
        return right.getY();
    }

    public double getTwistSpeed() {
        return right.getTwist();
    }
}
