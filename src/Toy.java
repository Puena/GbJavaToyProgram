public class Toy {
    private int id;
    private String title;
    private int quantity;
    private double dropRate;

    public Toy(int id, String title, int quantity, double dropRate) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.dropRate = dropRate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDropRate() {
        return dropRate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDropRate(double dropRate) {
        this.dropRate = dropRate;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
