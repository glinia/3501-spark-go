package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class OpenClaw extends Command {

    public OpenClaw() {
        super("OpenClaw");
        requires(claw);
    }

    protected void initialize() {
        claw.open();
    }

    protected boolean isFinished() {
        return true;
    }
}
