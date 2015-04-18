package org.usfirst.frc.team3501.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class AutonData {

    HashMap<String, Double> speeds;
    HashMap<String, Double> times;

    public AutonData() {
        speeds = new HashMap<String, Double>();
        times  = new HashMap<String, Double>();

        populate();
    }

    public double getSpeed(String key) {
        Double ret = speeds.get(key);

        return (ret != null) ? ret : 0;
    }

    public double getTime(String key) {
        Double ret = times.get(key);

        return (ret != null) ? ret : 0;
    }

    public void update() {
        speeds.clear();
        times.clear();

        populate();
    }

    private void populate() {
        String file;

        try {
            file = readConfigFile();
        } catch (IOException e) {
            e.printStackTrace();
            populateDefaults();
            return;
        }

        try {
            Arrays.stream(file.split("\n"))
            .map(line -> line.split(" "))
            .forEach((action) -> {
                double speed = Double.parseDouble(action[0]);
                double time  = Double.parseDouble(action[1]);
                String name  = action[2];

                speeds.put(name, speed);
                times.put(name, time);
            });
        } catch (Exception e) {
            e.printStackTrace();
            populateDefaults();
        }
    }

    private void populateDefaults() {
        speeds.clear();
        times.clear();

        speeds.put("drive_over_step",  0.7);
        speeds.put("drive_past_step",  0.5);
        speeds.put("pickup_container", 0.5);

        times.put("drive_over_step",  1.2);
        times.put("drive_past_step",  1.5);
        times.put("pickup_container", 1.4);
    }

    private String readConfigFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(
                "auton_times_and_speeds.conf"));

        StringBuilder sb = new StringBuilder();

        in.readLine(); // get rid of first line

        String curLine;
        while ((curLine = in.readLine()) != null)
            sb.append(curLine + "\n");
        String finalString = sb.toString();

        in.close();

        return finalString;
    }
}
