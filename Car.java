package OOP_Principle.Encapsulation_and_Inheritance;

public class Car {
    public String color;
    public String model;
    private double fuellevel;
    private long costOfPurchase;

    public Car(){
        
    }

    public Car(String color, String model, double fuellevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuellevel=").append(fuellevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }
}
