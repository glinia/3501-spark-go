package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.RobotMap;
import org.usfirst.frc.team3501.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    private RobotDrive robotDrive;

    public Drivetrain() {
        CANJaguar frontLeft  = new CANJaguar(RobotMap.FRONT_LEFT_ADDRESS);
        CANJaguar frontRight = new CANJaguar(RobotMap.FRONT_RIGHT_ADDRESS);
        CANJaguar rearLeft   = new CANJaguar(RobotMap.REAR_LEFT_ADDRESS);
        CANJaguar rearRight  = new CANJaguar(RobotMap.REAR_RIGHT_ADDRESS);

        robotDrive = new RobotDrive(
                frontLeft,  rearLeft,
                frontRight, rearRight);
    }

    public void drive(double forward, double twist) {
        if (Math.abs(forward) < RobotMap.MIN_DRIVE_JOYSTICK_INPUT)
            forward = 0;
        if (Math.abs(twist)   < RobotMap.MIN_DRIVE_JOYSTICK_INPUT)
            twist = 0;

        robotDrive.arcadeDrive(
                RobotMap.MAX_DRIVE_SPEED * adjust(forward),
                RobotMap.MAX_DRIVE_SPEED * adjust(twist),
                false);
    }

    public void driveRaw(double forward, double twist) {
        robotDrive.arcadeDrive(forward, twist, false);
    }

    public void goForward(double speed) {
        robotDrive.arcadeDrive(speed, 0);
    }

    public void stop() {
        robotDrive.arcadeDrive(0, 0);
    }

    // output is avg of `x` and `sqrt(x)`
    private double adjust(double x) {
        return (x + Math.signum(x) * Math.sqrt(Math.abs(x))) / 2;
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }
}
