package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        super("DriveWithJoysticks");

        requires(drivetrain);
    }

    protected void execute() {
        double forward = oi.getForwardR();
        double twist   = oi.getTwistR();

        // option to lock twist for alignment
        if (oi.getRightPressed(3, 4, 5, 6))
            twist = 0;

        drivetrain.drive(forward, twist);
    }

    protected boolean isFinished() {
        return false;
    }
}
