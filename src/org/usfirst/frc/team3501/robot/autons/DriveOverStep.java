package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.robot.RobotMap;
import org.usfirst.frc.team3501.robot.commands.CommandBase;

public class DriveOverStep extends CommandBase {

    private double speed;

    public DriveOverStep() {
        super("DriveOverStep");
        requires(drivetrain);

        setTimeout(RobotMap.OVER_STEP_TIME);
        this.speed = RobotMap.OVER_STEP_SPEED;
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
