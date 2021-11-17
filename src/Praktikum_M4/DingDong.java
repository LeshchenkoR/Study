package Praktikum_M4;

public class DingDong {
    String bell = "ding";

    public DingDong() {
    }

    public String sound() {
        if (this.bell.equals("ding")) {
            System.out.println(this.bell);
            this.bell = "dong";
        } else if (this.bell.equals("dong")) {
            System.out.println(this.bell);
            this.bell = "ding";
        }

        return this.bell;
    }

    public static void main(String[] args) {
        DingDong dingDong = new DingDong();
        dingDong.sound();
        dingDong.sound();
        dingDong.sound();
        dingDong.sound();
        dingDong.sound();
        dingDong.sound();
    }
}
