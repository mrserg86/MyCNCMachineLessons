public class Runner {

    public static void main(String[] args) {

        LatheMachine latheMachine = new LatheMachine();
        MillingMachine millingMachine = new MillingMachine();

        latheMachine.startMachine();

        millingMachine.startMachine();

    }

}
