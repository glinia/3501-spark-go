package org.usfirst.frc.team3501.bases;

import org.usfirst.frc.team3501.robot.OI;
import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.subsystems.Arm;
import org.usfirst.frc.team3501.robot.subsystems.Claw;
import org.usfirst.frc.team3501.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3501.robot.subsystems.Pneumatics;
import org.usfirst.frc.team3501.util.AutonData;

public abstract class CommandGroup
    extends edu.wpi.first.wpilibj.command.CommandGroup {

    protected static OI oi;

    protected static AutonData autonData;

    protected static Drivetrain drivetrain;
    protected static Arm arm;
    protected static Claw claw;

    protected static Pneumatics pneumatics;

    public CommandGroup(String commandGroupName) {
        super(commandGroupName);

        oi = Robot.oi;

        autonData = Robot.autonData;

        drivetrain = Robot.drivetrain;
        arm        = Robot.arm;
        claw       = Robot.claw;

        pneumatics = Robot.pneumatics;
    }
}
