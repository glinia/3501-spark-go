package org.usfirst.frc.team3501.robot.commands;

public class TurnOffCompressor extends CommandBase {

    public TurnOffCompressor() {
        super("TurnOffCompressor");
        requires(pneumatics);
    }

    protected void initialize() {
        pneumatics.stop();
    }

    protected boolean isFinished() {
        return true;
    }
}
