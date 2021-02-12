package mentoring.oop.encapsulation;

public class Mobile {
     /*
    The whole idea behind encapsulation is to hide the implementation details from users.
     If a data member is private it means it can only be accessed within the same class.
      No outside class can access private data member (variable) of other class.
     */

    String mobileName="motorola";
    private int mobilePrice;
    private int screenSize;
    private int memoryCapacity;
    private double cameraResolution;
    private double checkCharge;


    // to have the access from another class we need getter and setter method

    //1 getter method is a return type method
    // 1 setter method is non return method

    // getter
    public int getMobilePrice(){
        return mobilePrice;
    }
    // setter
    public void setMobilePrice(int mobilePrice){
        this.mobilePrice=mobilePrice;

    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public double getCheckCharge() {
        return checkCharge;
    }

    public void setCheckCharge(double checkCharge) {
        this.checkCharge = checkCharge;
    }
}
