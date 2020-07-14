package mdp.iterationApproach;

public class Acao {
    int acao;

    public Acao(int acao) {
        this.acao = acao;
    }

    /**
     * This constructor relies on specific type of action, namely
     * a 4-neighbor type action.  Shouldn't be used.  It's here only
     * for conv
     *
     * enience.
     * @param a A string of action type.
     */
    public Acao(String a) {
        if(a.equals("north"))
            acao = 0;
        else if(a.equals("east"))
            acao = 1;
        else if(a.equals("south"))
            acao = 2;
        else if(a.equals("west"))
            acao =3;
        else
            throw (new IllegalArgumentException("Illegal action:"+a));
    }

    public int getIndex() {
        return acao;
    }

    public boolean equals(Object a) {
        if( (a!=null) && (a instanceof Acao)){
            if( ((Acao)a).acao == this.acao)
                return true;
            else
                return false;
        }
        return false;
    }

    public String toString() {
        switch (acao) {
            case 0: return "north";
            case 1: return "east";
            case 2: return "south";
            case 3: return "west";
        }
        return null;
    }

    public String toSign() {
        switch (acao) {
            case 0: return "^";
            case 1: return ">";
            case 2: return "V";
            case 3: return "<";
        }
        return null;
    }
}