import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queueATaleOfTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        /*Add the new number in stack N*/
        public void enqueue(T value)
        { 
            stackNewestOnTop.push(value);
        }

        /*Move everything from stack N to stack O, and then print the top of the 
         * stack O. Remember to move everything back to stack N*/
        public T peek()
        {
        	T newToOld;
			T oldToNew, retVal;
            while(!stackNewestOnTop.empty())
            {
            	 newToOld = stackNewestOnTop.pop();
            	 stackOldestOnTop.push(newToOld);
            }
            
            retVal = stackOldestOnTop.peek();
            
            while(!stackOldestOnTop.empty())
            {
            	 oldToNew = stackOldestOnTop.pop();
            	 stackNewestOnTop.push(oldToNew);
            }            
             return retVal;
        }
        
        /*Move all ur elements from stack N to O, pop the top, and move everything
         * back to stack N*/
        public void dequeue() 
        {
        	T newToOld;
			T oldToNew, retVal;
            while(!stackNewestOnTop.empty())
            {
            	 newToOld = stackNewestOnTop.pop();
            	 stackOldestOnTop.push(newToOld);
            }
            
            if(!stackOldestOnTop.empty())
            {
            	stackOldestOnTop.pop();
            }
            
            while(!stackOldestOnTop.empty())
            {
            	 oldToNew = stackOldestOnTop.pop();
            	 stackNewestOnTop.push(oldToNew);
            }
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        ArrayList<Integer>result = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
            	result.add((Integer)queue.peek());
            }
        }
        
        for(int i=0;i<result.size();i++)
        {
        	System.out.println(result.get(i));
        }
        scan.close();
    }
}

