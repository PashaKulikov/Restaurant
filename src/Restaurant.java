import java.util.function.DoubleToIntFunction;

public class Restaurant {
   Order order = new Order();
    public void makeOrder() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " что - то заказывает...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            order.addOrder();
            System.out.println(Thread.currentThread().getName() + " сделал заказ");
            notifyAll();
        }
    }
    public void bringOrder() {

        synchronized (this) {
            while (order.getCount() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        while (order.getCount()>0)
            order.deleteOrder();
            System.out.println(Thread.currentThread().getName() + "Принимает заказ");
            System.out.println(Thread.currentThread().getName() + "Принял заказ");

            System.out.println(Thread.currentThread().getName() + "Принес блюдо");

        }
    }
}


