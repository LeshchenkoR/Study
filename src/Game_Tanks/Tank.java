package Game_Tanks;

public class Tank {
    private int x, y;
    private int fuel;
    private int dir;
    private static int tankCount;
    private int tankNumber;
    private final String MODEL = "Т-34";

    public Tank(int x, int y, int fuel) { //конструктор с 3-мя аргументами
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        tankCount++;
        this.tankNumber = tankCount;
    }

    public Tank(int x, int y) { //конструктор с 2-мя аргументами
        this(x, y, 100);
        this.tankNumber = tankCount;
    }

    public Tank() { //конструктор без аргументов
        this(0, 0, 100);
        this.tankNumber = tankCount;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void goForward(int i) {
        if (i < 0 && -i > fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + tankNumber + "  is at " + x + ", " + y + " now.");
    }
}
