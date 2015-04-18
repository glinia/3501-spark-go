package org.usfirst.frc.team3501.robot;

import java.util.Arrays;

import org.usfirst.frc.team3501.robot.commands.*;

public class OI {

    private Joystick left, right;

    public OI() {
        left  = new Joystick(RobotMap.LEFT_JOYSTICK_PORT);
        right = new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);

        right.whenPressed(1,  new CloseClaw());
        right.whenReleased(1, new OpenClaw());
        right.whenPressed(2,  new ToggleClaw());

        right.whenPressed(11, new TurnOffCompressor());
        right.whenPressed(12, new TurnOffCompressor());
        right.whenPressed(7,  new TurnOnCompressor());
        right.whenPressed(8,  new TurnOnCompressor());

        // potential bug point: this should "Just Work" because as soon as
        // command stops running, left stick pos at 0 should take over...
        // if that is not the case, arm will continue indefinitely.
        left.whileHeld(7,  new TensionLeftWinch(RobotMap.ARM_ADJUST_SPEED));
        left.whileHeld(6,  new TensionLeftWinch(-RobotMap.ARM_ADJUST_SPEED));
        left.whileHeld(11, new TensionRightWinch(RobotMap.ARM_ADJUST_SPEED));
        left.whileHeld(10, new TensionRightWinch(-RobotMap.ARM_ADJUST_SPEED));
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

    public boolean getRightPressed(int... buttons) {
        return Arrays.stream(buttons).anyMatch(b -> right.get(b));
    }
}
