public interface IToyProgram {
    public void addToy(Toy toy);
    public void changeToyDropRate(int id, double dropRate);
    public Toy selectPrizeToy();
}
