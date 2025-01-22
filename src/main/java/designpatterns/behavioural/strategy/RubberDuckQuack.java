package designpatterns.behavioural.strategy;

public class RubberDuckQuack implements DuckQuackStrategy{
    @Override
    public void quack() {
        System.out.println("Rubber duck quack");
    }
}
