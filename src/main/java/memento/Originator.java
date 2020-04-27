package memento;

/**
 * @author yangxin_ryan
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMenmento(Memento memento) {
        state = memento.getState();
    }
}
