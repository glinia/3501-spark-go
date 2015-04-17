package org.usfirst.frc.team3501.robot.commands;

public class MoveArmFor extends CommandBase {

    private double speed;

    public MoveArmFor(double secs, double speed) {
        super("MoveArmFor");
        requires(arm);

        setTimeout(secs);
        this.speed = speed;
    }

    protected void execute() {
        arm.set(speed);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }
}
