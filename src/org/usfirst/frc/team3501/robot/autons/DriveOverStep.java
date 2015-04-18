package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.bases.Command;

public class DriveOverStep extends Command {

    private double speed;

    public DriveOverStep() {
        super("DriveOverStep");
        requires(drivetrain);

        setTimeout(autonData.getTime("drive_over_step"));
        speed = autonData.getSpeed("drive_over_step");
    }

    // TODO: this is an ugly "solution"
    public DriveOverStep(int coef) {
        this();
        this.speed *= coef;
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
