public class TestGadgetFall23_2b {
    public static void main(String[] args) {
        // i)
        GadgetFall23_2a myGadget = new GadgetFall23_2a("Samsung", "Galaxy", 999.99);
        //ii)
        myGadget.setPrice(1100);
        //iii)
        myGadget.isAffordable();
        System.out.println("gadget is affordable: ?" + myGadget.isAffordable());
    }
}
