package org.usfirst.frc.team3501.robot.commands;

public class TensionRightWinch extends CommandBase {

    private double speed;

    public TensionRightWinch(double speed) {
        super("TensionRightWinch");
        requires(arm);

        this.speed = speed;
    }

    protected void execute() {
        arm.moveRight(speed);
    }

    protected boolean isFinished() {
        return true;
    }
}
