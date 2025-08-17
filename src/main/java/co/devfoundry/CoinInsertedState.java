package co.devfoundry;

import java.util.Random;

public class CoinInsertedState implements State{
    static final private Random random  = new Random();
    public void insertTheCoin(SlotMachine slotMachine){
        System.out.println("The coin has already been inserted.");
    }
    public void pullTheLever(SlotMachine slotMachine){
        System.out.println("Drawing is in progress...");
        int result = random.nextInt(99);
        if(result < 20){
            System.out.println("Win! You take your price!");
            slotMachine.state = new WinState();
        } else{
            System.out.println("Loss! Maybe next time?");
            slotMachine.state = new NoCoinState();
        }
    }
    public void takeThePrize(SlotMachine slotMachine){
        System.out.println("Pull the lever to check your blessing!");
    }
    public void displayCurrentState(SlotMachine slotMachine){
        System.out.println("Current state - coin inserted.");
    }
}
