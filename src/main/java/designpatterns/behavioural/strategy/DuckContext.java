package designpatterns.behavioural.strategy;

public class DuckContext {

    private DuckQuackStrategy strategy;

    public DuckContext(DuckQuackStrategy strategy) {
        this.strategy = strategy;
    }

    public void quack() {

        if (null != strategy) {

            strategy.quack();
        } else {

            System.out.println("No quack for you my duck friend");
        }
    }
}
