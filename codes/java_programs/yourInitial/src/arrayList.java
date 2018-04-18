import java.util.ArrayList;
import java.util.Random;


public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        Random r = new Random();
        // We can add more elements to arrL
        for(int i=0;i<10;i++)
        {
        	int temp = 1 + r.nextInt(100);
        	arrL.add(temp);
        }
        
        System.out.println("ArrayList Contains: " +arrL);
        /*
        for(int i=0;i<arrL.size();i++)
        {
        	System.out.print(arrL.get(i) + " ");
        }
        */
        arrL.remove(10); // will remove the last element from the arrayList
	}

}
