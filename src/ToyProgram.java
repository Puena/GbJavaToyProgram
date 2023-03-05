import java.util.ArrayList;
import java.util.List;

public class ToyProgram implements IToyProgram{
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyDropRate(int id, double dropRate) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setDropRate(dropRate);
                break;
            }
        }
    }

    public Toy selectPrizeToy() {
        System.out.println(toys);
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getDropRate();
        }

        double randomNumber = Math.random() * totalWeight;
        double currentWeight = 0;
        for (int i = 0; i < toys.size(); i++) {
            Toy toy = toys.get(i);
            currentWeight += toy.getDropRate();
            if (randomNumber > currentWeight) {
                continue;
            }
            if (toy.getQuantity() > 0) {
                toy.setQuantity(toy.getQuantity() - 1);
                // remove only if qty equal 0
                if (toy.getQuantity() == 0) {
                    toys.remove(i);
                }
                return toy;
            } else {
                return null;
            }
        }

        return null;
    }
}
