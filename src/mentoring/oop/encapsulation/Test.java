package mentoring.oop.encapsulation;

public class Test {

    public static void main(String[] args) {
        Mobile mob=new Mobile();
        System.out.println(mob.mobileName);

        mob.setMobilePrice(500);
        System.out.println(mob.getMobilePrice());

        mob.setCameraResolution(7.45);
        System.out.println(mob.getCameraResolution());
    }
}
