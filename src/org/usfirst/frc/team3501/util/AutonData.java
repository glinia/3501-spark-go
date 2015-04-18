package org.usfirst.frc.team3501.util;

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
        populateDefaults();
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
}
