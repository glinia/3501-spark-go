package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class MoveArm extends Command {

    public MoveArm() {
        super("MoveArm");
        requires(arm);
    }

    protected void execute() {
        arm.setFromJoystick(-oi.getForwardL());
    }

    protected boolean isFinished() {
        return false;
    }
}
