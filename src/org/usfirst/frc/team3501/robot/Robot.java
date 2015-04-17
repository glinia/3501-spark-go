
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

	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Arm               arm = new Arm();
	public static final Claw             claw = new Claw();

	public static OI oi;

	private SendableChooser autoChooser;

    private Command autonomousCommand;

    public void robotInit() {
		oi = new OI();

		chooseAuto();
    }

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        autonomousCommand = (Command) autoChooser.getSelected();
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

    private void chooseAuto() {
        autoChooser = new SendableChooser();

        autoChooser.addDefault("Drive over step", new DriveOverStep());
        autoChooser.addObject("Drive past step",  new DrivePastStep());

        SmartDashboard.putData("Auto Mode", autoChooser);
    }
}
