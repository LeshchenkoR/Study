package Praktikum_M4;

public class Programmer {
    String name, company, position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition() {
        return position;
    }

    void work() {
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Pom", "IBM");
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
    }

}



