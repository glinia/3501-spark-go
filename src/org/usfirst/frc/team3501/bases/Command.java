package org.usfirst.frc.team3501.bases;

import org.usfirst.frc.team3501.robot.OI;
import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.subsystems.Arm;
import org.usfirst.frc.team3501.robot.subsystems.Claw;
import org.usfirst.frc.team3501.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3501.robot.subsystems.Pneumatics;
import org.usfirst.frc.team3501.util.AutonData;

import edu.wpi.first.wpilibj.command.Scheduler;

public abstract class Command
    extends edu.wpi.first.wpilibj.command.Command {

    protected static OI oi;

    protected static AutonData autonData;

    protected static Drivetrain drivetrain;
    protected static Arm arm;
    protected static Claw claw;

    protected static Pneumatics pneumatics;

    public Command(String commandName) {
        super(commandName);

        oi = Robot.oi;

        autonData = Robot.autonData;

        drivetrain = Robot.drivetrain;
        arm        = Robot.arm;
        claw       = Robot.claw;

        pneumatics = Robot.pneumatics;
    }

    protected void schedule(Command c) {
        Scheduler.getInstance().add(c);
    }

    protected void initialize() {}

    protected void execute() {}

    protected void end() {}

    protected void interrupted() {}
}
