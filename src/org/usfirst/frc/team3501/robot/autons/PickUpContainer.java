package org.usfirst.frc.team3501.robot.autons;

import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.RobotMap;
import org.usfirst.frc.team3501.robot.commands.*;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PickUpContainer extends CommandGroup {

    public PickUpContainer() {
        super("PickUpContainer");

        requires(Robot.arm);
        requires(Robot.claw);

        queueCommands();
    }

    private void queueCommands() {
        addSequential(new CloseClaw());
        addSequential(new MoveArmFor(RobotMap.PICKUP_TIME, RobotMap.PICKUP_SPEED));
    }
}
