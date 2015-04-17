package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class RobotMap {
    // Driver Station
    public static final int LEFT_JOYSTICK_PORT = 0, RIGHT_JOYSTICK_PORT = 1;

    public static final double MIN_DRIVE_JOYSTICK_INPUT = 0.1,
                               MIN_ARM_JOYSTICK_INPUT   = 0.1;

    // Drivetrain
    public static final int FRONT_LEFT_ADDRESS = 4, FRONT_RIGHT_ADDRESS = 5,
                            REAR_LEFT_ADDRESS  = 3, REAR_RIGHT_ADDRESS  = 6;

    public static final double MAX_DRIVE_SPEED = 0.7;

    // Claw
    public static final int CLAW_FORWARD_CHANNEL = 0, CLAW_REVERSE_CHANNEL = 1;

    public static final Value OPEN = Value.kForward, CLOSED = Value.kReverse;

    // Arm
    public static final int LEFT_WINCH_ADDRESS = 2, RIGHT_WINCH_ADDRESS = 7;

    // Auton
    public static final double OVER_STEP_TIME = 1.2, OVER_STEP_SPEED = 0.7,
                               PAST_STEP_TIME = 1.5, PAST_STEP_SPEED = 0.5;
}
