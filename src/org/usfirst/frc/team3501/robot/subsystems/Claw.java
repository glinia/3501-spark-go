package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.RobotMap;
import org.usfirst.frc.team3501.robot.commands.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw extends Subsystem {

    private final DoubleSolenoid piston;

    public Claw() {
        piston = new DoubleSolenoid(
                RobotMap.CLAW_FORWARD_CHANNEL, RobotMap.CLAW_REVERSE_CHANNEL);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new CloseClaw());
    }

    public void open() {
        piston.set(RobotMap.OPEN);
    }

    public void close() {
        piston.set(RobotMap.CLOSED);
    }
}

