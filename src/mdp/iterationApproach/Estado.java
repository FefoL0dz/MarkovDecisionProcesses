package mdp.iterationApproach;

public class Estado {
        final int row, col;
        double probabilidade;
        double utilidade;
        Acao action;
        boolean terminate;
        int index;
        // The following two members are used to trace a proper policy
        boolean visited;
        boolean[] actionTaken = new boolean[4];

        public Estado(int row, int col, double probabilidade, double utilidade) {
            this.row = row;
            this.col = col;
            this.probabilidade = probabilidade;
            this.utilidade = utilidade;

            this.terminate = false;
            this.index = -1;
            this.action = null;
            this.visited = false;
            for(int i=0; i<4; ++i)
                actionTaken[i] = false;
        }

        public void setTerminate() {
            this.terminate = true;
        }

        public boolean equals(Object s){
            if((s != null) && (s instanceof Estado)){
                if(((Estado)s).row == this.row && ((Estado)s).col == this.col)
                    return true;
                else
                    return false;
            }
            return false;
        }

        public String toString(){
            return "("+row+","+col+")";
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public boolean isTerminate() {
            return terminate;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        /**
         * @return
         */
        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
}
