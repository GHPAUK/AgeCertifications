package com.sparta.gh;

public class GreetingGenerator {

    public static final String GOOD_MORNING = "Good morning!";
    public static final String GOOD_AFTERNOON = "Good afternoon!";
    public static final String GOOD_EVENING = "Good evening!";
    public static final String INVALID = "Invalid";

    public void GreetingGenerator() {
    }

    public String getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            return GOOD_MORNING;
        } else if (timeOfDay > 12 && timeOfDay < 18) {
            return GOOD_AFTERNOON;
        } else if (timeOfDay >= 18 && timeOfDay <= 23
                || timeOfDay >= 0 && timeOfDay <= 4) {
            return GOOD_EVENING;
        }

        return INVALID;
    }
}
