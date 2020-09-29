package a2013;
//  Math.max(x,y) allows me to calculate and return a value for both x and y and then choose the max.
//  I did this in both functions. First (in longestAscending) to alter the starting point,
//  (maybe starting from i+1 will give me a longer path)
//  Then, to get the longest path in countPath, same thing, (maybe looking at the next value even though
//  the closer value is larger, will result in a longer path)

//  The execution of this idea lies in the Y.  in both functions Y serves as the
// "maybe there is a longer path to be found if we look at the next value instead of the immediate largest"
//  in longestAscending it's done by moving the starting point
//  and in count path it's done by checking if hopping over the immediate largest number will
//  result in a longer path

// the general idea here is to store return values in variables and later compare them and return the largest
public class a2013_4a {

    private IntNode _head;
    public a2013_4a( ) {
        _head = null;
    }
    public a2013_4a (IntNode node) {
        _head = node;
    }

    public a2013_4a(int[] arr)
    {
        _head = new IntNode (arr[0], null);
        IntNode prv = _head;
        for(int i = 1; i < arr.length; i++)
        {
            prv.setNext(new IntNode(arr[i], null));
            prv = prv.getNext();
        }
    }

    public int longestAscending (){
        return longestAscending(_head,0);
    }

    private int longestAscending(IntNode node, int max) {
        if (node.getNext()==null)
            return max;
        int x = countPath(node,node.getValue(),1); // this starting point
        int y = longestAscending(node.getNext(),0); // or the next point as a starting point
        max = Math.max(x,y); // return the max
        return max;
    }

    private int countPath(IntNode node, int cMax, int counter){
        if (node.getNext()==null || node == null) // when end is reached
            return counter;
        int x;
        if(cMax < node.getNext().getValue()) // if the next is greater
           x = countPath(node.getNext(),node.getNext().getValue(),counter+1);
        else// go to next one as a starting point
            x = countPath(node.getNext(),cMax,counter);

        int y = countPath(node.getNext(),cMax,counter);
        return Math.max(x,y);
    }

    public static void main(String []args){
        int[] arrA1 = {2,3, 4, 1, 5, 10, 5, 3};
        int[] arrA = {3,0,1,4,2,3,4,5,9,10}; // 8
        a2013_4a listA = new a2013_4a(arrA);
        System.out.println("list A: "+listA);
        System.out.println(listA.longestAscending());
    }
}
