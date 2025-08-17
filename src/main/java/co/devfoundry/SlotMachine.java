package co.devfoundry;

public class SlotMachine {
    State state;

    public SlotMachine() {this.state = new NoCoinState();}

    public void insertCoin(){
        state.insertTheCoin(this);
    };
    public void pullTheLever(){
        state.pullTheLever(this);
    };
    public void takePrize(){
        state.takeThePrize(this);
    };
    public void displayCurrentState(){
        state.displayCurrentState(this);
    };
}
