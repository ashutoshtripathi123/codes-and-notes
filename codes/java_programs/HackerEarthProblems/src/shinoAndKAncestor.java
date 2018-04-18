/*Little Shino and K Ancestor
Max. Marks: 100

Assume that you are given an undirected rooted tree with N
nodes and an integer K. Node 1 is the root of the tree. Each node is uniquely numbered from 1 to N

. Additionally, each node also has a color and the color is an integer value.

Note: Different nodes can have the same color.

For each node, you are required to find the Kth

closest ancestor from that node which has the same color.

enter image description here

Input Format:
The first line consists of two integers, denoting N
and K (1≤N,K≤106). The second line is an array A of length N, represented as space separated integers. Here Ai (1≤Ai≤106) is the color-value of ith node in the tree. This is followed by N−1 lines comprising of two space separated integers x and y, which denotes that there is an edge between nodes that are numbered x and y

.

Output Format:
Print N
space separated integers, where ith integer denotes the Kth closest ancestor from ith node which has the same color. If no such ancestor exists, print −1

.
SAMPLE INPUT

5 2
1 1 2 1 2
1 2
1 3
2 4
2 5

SAMPLE OUTPUT

-1 -1 -1 1 -1

Explanation

Node 1
, 3 and 5 do not have any ancestor with the same color. Node 2 has only one ancestor (Node 1) with the same color. Node 4 has two ancestors (Node 1 and Node 2) with the same color. For node 4, the 2nd closest ancestor is 1.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class shinoAndKAncestor
{
	class Node
	{
		int nodeNumber;
		int nodeColor;
	};
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		//Deque<Integer> color1 = new LinkedList<Integer>();
		//Deque<Integer> color2 = new LinkedList<Integer>();
		ArrayList<Integer>color1 = new ArrayList<Integer>();
		ArrayList<Integer>color2 = new ArrayList<Integer>();
		int numberOfElements = input.nextInt();
		int jump = input.nextInt();
		int temp=0, pos1=0, pos2=0, count=1;
		for(int i=1;i<=numberOfElements;i++)
		{
			temp = input.nextInt();
			if(temp == 1)
				color1.add(i);
			else if(temp == 2)
				color2.add(i);
		}
		
		while(count<=numberOfElements /*
				&& pos1 < color1.size()
				&& pos2 < color2.size()*/)
		{
			//Maintain 2 pos value for each array.
			if(color1.get(pos1)<color2.get(pos2))
			{
				if(pos1 < jump)
				{
					System.out.print("-1 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
				++pos1;
				if(pos1 >= color1.size())
				{
					--pos1;
					color1.set(pos1, 32000);
				}
			}
			else
			{
				if(pos2 < jump)
				{
					System.out.print("-1 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
				++pos2;	
				if(pos2 >= color1.size())
				{
					--pos2;
					color2.set(pos2, 32000);
				}
			}
			
			++count;
		}
		
		input.close();
	}
		
}