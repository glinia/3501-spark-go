package org.usfirst.frc.team3501.robot;

import java.util.HashMap;
import java.util.stream.IntStream;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class Joystick extends edu.wpi.first.wpilibj.Joystick {

    private HashMap<Integer, JoystickButton> buttons;

    public Joystick(int port) {
        super(port);

        IntStream.rangeClosed(1, 12).forEach((b) -> {
            buttons.put(b, new JoystickButton(this, b));
        });
    }

    public void whenPressed(int button, Command c) {
        buttons.get(button).whenPressed(c);
    }

    public void whenReleased(int button, Command c) {
        buttons.get(button).whenReleased(c);
    }

    public void whileHeld(int button, Command c) {
        buttons.get(button).whileHeld(c);
    }

    public boolean get(int button) {
        return getRawButton(button);
    }
}
