
package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3501.robot.autons.*;
import org.usfirst.frc.team3501.robot.commands.*;
import org.usfirst.frc.team3501.robot.subsystems.*;
import org.usfirst.frc.team3501.util.AutonData;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Arm arm;
	public static Claw claw;

	public static Pneumatics pneumatics;

	public static OI oi;

	public static AutonData autonData;

	private SendableChooser autonChooser;
    private Command autonomousCommand;

    public void robotInit() {
		drivetrain = new Drivetrain();
		arm        = new Arm();
		claw       = new Claw();

		pneumatics = new Pneumatics();

		autonData = new AutonData();

		oi = new OI();

		chooseAuto();
    }

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        schedule(new TurnOnCompressor());

        autonData.update();

        autonomousCommand = (Command) autonChooser.getSelected();
        autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        schedule(new TurnOnCompressor());

        if (autonomousCommand != null)
            autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }

    private void chooseAuto() {
        autonChooser = new SendableChooser();

        autonChooser.addDefault("Pick up container", new ContainerOverStep());
        autonChooser.addObject("Drive over step",    new DriveOverStep());
        autonChooser.addObject("Drive past step",    new DrivePastStep());

        SmartDashboard.putData("Auto Mode", autonChooser);
    }

    private void schedule(Command c) {
        Scheduler.getInstance().add(c);
    }
}
