package JWK_PS;

import JWK_PS.Monkey;   // class
import JWK_PS.BasicAnimal;  // Interface
import JWK_PS.Human;    // class -> concrete

public class JWK_PS11_Q5 {
    public static void main(String[] args) {
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
    }
}
