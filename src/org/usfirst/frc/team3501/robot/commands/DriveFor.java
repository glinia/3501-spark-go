package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class DriveFor extends Command {

    private double speed;

    public DriveFor(double secs, double speed) {
        super("DriveFor");
        requires(drivetrain);

        setTimeout(secs);
        this.speed = speed;
    }

    protected void execute() {
        drivetrain.driveRaw(speed, 0);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }
}
