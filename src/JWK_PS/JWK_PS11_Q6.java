package JWK_PS;

interface TVRemote{
    void volumeUp();
    void volumeDown();
    void previousChannel();
    void nextChannel();
    void switchOn_Off();
}

interface SmartTVRemote extends TVRemote{
    void mouseCursor();
    void micFunction();
}

public class JWK_PS11_Q6 {
    public static void main(String[] args) {

    }
}
