package Module4;

import java.io.PrintStream;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Indian", 2019, "Carbon");
       // PrintStream var10000 = System.out;
       // String var10001 = motorbike.getModel();
       // var10000.println(var10001 + "\n" + motorbike.getYear() + "\n" + motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}
