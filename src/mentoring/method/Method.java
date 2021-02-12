package mentoring.method;

public class Method {

     /*
    A method is a block of code which only runs when it is called.

    You can pass data, known as parameters, into a method.

    Methods are used to perform certain actions, and they are also known as functions.

    Why use methods? To reuse code: define the code once, and use it many times.
    also you cannot declare a method inside another method

      */


    //return method without paraemter

    /**
     *
     * @return
     */
    public static double doMulty(){
        double number1=15.25;
        double number2=10.55;
        System.out.println("multiplication is "+ number1*number2);
        return number1*number2;
    }

    // return method with parameter
    // syntax : accessModifier dataType name ( ){    return     }

    public int square(int x){
       return x*x;

    }

    // return method with multiple parameter

    public int getRectArea(int width,int height){
        System.out.println("rectArea :"+width+height);
        return width+height;
    }
  //non return type without parameter /// void

    public void display(){
        System.out.println(" this is a non return method without parameter ");

    }
    public void employeeInfo(String firstName,String lastName,String address){
        System.out.println("firstName "+firstName+" lastName "+lastName+" address "+address);


    }







}
