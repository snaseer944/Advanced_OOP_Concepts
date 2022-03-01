import java.util.ArrayList;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
        this.objects = new ArrayList<>();
    }

public void add(T element) throws BagException
{
    if(element == null)
        throw new BagException("Cannot add null to a Bag");
    this.objects.add(element);
}

    public T drawOne(){
        int index = (int)(Math.random() * this.objects.size());
        return this.objects.get(index);
    }

    public ArrayList<T> drawMany(int howMany){
        ArrayList<T> draw = new ArrayList<>();
        for(int i = 0; i < howMany; i++)
        {
            draw.add(drawOne());
        }
        return draw;

    }

    public void add(T element,double prob) throws BagException{

        if(prob < 0 || prob > 1 )
            throw new BagException("Probability should be between 0 and 1");
        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}
