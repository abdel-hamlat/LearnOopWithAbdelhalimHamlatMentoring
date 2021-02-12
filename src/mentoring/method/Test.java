package mentoring.method;

public class Test {

    public static void main(String[] args) {

        Method.doMulty();

        Method mo=new Method();
//        mo.square(5);
        System.out.println(mo.square(5));
        mo.getRectArea(45,10);

        mo.display();
        mo.employeeInfo("halim","hamlat","jersey");
    }

}
