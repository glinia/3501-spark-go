package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.robot.RobotMap;
import org.usfirst.frc.team3501.robot.commands.CommandBase;

public class DriveOverStep extends CommandBase {

    private double speed;

    public DriveOverStep() {
        super("DriveOverStep");
        requires(drivetrain);

        setTimeout(RobotMap.OVER_STEP_TIME);
        speed = RobotMap.OVER_STEP_SPEED;
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
