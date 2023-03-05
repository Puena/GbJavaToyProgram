public class Main {
    public static void main(String[] args) {
        // init
        ToyProgram toyProgram = new ToyProgram();
        WiningToyFileWriter toyFileWriter = new WiningToyFileWriter("wining_toys.txt");
        ToyUserInterface uInterface = new ToyUserInterface(toyProgram, toyFileWriter);

        // prepare some data
        toyProgram.addToy(new Toy(1, "Monkey", 10, 0.1));
        toyProgram.addToy(new Toy(2, "Dinosaur", 5, 0.05));
        toyProgram.addToy(new Toy(3, "Pink Bear", 20, 0.2));

        // run
        uInterface.run();
    }
}