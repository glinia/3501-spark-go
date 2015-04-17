package org.usfirst.frc.team3501.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

    private Compressor compressor;

    public Pneumatics() {
        compressor = new Compressor();
    }

    public void start() {
        compressor.start();
    }

    public void stop() {
        compressor.stop();
    }

    public void initDefaultCommand() {}
}
