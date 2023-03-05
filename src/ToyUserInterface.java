import java.util.Scanner;

public class ToyUserInterface implements IUserInterface{
    private Scanner scanner;
    private IToyProgram toyProgram;
    private IWiningToyWriter winingToyWriter;

    public ToyUserInterface(IToyProgram program, IWiningToyWriter writer) {
        scanner = new Scanner(System.in);
        toyProgram = program;
        winingToyWriter = writer;
    }

    public void run() {
        while (true) {
            System.out.println("Select id of action. For example type 1 for add new toy.");
            System.out.println("1. Add a new toy");
            System.out.println("2. Change the drop rate of a toy");
            System.out.println("3. Select a prize toy");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewToy();
                    break;
                case 2:
                    changeToyDropRate();
                    break;
                case 3:
                    selectPrizeToy();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

    private void addNewToy() {
        System.out.println("Enter the toy ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the toy title:");
        String title = scanner.nextLine();

        System.out.println("Enter the toy quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the toy drop rate:");
        double dropRate = scanner.nextDouble();
        scanner.nextLine();

        toyProgram.addToy(new Toy(id, title, quantity, dropRate));
        System.out.println("Toy added successfully!");
    }

    private void changeToyDropRate() {
        System.out.println("Enter the ID of the toy whose drop rate you want to change:");
        int toyId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the new drop rate:");
        double newDropRate = scanner.nextDouble();
        scanner.nextLine();

        toyProgram.changeToyDropRate(toyId, newDropRate);
        System.out.println("Drop rate changed successfully!");
    }

    private void selectPrizeToy() {
        Toy prizeToy = toyProgram.selectPrizeToy();
        if (prizeToy == null) {
            System.out.println("No toys left to give away!");
        } else {
            winingToyWriter.Write(prizeToy);
            System.out.println("Congratulations! You won a " + prizeToy.getTitle() + "!");
        }
    }

}
