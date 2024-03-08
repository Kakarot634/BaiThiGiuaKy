package Bai2;

public abstract class Animal {
    public String name;
    public int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void makeSounds (){}
    public void move (){};

    public abstract void makeSound();

    public static void main(String[] args) {
        Dog dog = new Dog("Chó", 3);
        dog.makeSound();
        dog.move();

        Cat cat = new Cat("Mèo", 2);
        cat.makeSound();
        cat.move();

        Bird bird = new Bird("Chim đại bàng", 1);
        bird.makeSound();
        bird.move();
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " đang sủa.");
        System.out.println(getName() + " hiện đang " + getAge() + " tuổi");
    }

    public void move() {
        System.out.println(getName() + " đang chạy.");
        System.out.println("--------------------------");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " đang kêu meow");
        System.out.println(getName() + " hiện đang " + getAge() + " tuổi");
    }

    public void move() {
        System.out.println(getName() + " đang chạy.");
        System.out.println("--------------------------");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " đang hót.");
        System.out.println(getName() + " hiện đang " + getAge() + " tuổi");
    }

    public void move() {
        System.out.println(getName() + " đang bay.");
        System.out.println("--------------------------");
    }
}
