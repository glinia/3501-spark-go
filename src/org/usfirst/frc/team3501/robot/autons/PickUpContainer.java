package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.bases.CommandGroup;
import org.usfirst.frc.team3501.robot.commands.*;

public class PickUpContainer extends CommandGroup {

    public PickUpContainer() {
        super("PickUpContainer");

        requires(arm);
        requires(claw);

        queueCommands();
    }

    private void queueCommands() {
        addSequential(new CloseClaw());
        addSequential(new MoveArmFor(
                autonData.getTime("pickup_container"),
                autonData.getSpeed("pickup_container")));
    }
}
