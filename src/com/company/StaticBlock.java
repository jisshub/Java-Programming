public class StaticBlock {
    public static void main(String[] args) {
        MyCars car1 = new MyCars();
        car1.getCar();
    }
}

class MyCars{
//    instance variable
    String carModel = "Hyundai";
//    static variable
    static String oldModel = "santro";
    static float OldcarPice = 78566.44f;
//    invoked after static block
    void getCar(){ System.out.println("My new Car: "+ carModel); }

//    static block
//    will b executed at first
    static { System.out.println("My old car: " + oldModel); }
    static {System.out.println("My old car price: " +OldcarPice );}
}