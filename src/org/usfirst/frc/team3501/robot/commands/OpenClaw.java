package org.usfirst.frc.team3501.robot.commands;

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
