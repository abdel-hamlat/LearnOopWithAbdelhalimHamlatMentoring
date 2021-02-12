package mentoring.oop.abstraction;

public interface Phone{

    //Interface: Interface is a guideline for future
    //  To achieve security - hide certain details and only show the important details of an object (interface).

    /*
•	Like abstract classes, interfaces cannot be used to create objects (
•	Interface methods do not have a body - the body is provided by the "implement" class
•	On implementation of an interface, you must override all of its methods
•	Interface methods are by default abstract and public
•	Interface attributes are by default public, static and final
•	An interface cannot contain a constructor (as it cannot be used to create objects)
// in Interface we can not declare variable but we can declare and assign value during creating variable
// we can declare a multiples interfaces inside an interface */

    public interface SecondPhone{

    }
    int price=450; // they are final
    String phoneName="NOKIA";
    double screenSize=7.12;

    // methods

    public void screen();
    public void memoryCapacity();
    public void camera();
    public void GPC();
    public void battery();

    // we can declare a method with body by using the keyword :static
    public static  void simCard(){
        System.out.println("phone is life ");
    }
    // we can declare a return type of method inside interface

    static int phonePrice2(int price,int taxes){
        int phonePrice2=price+taxes;
        System.out.println("phone full price is "+phonePrice2);
        return phonePrice2;
    }








}
