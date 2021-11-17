package Praktikum_M4;

public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 60;
    }

    public Human(String name, String address){
        this.name = name;
        this.age = 24;
        this.weight = 60;
        this.address = address;
    }

    public Human(String name, int age, int weight){
        this(name, age);
        this.weight = weight;
    }

    public Human(String name, int age, String work){
        this(name, age);
        this.work = work;
    }

    public Human(String name, int age, int weight, String address, String work){
        this.name = "Misha";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
