package co.devfoundry;

public class WinState implements State{
    public void insertTheCoin(SlotMachine slotMachine){
        System.out.println("Collect your prize before playing again.");
    }
    public void pullTheLever(SlotMachine slotMachine){
        System.out.println("Collect your prize before playing again.");
    }
    public void takeThePrize(SlotMachine slotMachine){
        System.out.println("You received your prize.");
        slotMachine.state = new NoCoinState();
    }
    public void displayCurrentState(SlotMachine slotMachine){
        System.out.println("You won!");
    }
}
