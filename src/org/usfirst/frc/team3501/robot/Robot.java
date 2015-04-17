
package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team3501.robot.commands.*;
import org.usfirst.frc.team3501.robot.subsystems.*;

public class Robot extends IterativeRobot {

	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Arm               arm = new Arm();
	public static final Claw             claw = new Claw();

	public static OI oi;

    Command autonomousCommand;

    public void robotInit() {
		oi = new OI();

		double time = 1.2;
		double speed = 0.7;
        autonomousCommand = new DriveForward(time, speed);
    }

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();


    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
