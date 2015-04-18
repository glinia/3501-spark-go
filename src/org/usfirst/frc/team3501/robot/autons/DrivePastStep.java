package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.bases.Command;

public class DrivePastStep extends Command {

    private double speed;

    public DrivePastStep() {
        super("DrivePastStep");
        requires(drivetrain);

        setTimeout(autonData.getTime("drive_past_step"));
        speed = autonData.getSpeed("drive_past_step");
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
