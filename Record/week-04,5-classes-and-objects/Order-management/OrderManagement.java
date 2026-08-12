class Customer {
    String name;
    String location;

    Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void sendOrder() {
        System.out.println(name + " has sent the order.");
    }

    void receiveOrder() {
        System.out.println(name + " has received the order.");
    }
}

class Order {
    String date;
    String number;

    Order(String date, String number) {
        this.date = date;
        this.number = number;
    }

    void confirm() {
        System.out.println("Order Confirmed.");
    }

    void close() {
        System.out.println("Order Closed.");
    }
}

class SpecialOrder extends Order {

    SpecialOrder(String date, String number) {
        super(date, number);
    }

    void dispatch() {
        System.out.println("Special Order Dispatched.");
    }
}

class NormalOrder extends Order {

    NormalOrder(String date, String number) {
        super(date, number);
    }

    void dispatch() {
        System.out.println("Normal Order Dispatched.");
    }

    void receive() {
        System.out.println("Normal Order Received.");
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        Customer c = new Customer("Pranadeep", "Visakhapatnam");

        System.out.println("----- Special Order -----");
        SpecialOrder so = new SpecialOrder("12-08-2026", "SO101");
        c.sendOrder();
        so.confirm();
        so.dispatch();
        so.close();

        System.out.println();

        System.out.println("----- Normal Order -----");
        NormalOrder no = new NormalOrder("12-08-2026", "NO201");
        c.sendOrder();
        no.confirm();
        no.dispatch();
        no.receive();
        no.close();
        c.receiveOrder();
    }
}
