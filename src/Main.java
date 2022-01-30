import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {



        Restaurant restaurant = new Restaurant();
        List<Visitor> visitors = new ArrayList<>(10);
        visitors.add(new Visitor(restaurant,"Посетитель 1"));
        visitors.add(new Visitor(restaurant,"Посетитель 2"));
        visitors.add(new Visitor(restaurant,"Посетитель 3"));
        visitors.add(new Visitor(restaurant,"Посетитель 4"));
        visitors.add(new Visitor(restaurant,"Посетитель 5"));
        visitors.add(new Visitor(restaurant,"Посетитель 6"));
        visitors.add(new Visitor(restaurant,"Посетитель 7"));
        visitors.add(new Visitor(restaurant,"Посетитель 8"));
        visitors.add(new Visitor(restaurant,"Посетитель 9"));
        visitors.add(new Visitor(restaurant,"Посетитель 10"));

        Waiter waiter1 = new Waiter("оффициант1",restaurant);
        Waiter waiter2 = new Waiter("оффициант2",restaurant);

        for (Visitor visitor:visitors) {
            visitor.start();


        }
        waiter1.start();
        waiter2.start();





    }
}
