package org.usfirst.frc.team3501.robot.commands;

public class DriveWithJoysticks extends CommandBase {

    public DriveWithJoysticks() {
        super("DriveWithJoysticks");
        requires(drivetrain);
    }

    protected void execute() {
        drivetrain.drive(oi.getForwardSpeed(), oi.getTwistSpeed());
    }

    protected boolean isFinished() {
        return false;
    }
}
