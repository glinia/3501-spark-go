package org.usfirst.frc.team3501.robot.commands;

public class CloseClaw extends CommandBase {

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
