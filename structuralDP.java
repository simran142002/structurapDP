// Target interface
interface Target {
    void request();
}

// Adaptee (the class to be adapted)
class Adaptee {
    public void specificRequest() {
        System.out.println("Specific request from Adaptee");
    }
}

// Adapter class
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create an Adaptee object
        Adaptee adaptee = new Adaptee();

        // Create an Adapter object and pass the Adaptee to it
        Target adapter = new Adapter(adaptee);

        // Use the Adapter to call the request method
        adapter.request();
    }
}
