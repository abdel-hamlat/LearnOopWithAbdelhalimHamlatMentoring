package mentoring.oop.abstraction;

public class Samsung implements Phone,NewPhone{
 // concrete class
    // rule= a class can implement a multiple interfaces

    int price=15; // we can reAssign a value inside the concrete class

    public void screen() {
        System.out.println("Samsung has a screen ");
    }

    public void memoryCapacity() {
        System.out.println("Samsung has a memoryCapacity ");

    }

    public void camera() {
        System.out.println("Samsung has a camera ");

    }

    public void GPC() {
        System.out.println("Samsung has a GPC ");

    }

    public void battery() {
        System.out.println("Samsung has a good battery ");

    }

    public void radio() {
        System.out.println("samsung has radio ");
    }

    public void radio2() {

    }
}
