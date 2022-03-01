public class BingoChip<S, T>{
    S r;
    T c;
public BingoChip(S r, T c){
    this.r = r;
    this.c = c;
}
@Override
    public String toString(){
    return "Chip:" + this.r + "-" + this.c;
}

}


