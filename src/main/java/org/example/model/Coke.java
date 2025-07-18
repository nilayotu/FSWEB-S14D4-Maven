package org.example.model;

public class Coke extends ProductForSale{

    private Boolean hasSugar;
    private double size;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                ", size=" + size +
                '}';
    }
}
