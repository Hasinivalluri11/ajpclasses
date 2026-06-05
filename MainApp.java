package Day10;


class Heart {
    int weight;
    int bpm;

    Heart(int weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }

    void displayHeart() {
        System.out.println("Heart Weight : " + weight);
        System.out.println("Heart BPM    : " + bpm);
    }
}


class Brain {
    int weight;
    String colour;

    Brain(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    void displayBrain() {
        System.out.println("Brain Weight : " + weight);
        System.out.println("Brain Colour : " + colour);
    }
}


class Bike {
    String brand;
    int mileage;

    Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void displayBike() {
        System.out.println("Bike Brand   : " + brand);
        System.out.println("Bike Mileage : " + mileage);
    }
}


class Book {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book Name    : " + name);
        System.out.println("Book Author  : " + author);
    }
}


class Student {

    // Aggregation
    Heart h = new Heart(300, 72);
    Brain b = new Brain(1400, "Grey");

    // Association
    Bike bk = new Bike("Royal Enfield", 40);
    Book bo = new Book("Java Programming", "James Gosling");

    void hasA() {
        System.out.println("Student has a Heart");
        h.displayHeart();

        System.out.println();

        System.out.println("Student has a Brain");
        b.displayBrain();
    }

    void ownsA() {
        System.out.println("Student owns a Bike");
        bk.displayBike();

        System.out.println();

        System.out.println("Student reads a Book");
        bo.displayBook();
    }
}


public class MainApp {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("----- Aggregation Example -----");
        s.hasA();

        System.out.println();

        System.out.println("----- Association Example -----");
        s.ownsA();
    }
}