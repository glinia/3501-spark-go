package org.usfirst.frc.team3501.robot.commands;

public class TurnOnCompressor extends Command {

    public TurnOnCompressor() {
        super("TurnOnCompressor");
        requires(pneumatics);
    }

    protected void initialize() {
        pneumatics.start();
    }

    protected boolean isFinished() {
        return true;
    }
}
