package Praktikum_M4;

public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void bark() {
        System.out.println("woof");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 12);
        int dog1Age = dog1.getAge();
        String dog1Name = dog1.getName();
        System.out.println(dog1Name + dog1Age);
    }
}
