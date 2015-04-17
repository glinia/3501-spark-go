package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.robot.RobotMap;
import org.usfirst.frc.team3501.robot.commands.CommandBase;

public class DrivePastStep extends CommandBase {

    private double speed;

    public DrivePastStep() {
        super("DrivePastStep");
        requires(drivetrain);

        setTimeout(RobotMap.PAST_STEP_TIME);
        this.speed = RobotMap.PAST_STEP_SPEED;
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
