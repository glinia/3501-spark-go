package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.robot.OI;
import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.subsystems.*;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public abstract class CommandBase extends Command {

    protected static OI oi;

    protected static Drivetrain drivetrain;
    protected static Arm arm;
    protected static Claw claw;

    protected static Pneumatics pneumatics;

    public CommandBase(String commandName) {
        super(commandName);

        oi = Robot.oi;

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
