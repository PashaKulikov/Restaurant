public class Waiter extends Thread {
    private Restaurant restaurant;


    public Waiter(String name,Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {


        restaurant.bringOrder();


    }
}
