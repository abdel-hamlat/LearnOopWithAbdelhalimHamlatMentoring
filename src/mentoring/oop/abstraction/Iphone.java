package mentoring.oop.abstraction;

public abstract  class  Iphone {

    // Abstract class: is a restricted class that cannot be used to create objects
    //   (to access it, it must be inherited from another class).

    // Abstract method: can only be used in an abstract class, and it does not have a body.
    //    The body is provided by the subclass (inherited from).

    String iPhoneBrand;
    int iPhonePrice=1500;

    // we can declare abstract method and non abstract method

    public abstract void microphone(); // without body
    public abstract void speaker();
    public abstract void displayModule();
    public abstract void keyBoard();







}
