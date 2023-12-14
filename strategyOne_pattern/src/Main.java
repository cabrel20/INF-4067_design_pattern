public class Main {
    public static void main(String[] args) {
        Strategy strategy = new StrategyConcreteA();
        Strategy strategy1 = new StrategyConcreteB();

        Context context = new Context(strategy);
        context.display();

        context = new Context(strategy1);
        context.display();

    }
}