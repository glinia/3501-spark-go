package org.usfirst.frc.team3501.robot.commands;

public class DriveWithJoysticks extends CommandBase {

    public DriveWithJoysticks() {
        super("DriveWithJoysticks");
        requires(drivetrain);
    }

    protected void execute() {
        double forward = oi.getForwardR();
        double twist   = oi.getTwistR();

        if (oi.getRightPressed(3, 4, 5, 6))
            twist = 0;

        drivetrain.drive(forward, twist);
    }

    protected boolean isFinished() {
        return false;
    }
}
