package lodes;

import java.util.ArrayList;
import java.util.List;

public class Action {

    private String north = "north";

    private String east = "east";

    private String south = "south";

    private String west = "west";

    public String actionName;

    public List<ActionPossibility> actionPossibilities = new ArrayList<>();

    public Action(String a) {
        if(a.equals(north) || a.equals(east) || a.equals(south) || a.equals(west))
            actionName = a;
        else
            throw (new IllegalArgumentException("Illegal action:" + a));
    }
}
