import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WiningToyFileWriter implements IWiningToyWriter {
    private String filename;

    public WiningToyFileWriter(String filename) {
        this.filename = filename;
    }

    @Override
    public void Write(Toy toy) {
        try {
            FileWriter writer = new FileWriter("winning_toy.txt", true);
            writer.write("Win at " + new Date() + " ");
            writer.write(toy.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
