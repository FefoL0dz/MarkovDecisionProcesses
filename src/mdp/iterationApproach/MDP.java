package mdp.iterationApproach;
import java.util.*;

public class MDP {
    int rows, cols;
    Estado[][] grid;
    Vector reachableStates;
    int numReachableStates = 0;

    static final int ACTION_UP = 0;
    static final int ACTION_RIGHT = 1;
    static final int ACTION_DOWN = 2;
    static final int ACTION_LEFT = 3;
    static final int ACTION_STAY = 4; //stay is not an action per se.
    static final int numActions = 4;
}
