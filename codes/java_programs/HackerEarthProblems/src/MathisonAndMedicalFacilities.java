/*Mathison and the medical facilities
Max. Marks: 100

This is an approximate problem.

Mathison has been appointed the new CFO of Enigma, a major healthcare provider with headquarters in Germany.
His first task is to create exactly K new medical centres with latest-generation equipment.
 After a few months of intense research, he was provided with N possible locations and for each location, 
 the amount of money the company has to pay to build in that area is known 
 (the price usually covers everything from permits and equipment to bribes).

There are M initial clients and for each one of them, Mathison can find out how much that person is 
willing to pay to get treatment in each one of the potential locations. 
(i.e. pay[i, j] = how much client i is willing to pay to get healthy in a medical centre
 established in location j - this value is highly influenced by the quality of service, 
 number of pretty nurses and the training of the doctors).
  Mathison has been able to find something very important about how clients choose a medical centre:
   a client will always go for their cheapest option (ties are usually broken by coin tosses).

The project has become way too complicated and Mathison needs your help. Can you help him impress
 the shareholders by maximizing the profit of this investment?

Input
The first line of the input file will contain three space-separated integers, N, K and M, 
representing the number of possible locations, the number of medical centres 
Mathison is allowed to construct and the number of initial clients.
Each of the next M lines will contain N space-separated integers, representing the price the
 corresponding client is willing to pay in each of the possible locations.
The last line of the input file will contain N space-separated integers,
 cost1, cost2, ..., costN, where costi = the amount of money Mathison has to pay to 
 create a centre in location i.

Output
The first (and only) line of the output file will contain K space-separated integers,
 representing the indices of the locations that should be used by Mathison. 
 The list can be provided in any order.

Constraints and notes

    N = 500
    1 ≤ K ≤ N
    1 ≤ M ≤ 2000
    A client is willing to pay at most €1000 for a consult (or treatment).
    Mathison has to pay at most €1000 in order to build one new medical centre.
    All indices are 1-based.


SAMPLE INPUT

4 2 5
10 51 45 24
50 77 98 12
23 62 33 65
89 41 36 78
17 23 76 54
40 50 10 30


SAMPLE OUTPUT

3 2

Explanation

Note: This test does not satisfy the constraint N = 500 so it is not valid.
In this test, there are K = 2 centres to be built and M = 5 clients.

One solution is to build the two medical centres in locations 3 and 4.
The profit of this plan is: 24 + 12 + 33 + 36 + 54 - 10 - 30 = 119.

Another solution is to build the two medical centres in locations 2 and 3.
The profit of this plan is: 45 + 77 + 33 + 36 + 23 - 10 - 50 = 154.

Another solution is to build the two medical centres in locations 3 and 1.
The profit of this plan is: 10 + 50 + 23 + 36 + 17 - 40 - 10 = 86.

The best plan is the second one with a value of 154.

*/
import java.util.Scanner;
public class MathisonAndMedicalFacilities {

	public static void main(String[] args) {
		int i=0,j=0;
		int possibleLocation=0, finalSelection=0, numberOfClients=0;
		Scanner input = new Scanner(System.in);
		possibleLocation=input.nextInt();
		finalSelection=input.nextInt();
		numberOfClients=input.nextInt()+1;
		int arr[][]=new int[numberOfClients][possibleLocation]; 
		//System.out.println(arr.length);
		for(i=0;i<numberOfClients;i++)
		{
			for(j=0;j<possibleLocation;j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		
		for(i=0;i<numberOfClients;i++)
		{
			for(j=0;j<possibleLocation;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Done and Done");
		input.close();
	}

}
