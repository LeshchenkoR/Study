package Praktikum_M4;

public class Balance {
    int r = 0, l = 0;

    void addRight(int n) {
        r += n;
    }

    void addLeft(int n) {
        l += n;
    }

    String getSituation() {
        if (r == l) return "=";
        else if (r > l) return "r";
        else return "l";
    }
}