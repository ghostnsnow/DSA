package designpatterns.behavioural.strategy;

public class LiveDuck extends DuckContext{

    public LiveDuck(DuckQuackStrategy strategy) {
        super(strategy);
    }
}
