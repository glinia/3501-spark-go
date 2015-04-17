package org.usfirst.frc.team3501.robot.commands;

public class ToggleClaw extends CommandBase {

    public ToggleClaw() {
        super("ToggleClaw");
        requires(claw);
    }

    protected void initialize() {
        if (claw.isOpen())
            schedule(new CloseClaw());
        else
            schedule(new OpenClaw());
    }

    protected boolean isFinished() {
        return true;
    }
}
