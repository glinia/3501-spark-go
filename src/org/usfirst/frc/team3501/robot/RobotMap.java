package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class RobotMap {
    public static final int LEFT_JOYSTICK_PORT = 0, RIGHT_JOYSTICK_PORT = 1;

    public static final double MIN_DRIVE_JOYSTICK_INPUT = 0.1;

    public static final int FRONT_LEFT_ADDRESS = 4, FRONT_RIGHT_ADDRESS = 5,
                            REAR_LEFT_ADDRESS  = 3, REAR_RIGHT_ADDRESS  = 6;

    public static final double MAX_DRIVE_SPEED = 0.7;

    public static final int CLAW_FORWARD_CHANNEL = 0, CLAW_REVERSE_CHANNEL = 1;

    public static final Value OPEN = Value.kForward, CLOSED = Value.kReverse;
}
