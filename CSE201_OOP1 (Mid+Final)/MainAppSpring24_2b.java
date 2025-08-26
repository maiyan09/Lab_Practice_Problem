public class MainAppSpring24_2b {
    public static void main(String[] args) {
        // Reg. ID: 24101173
        OnlinePlatformSpring24_2a mySite = new OnlinePlatformSpring24_2a("Coursera", "Education",1173, 173);
        for (int i = 0; i < 10; i++){
            mySite.register();
        }
        if(!(mySite.register())) {
            System.out.println("Over the limit. Try latter.");
        }
        mySite.increaseCapacity((3+2)); // 24101173 last digit 3
        mySite.display();
    }
}
