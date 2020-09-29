package a2017;
// check what happens if you add this item, and check what happens if you skip this item. easy
public class a2017_1b {
    public static int knapSack(Item[] items, int w){
        return knapSack(items,w,0,0);
    }

    private static int knapSack(Item[] items, int w, int val, int i) {
        if (w<0)
            return val-items[i-1].getValue();
        if (i>items.length-1)
            return val;

        int x = knapSack(items, w - items[i].getWeight(),val+items[i].getValue(),i+1);
        int y = knapSack(items, w,val,i+1);

        return Math.max(x,y);
    }

    public static void main(String[]afa){
        Item a = new Item(10,60);
        Item b = new Item(20,100);
        Item c = new Item(30,120);
        Item d = new Item(15,200);

        Item[] items = {a,b,c,d};
        System.out.println(knapSack(items,30));
    }
}
