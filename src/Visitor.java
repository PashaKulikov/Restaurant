public class Visitor extends Thread{
    private Restaurant restaurant;
    private String name;

    public Visitor(Restaurant restaurant, String name) {
        super(name);
        this.restaurant = restaurant;

    }
@Override
    public void run() {
    try {
        sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    restaurant.makeOrder();
    }
}
