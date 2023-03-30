import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to metric converter!");
    System.out.println("Please input your query. For example, 1 km = m.");
    System.out.println("Enter 'exit' or '-1' to exit the program");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine();
      if (input.equals("exit") || input.equals("-1")) {
        break;
      }

      String[] parts = input.split("\\s+");
      if (parts.length != 4) {
        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lba");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
        
        continue;
      }

      double value = Double.parseDouble(parts[0]);
      String fromUnit = parts[1];
      String toUnit = parts[3];

      if (fromUnit.equals("kg") && toUnit.equals("lb")) {
        value = value * 2.20462;
        System.out.println(value + " lb");
      } else if (fromUnit.equals("lb") && toUnit.equals("kg")) {
        value = value / 2.20462;
        System.out.println(value + " kg");
      } else if (fromUnit.equals("g") && toUnit.equals("oz")) {
        value = value * 0.035274;
        System.out.println(value + " oz");
      } else if (fromUnit.equals("oz") && toUnit.equals("g")) {
        value = value / 0.035274;
        System.out.println(value + " g");
      } else if (fromUnit.equals("km") && toUnit.equals("mi")) {
        value = value * 0.621371;
        System.out.println(value + " mi");
      } else if (fromUnit.equals("mi") && toUnit.equals("km")) {
        value = value / 0.621371;
        System.out.println(value + " km");
      } else if (fromUnit.equals("mm") && toUnit.equals("in")) {
        value = value * 0.0393701;
        System.out.println(value + " in");
      } else if (fromUnit.equals("in") && toUnit.equals("mm")) {
        value = value / 0.0393701;
        System.out.println(value + " mm");
      } else {
        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
      }
    }

    System.out.println("Exiting the program...");
    
  }
}