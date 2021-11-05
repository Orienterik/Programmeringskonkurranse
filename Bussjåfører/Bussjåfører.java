import java.util.Scanner;

public class Bussjåfører {

    public static void main(String[] args) {

        int requirementMonday;
        int requirementThusday;
        int requirementWednesday;
        int requirementThursday;
        int requirementFriday;
        int requirementSaturday;
        int requirementSunday;

        try (Scanner scanner = new Scanner(System.in)) {
            requirementMonday = scanner.nextInt();
            requirementThusday = scanner.nextInt();
            requirementWednesday = scanner.nextInt();
            requirementThursday = scanner.nextInt();
            requirementFriday = scanner.nextInt();
            requirementSaturday = scanner.nextInt();
            requirementSunday = scanner.nextInt();
        }

        int minimumEmployees = Integer.MAX_VALUE;

        for (int startingMonday = 0; startingMonday <= requirementMonday; startingMonday++) {

            for (int startingThusday = 0; startingThusday <= requirementThusday; startingThusday++) {

                for (int startingWednesday = 0; startingWednesday <= requirementWednesday; startingWednesday++) {

                    int missingThursday = requirementThursday - startingMonday - startingThusday - startingWednesday;
                    int startingThursday = Math.max(missingThursday, 0);

                    int missingFriday = requirementFriday - startingThusday - startingWednesday - startingThursday;
                    int startingFriday = Math.max(missingFriday, 0);

                    int missingSaturday = requirementSaturday - startingWednesday - startingThursday - startingFriday;
                    int startingSaturday = Math.max(missingSaturday, 0);

                    int missingSunday = requirementSunday - startingThursday - startingFriday - startingSaturday;
                    int missingMonday = requirementMonday - startingFriday - startingSaturday - startingMonday;
                    int missingThusday = requirementThusday - startingSaturday - startingMonday - startingThusday;
                    int missingWednesday = requirementWednesday - startingMonday - startingThusday - startingWednesday;
                    int startingSunday = Math.max(Math.max(
                            Math.max(Math.max(missingSunday, missingMonday), missingThusday), missingWednesday), 0);

                    int employees = startingMonday + startingThusday + startingWednesday + startingThursday
                            + startingFriday + startingSaturday + startingSunday;
                    if (employees < minimumEmployees) {
                        minimumEmployees = employees;
                    }
                }
            }
        }

        System.out.println(minimumEmployees);
    }
}