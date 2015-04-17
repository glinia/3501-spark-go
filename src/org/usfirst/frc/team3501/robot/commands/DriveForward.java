package org.usfirst.frc.team3501.robot.commands;

public class DriveForward extends CommandBase {

    private double speed;

    public DriveForward(double time, double speed) {
        super("DriveForward");
        requires(drivetrain);

        setTimeout(time);
        this.speed = speed;
    }

    protected void execute() {
        drivetrain.goForward(speed);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        drivetrain.stop();
    }
}
