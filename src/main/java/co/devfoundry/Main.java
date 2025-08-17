package co.devfoundry;

public class Main {
    public static void main(String args[]){
        SlotMachine slotMachine = new SlotMachine();

        slotMachine.insertCoin();
        slotMachine.pullTheLever();
        slotMachine.takePrize();
        slotMachine.displayCurrentState();
    }
}
