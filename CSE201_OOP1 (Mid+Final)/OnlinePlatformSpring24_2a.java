public class OnlinePlatformSpring24_2a {
    String name, category;
    int capacity, noOfRegisteredUsers;

    OnlinePlatformSpring24_2a(String name, String category, int capacity, int noOfRegisteredUsers) {
        this.name = name;
        this.category = category;
        this.capacity = capacity;
        this.noOfRegisteredUsers = noOfRegisteredUsers;
    }
    public boolean register() {
        noOfRegisteredUsers++;
        if (noOfRegisteredUsers < capacity) {
            return true;
        }
        else {
            return false;
        }
    }
    public void increaseCapacity(int amt) {
        capacity += amt;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("category: " + category);
        System.out.println("capacity: " + capacity);
        System.out.println("No Of Registered Users: " + noOfRegisteredUsers);
    }
}
