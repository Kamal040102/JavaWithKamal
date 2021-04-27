package JWK_PS;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    @Override
    void ring() {
        System.out.println("Ringing............");
    }

    @Override
    void lift() {
        System.out.println("Lifted............");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnected.............");
    }

    public SmartTelephone() {
        ring();
        lift();
        disconnect();
    }
}

public class JWK_PS11_Q4 {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
    }
}
