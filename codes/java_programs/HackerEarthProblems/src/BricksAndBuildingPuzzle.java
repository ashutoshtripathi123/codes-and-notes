/*An old planet called Alpha has been found but it is destructed completely. 
 * Archaeologists after expedition found out a map that depicts all the buildings that were in Alpha. 
 * In the map following facts were stated:

Buildings were made of the identical bricks and all the bricks were equal sized.
All the buildings and bricks were 2D rectangles of some height and equal width.
A building is formed by putting bricks one on the another.
 The height of the building is the sum of heights of bricks. 
 None of the bricks used are ever broken or rotated.

Now you have q

queries.

Each query contains an integer k
. For every query you have to print the count of buildings that can be made if you had infinite number
 of bricks of size k

adhering to the above rules.

Constraints
1≤N≤105

1≤A[i]≤105
1≤q≤105
1≤K≤105


Input

First line contains a number N
as input denoting the total number of buildings in the planet Alpha.
 Next N lines contain one integer each denoting the height of each of the buildings. 
 Next line contains a number q as input that denotes the total queries to be asked. 
 For each of the q queries next q lines contain an integer k each.
Print the answer as per the description above for each query in a new line.

Input 
4
5
8
10
8
1
2

Output
3
Explanation:
In the sample you can see that out of the given four buildings we can make the last 3 buildings
 using bricks of height 2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class BricksAndBuildingPuzzle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        int numberOfBuildings = Integer.parseInt(br.readLine());
		int sizeOfEachBuilding[] = new int[numberOfBuildings];
		ArrayList<Integer>result = new ArrayList<Integer>();
		for(int i=0;i<numberOfBuildings;i++)
		{
			sizeOfEachBuilding[i]=Integer.parseInt(br.readLine());
		}
		
		int numberOfQueries = Integer.parseInt(br.readLine());
		int query[] = new int[numberOfQueries];
		for(int i=0;i<numberOfQueries;i++)
		{
			/*
			int query=Integer.parseInt(br.readLine());
			int j=0;
			int count=0;
			while(j<numberOfBuildings)
			{
				if((sizeOfEachBuilding[j]%query)==0)
				{
					++count;
					++j;
				}
				else
				{
					++j;
				}
			}
			result.add(count);*/
			query[i]=Integer.parseInt(br.readLine());
		}
		
		int j=0,k=0;
		int count=0;
		while(k<numberOfQueries)
		{
			j=0;
			count=0;
			while(j<numberOfBuildings)
			{
				if((sizeOfEachBuilding[j]%query[k])==0)
				{
					++count;
					++j;
				}
				else
				{
					++j;
				}
			}
			result.add(count);	
			++k;
		}
		//PrintWriter pw = new PrintWriter(System.out);
		for(int temp=0;temp<result.size();temp++)
		{
			System.out.println(result.get(temp));
			//pw.print(result.get(temp));
		}
		
		br.close();
	}
}
