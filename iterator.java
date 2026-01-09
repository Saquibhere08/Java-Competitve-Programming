public class iterator{
    public static void main(String[] args) {
        removeEven();
    }
    void removeEven(Collection<Integer> c){
        Iterator <Integer>it =c.iterator();
        while(it.hasnext()){
            int x=(Integer)it.next();

            if(x%2==0)
                it.remove();

        }
    }
}
//not the whole program, Iterator Initialization part only