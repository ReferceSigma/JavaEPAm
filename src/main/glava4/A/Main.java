package main.glava4.A;

public class Main {
    public static void main(String[] args) {

        Puppy puppy = new Puppy("Барсик");


        System.out.println("Имя щенка: " + puppy.getName());


        puppy.bark();   // Лаять
        puppy.jump();   // Прыгать
        puppy.run();    // Бегать
        puppy.bite();   // Кусать
        puppy.whine();  // Скулить


        Puppy anotherPuppy = new Puppy("Барсик");


    }
}

