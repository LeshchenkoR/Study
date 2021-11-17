package Module4;

public class Workbench {
    private int oil;
    private boolean isOff;
    private final String name;

    void makeDetaild(int amount) {
        if (this.oil >= amount) {
            this.oil -= amount;
            System.out.println("Изготовлено " + amount + " деталей");
        } else if (this.oil < amount) {
            System.out.println("Недостаточно масла");
            this.isOff = true;
        }

    }

    void refuel(int refOil) {
        this.oil += refOil;
        System.out.println("Готов к работе");
        this.isOff = false;
    }

    void start() {
        this.isOff = false;
    }

    public Workbench(int oil, String name) {
        this.oil = oil;
        this.name = name;
    }

    public static void main(String[] args) {
        Workbench workbench = new Workbench(100, "S001");
        workbench.start();
        workbench.makeDetaild(90);
    }
}
