public class Carpet {
    // write code here
    private double cost;

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }


}
