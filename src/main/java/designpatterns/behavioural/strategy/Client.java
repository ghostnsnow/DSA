package designpatterns.behavioural.strategy;

public class Client {

    public static void main(String[] args) {

        DuckQuackStrategy strategyRobo = new RoboDuckQuack();
        DuckContext duckRobo = new DuckContext(strategyRobo);

        duckRobo.quack();

        DuckQuackStrategy strategyRubber = new RubberDuckQuack();
        DuckContext duckRubber = new DuckContext(strategyRubber);

        duckRubber.quack();

        //DuckQuackStrategy strategyLive = new RoboDuckQuack();
        DuckContext duckLive = new DuckContext(null);

        duckLive.quack();
    }
}
