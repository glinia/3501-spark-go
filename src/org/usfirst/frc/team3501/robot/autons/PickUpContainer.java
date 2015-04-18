package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.commands.*;

public class PickUpContainer extends CommandGroup {

    public PickUpContainer() {
        super("PickUpContainer");

        requires(Robot.arm);
        requires(Robot.claw);

        queueCommands();
    }

    private void queueCommands() {
        addSequential(new CloseClaw());
        addSequential(new MoveArmFor(
                Robot.autonData.getTime("pickup_container"),
                Robot.autonData.getSpeed("pickup_container")));
    }
}
