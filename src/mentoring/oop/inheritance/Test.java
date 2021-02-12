package mentoring.oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Chef normalChef=new Chef();
        normalChef.makeChicken();

        System.out.println("**********************************");

        AlgerianChef algerian=new AlgerianChef();
       algerian.makeChicken();



        ChineseChef chinese =new ChineseChef();
        chinese.makeMarinatedRats();
    }
}
