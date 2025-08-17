package co.devfoundry;

public class NoCoinState implements State{
    public void insertTheCoin(SlotMachine slotMachine){
        System.out.println("Insert the coin.");
        slotMachine.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLever(SlotMachine slotMachine) {
        System.out.println("Insert the coin to check your blessing!");
    }

    public void takeThePrize(SlotMachine slotMachine){
        System.out.println("Insert the coin.");
    }

    public void displayCurrentState(SlotMachine slotMachine){
        System.out.println("Current state - no coin.");
    }
}
