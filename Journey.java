import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String place = "";
        double cost = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                location = "Bulgaria";
                place = "Camp";
                cost = budget * 0.30;
            } else if (season.equals("winter")) {
                location = "Bulgaria";
                place = "Hotel";
                cost = budget * 0.70;
            }
        }
        if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")) {
                location = "Balkans";
                place = "Camp";
                cost = budget * 0.40;
            } else if (season.equals("winter")) {
                location = "Balkans";
                place = "Hotel";
                cost = budget * 0.80;
            }
        }
        if (budget > 1000) {
            if (season.equals("summer")) {
                location = "Europe";
                place = "Hotel";
                cost = budget * 0.90;
            } else if (season.equals("winter")) {
                location = "Europe";
                place = "Hotel";
                cost = budget * 0.90;
            }
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", location,place,cost);

        }

        }




