import java.util.ArrayList;
import java.util.List;

public class Task {
public static class Triplet<U,T,V>{
    public U u;
    public T t;
    public V v;

    public Triplet(U u, T t, V v){
        this.u = u;
        this.t = t;
        this.v = v;

    }

}

    public static String result;
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
        t.add(new Triplet<>(4.5,5.4,"*"));
        t.add(new Triplet<>(2.0,0.0,"/"));
        t.add(new Triplet<>(56.0,28.0,"/"));



        t.forEach(obj -> result += "/n"+ c.compute(obj.u, obj.t, obj.v));
        System.out.println(result);
    }
}