package designpatterns.behavioural.strategy;

public class RoboDuckQuack implements DuckQuackStrategy{
    @Override
    public void quack() {
        System.out.println("Robo duck quack");
    }
}
