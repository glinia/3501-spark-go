package org.usfirst.frc.team3501.bases;

import edu.wpi.first.wpilibj.command.Scheduler;

public abstract class Command
    extends edu.wpi.first.wpilibj.command.Command
    implements CommandBase {

    public Command(String commandName) {
        super(commandName);
    }

    protected void schedule(Command c) {
        Scheduler.getInstance().add(c);
    }

    protected void initialize() {}

    protected void execute() {}

    protected void end() {}

    protected void interrupted() {}
}
