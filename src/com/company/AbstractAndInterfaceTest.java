package com.company;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal a:animal
             ) {
            System.out.println(a.makeSound());

            if (a instanceof Chicken){
                Edible edible = (Chicken)a;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit f:fruit
             ) {
            System.out.println(f.howToEat());

        }
    }
}
