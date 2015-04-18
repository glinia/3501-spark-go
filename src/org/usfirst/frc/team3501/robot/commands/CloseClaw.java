package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class CloseClaw extends Command {

    public CloseClaw() {
        super("CloseClaw");
        requires(claw);
    }

    protected void initialize() {
        claw.close();
    }

    protected boolean isFinished() {
        return true;
    }
}
