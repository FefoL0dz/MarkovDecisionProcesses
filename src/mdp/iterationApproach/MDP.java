package mdp.iterationApproach;
import java.util.*;

public class MDP {
    int rows, cols;
    Estado[][] grid;
    Vector reachableStates;
    int numReachableStates = 0;

    static final int MOVE_NORTH = 0;
    static final int MOVE_EAST= 1;
    static final int MOVE_SOUTH = 2;
    static final int MOVE_WEST = 3;
    static final int ACTION_STAY = 4; //stay is not an action per se.
    static final int numAcoes = 4;

    static final int numResultingStates = numAcoes+1;
    Acao[] acoes;
}
