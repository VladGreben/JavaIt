package Module3.Task1.Vebinar;

public class Car {
    int year;
    String model;
    int price;
    String nameOfTheOwner;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;

    }

    public Car(int year, String model, int price, String nameOfTheOwner) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.nameOfTheOwner = nameOfTheOwner;
    }

    void printOwnerName(){
        System.out.println(nameOfTheOwner);
    }
    void printYear(){
        System.out.println(year);
    }
}
