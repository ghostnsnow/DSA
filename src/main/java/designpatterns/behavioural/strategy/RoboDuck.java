package designpatterns.behavioural.strategy;

public class RoboDuck extends DuckContext{
    public RoboDuck(DuckQuackStrategy strategy) {
        super(strategy);
    }
}
