package lodes;

public class ActionPossibility {

    public State currentState;

    public State successorState;

    public double probability;

    public double discard;

    public ActionPossibility(State currentState, State successorState, double probability, double discard) {
        this.currentState = currentState;
        this.successorState = successorState;
        this.probability = probability;
        this.discard = discard;
    }
}
