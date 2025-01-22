package designpatterns.behavioural.strategy;

public class RubberDuck extends DuckContext{
    public RubberDuck(DuckQuackStrategy strategy) {
        super(strategy);
    }
}
