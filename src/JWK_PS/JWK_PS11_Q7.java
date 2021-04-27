package JWK_PS;

import JWK_PS.SmartTVRemote;

class TV implements SmartTVRemote {
    @Override
    public void volumeUp() {
        System.out.println("Increasing Volume......");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decreasing Volume.....");
    }

    @Override
    public void previousChannel() {
        System.out.println("Previous Channel");
    }

    @Override
    public void nextChannel() {
        System.out.println("Next Channel");
    }

    @Override
    public void switchOn_Off() {
        System.out.println("Switch On & Off");
    }

    @Override
    public void mouseCursor() {
        System.out.println("Hovering Mouse Cursor");
    }

    @Override
    public void micFunction() {
        System.out.println("Listening to the voice and generating results");
    }

    public TV() {
        volumeUp();
        volumeDown();
        nextChannel();
        previousChannel();
        mouseCursor();
        micFunction();
        switchOn_Off();
    }
}

public class JWK_PS11_Q7 {
    public static void main(String[] args) {
        TV tv = new TV();
    }
}
