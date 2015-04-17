package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ContainerOverStep extends CommandGroup {

    public ContainerOverStep() {
        super("ContainerOverStep");

        requires(Robot.drivetrain);
        requires(Robot.arm);
        requires(Robot.claw);

        queueCommands();
    }

    private void queueCommands() {
        addSequential(new PickUpContainer());
        addSequential(new DriveOverStep(-1));
    }
}
