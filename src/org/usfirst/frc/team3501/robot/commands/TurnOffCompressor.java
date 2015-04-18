package org.usfirst.frc.team3501.robot.commands;

import org.usfirst.frc.team3501.bases.Command;

public class TurnOffCompressor extends Command {

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
