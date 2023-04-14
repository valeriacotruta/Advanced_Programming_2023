package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Cell{
    private List<Token> tokenInCell;
    private boolean isVisited;
    public Cell(){
        this.isVisited = false;
        this.tokenInCell = new ArrayList<>();
    }

    public void setTokenInCell(List<Token> tokenInCell) {
        this.tokenInCell = tokenInCell;
    }

    public void setVisited() {
        this.isVisited = true;
    }

    public boolean getisVisited() {
        return this.isVisited;
    }

//    public List<Token> getTokenInCell() {
//        return tokenInCell;
//    }

    @Override
    public String toString() {
        return "Cell{" +
                "tokenInCell=" + tokenInCell +
                ", isVisited=" + isVisited +
                '}';
    }
}