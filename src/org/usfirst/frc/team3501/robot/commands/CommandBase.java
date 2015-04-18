package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.robot.AutonData;
import org.usfirst.frc.team3501.robot.OI;
import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.subsystems.*;

public interface CommandBase {

    final static OI oi = Robot.oi;

    final static AutonData autonData = Robot.autonData;

    final static Drivetrain drivetrain = Robot.drivetrain;
    final static               Arm arm = Robot.arm;
    final static             Claw claw = Robot.claw;

    final static Pneumatics pneumatics = Robot.pneumatics;
}
