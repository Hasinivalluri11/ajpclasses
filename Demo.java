package Day10;



class Plane1 {

    void takeOff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane1 {

    @Override
    void fly() {
        System.out.println("Cargo plane flies at low height");
    }

    void carryCargo() {
        System.out.println("Cargo plane carries cargo");
    }
}

class PassengerPlane extends Plane1 {

    @Override
    void fly() {
        System.out.println("Passenger plane flies at medium height");
    }

    void carryPassengers() {
        System.out.println("Passenger plane carries passengers");
    }
}

class FighterPlane extends Plane1{

    @Override
    void fly() {
        System.out.println("Fighter plane flies at great height");
    }

    void carryWeapons() {
        System.out.println("Fighter plane carries weapons");
    }
}

public class Demo {

    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.land();
        cp.carryCargo();

        System.out.println();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.land();
        pp.carryPassengers();

        System.out.println();

        FighterPlane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
    }
}