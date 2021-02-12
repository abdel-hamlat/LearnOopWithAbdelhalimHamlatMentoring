package mentoring.oop.abstraction;

public class Test {
    public static void main(String[] args) {
        Samsung sam=new Samsung();
        sam.camera();
        System.out.println(sam.price);
         sam.price=1000;
        System.out.println(sam.price);

        System.out.println("*************** LG");
        LG lg=new LG();
        lg.microphone();
        System.out.println(lg.iPhonePrice); //
        lg.iPhoneBrand="apple 12";
        System.out.println(lg.iPhoneBrand);





    }
}
