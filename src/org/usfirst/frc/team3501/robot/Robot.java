
package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3501.robot.autons.*;
import org.usfirst.frc.team3501.robot.subsystems.*;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static Claw claw;

	public static Pneumatics pneumatics;

	public static OI oi;

	private SendableChooser autoChooser;

    private Command autonomousCommand;

    public void robotInit() {
		oi = new OI();

		drivetrain = new Drivetrain();
		arm        = new Arm();
		claw       = new Claw();

		pneumatics = new Pneumatics();

		chooseAuto();
    }

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        pneumatics.start();

        autonomousCommand = (Command) autoChooser.getSelected();
        autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        pneumatics.start();

        autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }

    public void disabledInit() {
        pneumatics.stop();
    }

    private void chooseAuto() {
        autoChooser = new SendableChooser();

        autoChooser.addDefault("Drive over step", new DriveOverStep());
        autoChooser.addObject("Drive past step",  new DrivePastStep());

        SmartDashboard.putData("Auto Mode", autoChooser);
    }
}
