package day11;

public class Exercise01 {
    public static void main(String[] args) {
        Jogging j = new Jogging();
        Yoga y = new Yoga();
        Hiit hi = new Hiit();
        Person p1 = new Person();
        p1.keepHealth(j);
        System.out.println("============");
        p1.keepHealth(y);
        System.out.println("============");
        p1.keepHealth(hi);
    }
}

//in abstract class, there are abstract methods, and normal methods
abstract class Sport {
    public abstract void exercise();
    public void rest() {
        System.out.println("slow down, take a break");
    }
}

class Jogging extends Sport {
    public void exercise() {
        System.out.println("use 30 mins to run 5KM");
    }
}

class Yoga extends Sport {
    public void exercise() {
        System.out.println("stretch and meditation");
    }
}

class Hiit extends Sport {
    public void exercise() {
        System.out.println("follow a video, start this high-intensity interval training");
    }
}

class Person {
    public void keepHealth(Sport s) {
        System.out.println("time to work out");
        s.exercise();
        System.out.println("30 mins passed");
        s.rest();
    }
}













