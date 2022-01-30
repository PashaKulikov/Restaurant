public class Order {
    private int count = 0;

    public void addOrder(){
        count +=1;
    }

    public void deleteOrder(){
        count -=1;
    }

    public int getCount() {
        return count;
    }
}
