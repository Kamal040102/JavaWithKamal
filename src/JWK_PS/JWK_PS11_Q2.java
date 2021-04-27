package JWK_PS;

import JWK_PS.pen;

class fountainPen extends pen{
    void changeNib(){
        System.out.println("Changing Nib of the fountain pen.");
    }

    @Override
    public void write(){
        System.out.println("Writing with Pen");
    }

    @Override
    public void refill(){
        System.out.println("Refilling the pen");
    }
}

public class JWK_PS11_Q2 {
    public static void main(String[] args) {
        fountainPen fp = new fountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
