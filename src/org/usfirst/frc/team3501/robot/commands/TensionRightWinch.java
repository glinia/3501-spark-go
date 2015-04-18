package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class TensionRightWinch extends Command {

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
