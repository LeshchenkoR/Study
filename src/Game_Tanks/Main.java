package Game_Tanks;

public class Main {
    public static void main(String[] args) {
        Tank justTank = new Tank();
        Tank anywereTank = new Tank(10, 20);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywereTank.goBackward(-200);
        anywereTank.printPosition();
        customTank.goBackward(201);
        customTank.printPosition();
    }
}
