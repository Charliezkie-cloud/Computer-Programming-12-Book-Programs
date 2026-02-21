package ElapsedTimeCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Elapsed time calculator by Charles Henry M. Tinoy Jr.");
        System.out.println("Program 12. on page 125 (Basic Elements of Java)");
        System.out.println("==============================");

        /**
         * Inputs ug kuan: Start time and end time
         * Outputs sya ug kuan: Duration, hours, minutes and seconds
         */

        System.out.print("Enter the start time (hh:mm:ss): ");
        String startTimeString = scanner.nextLine();
        String[] separatedStartTime = startTimeString.split(":");

        int startHour = Integer.parseInt(separatedStartTime[0]);
        int startMinute = Integer.parseInt(separatedStartTime[1]);
        int startSecond = Integer.parseInt(separatedStartTime[2]);

        System.out.print("Enter the end time (hh:mm:ss): ");
        String endTimeString = scanner.nextLine();
        String[] separatedEndTime = endTimeString.split(":");

        int endHour = Integer.parseInt(separatedEndTime[0]);
        int endMinute = Integer.parseInt(separatedEndTime[1]);
        int endSecond = Integer.parseInt(separatedEndTime[2]);

        int durationSecond, durationMinute;
        int durationHour = endHour - startHour;

        if (endSecond < startSecond) {
            endSecond += 60;
            endMinute--;
        }
        durationSecond = endSecond - startSecond;

        if (endMinute < startMinute) {
            endMinute += 60;
            durationHour--;
        }
        durationMinute = endMinute - startMinute;

        System.out.println("==============================");
        System.out.printf("Duration: %02d:%02d:%02d\n", durationHour, durationMinute, durationSecond);
        System.out.printf("Hour(s) passed: %02d hr\n", durationHour);
        System.out.printf("Minute(s) passed: %02d min\n", durationMinute);
        System.out.printf("Second(s) passed: %02d sec\n", durationSecond);
        System.out.println("==============================");

        scanner.close();
    }
}
