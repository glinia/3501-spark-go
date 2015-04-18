package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.bases.CommandGroup;

public class ContainerOverStep extends CommandGroup {

    public ContainerOverStep() {
        super("ContainerOverStep");

        requires(drivetrain);
        requires(arm);
        requires(claw);

        queueCommands();
    }

    private void queueCommands() {
        addSequential(new PickUpContainer());
        addSequential(new DriveOverStep(-1));
    }
}
