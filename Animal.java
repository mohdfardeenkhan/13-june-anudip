package practice;


class Animals {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}


class Dog extends Animals {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animals {
    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}

public class Animal {
    public static void main(String[] args) {
   
        Animals dog = new Dog();
        Animals cat = new Cat();
        Animals cow = new Cow();
        
       
        dog.makeSound();  // Should print "Woof"
        cat.makeSound();  // Should print "Meow"
        cow.makeSound();  // Should print "Moo"
    }
}

