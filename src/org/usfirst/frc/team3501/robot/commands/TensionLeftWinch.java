package org.usfirst.frc.team3501.robot.commands;

public class TensionLeftWinch extends CommandBase {

    private double speed;

    public TensionLeftWinch(double speed) {
        super("TensionLeftWinch");
        requires(arm);

        this.speed = speed;
    }

    protected void execute() {
        arm.moveLeft(speed);
    }

    protected boolean isFinished() {
        return true;
    }
}
