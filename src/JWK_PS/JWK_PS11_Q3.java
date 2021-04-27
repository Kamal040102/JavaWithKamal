package JWK_PS;

class Monkey{
    void jump(){
        System.out.println("Jumping........");
    }

    void bite(){
        System.out.println("Biting........");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    void jump() {
        super.jump();
    }
    @Override
    void bite() {
        super.bite();
    }

    @Override
    public void eat() {
        System.out.println("Eating.....");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping.......");
    }
}

public class JWK_PS11_Q3 {
    public static void main(String[] args) {
        Human h = new Human();
        h.bite();
        h.eat();
        h.jump();
        h.sleep();
    }
}
