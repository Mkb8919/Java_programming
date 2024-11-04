package com.company;

public class CWH_enum {
    /*
    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        switch (today){
            case MONDAY :
                System.out.println("Start of the week.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek.");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
            default:
                System.out.println("Just another day.");
                break;
        }
}
     */

    enum Level {
        LOW(1), MEDIUM(2), HIGH(3), CRITICAL(4);  // Enum constants with parameters

        private final int severity;  // Field for storing severity level

        // Constructor for the enum
        Level(int severity) {
            this.severity = severity;
        }

        // Method to get severity level
        public int getSeverity() {
            return severity;
        }

        // Overriding the toString() method
        @Override
        public String toString() {
            return switch (this) {
                case LOW -> "Low severity level";
                case MEDIUM -> "Medium severity level";
                case HIGH -> "High severity level";
                case CRITICAL -> "Critical severity level";
                default -> super.toString();
            };
        }

        // Static method to get enum constant by severity level
        public static Level fromSeverity(int severity) {
            for (Level level : Level.values()) {
                if (level.getSeverity() == severity) {
                    return level;
                }
            }
            throw new IllegalArgumentException("Invalid severity level: " + severity);
        }
    }

    public class EnumTest {
        public static void main(String[] args) {
            // Accessing enum constants
            Level currentLevel = Level.HIGH;

            // Switch statement using enum
            switch (currentLevel) {
                case LOW:
                    System.out.println("Take it easy, it's not critical.");
                    break;
                case MEDIUM:
                    System.out.println("Keep an eye on it.");
                    break;
                case HIGH:
                    System.out.println("This is serious.");
                    break;
                case CRITICAL:
                    System.out.println("Immediate action required!");
                    break;
            }

            // Using custom methods
            System.out.println("Severity level of " + currentLevel + ": " + currentLevel.getSeverity());

            // Getting enum constant from severity value
            Level levelFromSeverity = Level.fromSeverity(2);
            System.out.println("Enum constant for severity 2: " + levelFromSeverity);

            // Using the overridden toString() method
            System.out.println("Description: " + currentLevel.toString());

            // Listing all enum constants
            for (Level level : Level.values()) {
                System.out.println("Level: " + level + ", Severity: " + level.getSeverity());
            }
        }
    }
}

