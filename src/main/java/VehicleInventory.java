import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Vehicle[] inventory = new Vehicle[20];
        Scanner scanner = new Scanner(System.in);
        int count = 6;

        inventory[0] = new Vehicle(1, "Honda", "Black", 3000, 23003.0F);
        inventory[1] = new Vehicle(2, "Ford", "Blue", 2300, 34999.0F);
        inventory[2] = new Vehicle(3, "Nissan", "Red", 1123, 34656.0F);
        inventory[3] = new Vehicle(4, "Hyundai", "White", 6324, 35435.0F);
        inventory[4] = new Vehicle(5, "Chevrolet", "Green", 54231, 354545.0F);
        inventory[5] = new Vehicle(6, "Toyota", "Brown", 87676, 25545.0F);

        boolean exit = false;
        while (!exit) {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - Find vehicles that match make/mode");
            System.out.println(" 2 - Find vehicles that fall within a price range");
            System.out.println(" 3 - Find vehicles that match a color");
            System.out.println(" 4 - List all vehicles");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");
            int Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Enter a vehicle ID:");
                    int id = scanner.nextInt();
                    scanner.next();
                    Vehicle vehicle = null;
                    for (int i = 0; i < count; i++) {
                        if (inventory[i].getVehicleId() == id){
                            vehicle = inventory[1];
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("You chose option 2");
                    break;
                case 3:
                    System.out.println("You chose option 3");
                    break;
                case 4:
                    System.out.println("You chose option 4");
                    break;
                case 5:
                    System.out.println("you chose option 5");
                    break;
                case 6:
                    System.out.println("Exiting");
                    exit = true;
                    break;
                default:
                    System.out.println("Try again!");
                    break;
            }
        }
    }
}