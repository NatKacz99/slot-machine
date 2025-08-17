package co.devfoundry;

public interface State {
    void insertTheCoin(SlotMachine slotMachine);
    void pullTheLever(SlotMachine slotMachine);
    void takeThePrize(SlotMachine slotMachine);
    void displayCurrentState(SlotMachine slotMachine);
}
