package Lesson02;

public class Client implements Comparable<Client> {
    private String nickName;
    private int ordersNumber;

    public Client(String nickName, int ordersNumber) {
        this.nickName = nickName;
        this.ordersNumber = ordersNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    @Override
    public String toString() {
        return nickName +" "+ ordersNumber;
    }

    @Override
    public int compareTo(Client c) {
        return -Integer.compare(this.ordersNumber, c.ordersNumber);
    }
}
