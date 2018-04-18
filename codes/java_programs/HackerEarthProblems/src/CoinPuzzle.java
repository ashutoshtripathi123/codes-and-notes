/*------------------------- SUCCESS IN SINGLE ATTEMPT -------------------------------*/
/*Charlie and Alan have challenged each other to a game of logic with coins.

The game consists of N piles of coins with each pile consisting of some
coins. The game progresses as follows: in each turn a player selects any of the piles
 with even number of coins and removes exactly the half the coins out of that pile.
  The game ends when a player can't make a move. The last move is a winning move.

Charlie makes the first move. Assuming both players play optimally, predict who wins the game.
Input

The first line consists of the number of test cases T (1<=T<=100).

Each test case consists of two lines.

The first line in each test case contains the single integer N
(1≤N≤1000) — the number of piles of coins.

The second line contains N
space separated integers Ai (1≤Ai≤109), specifying number of coins in piles.
Output

Output T

lines.

For each case, output "Charlie" (without quotes) if Charlie wins the game, 
and "Alan"(without quotes) if Alan wins the game. 

SAMPLE INPUT

2
3
2 4 2
2
2 2

SAMPLE OUTPUT

Alan
Alan
*/
import java.util.ArrayList;
import java.util.Scanner;

public class CoinPuzzle {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testCases=input.nextInt();
		int numOfPiles = 0;
		ArrayList<String>result = new ArrayList<String>();
		for(int i=0;i<testCases;i++)
		{
			numOfPiles=input.nextInt();
			int pile[] = new int[numOfPiles];
			for(int j=0;j<numOfPiles;j++)
			{
				pile[j]=input.nextInt();
			}
			
			/*Parse through each pile, check if you can get any thing which is divisible by 2
			  If yes, start over. However If you reach the end, then should stop
			*/
			int k=0;
			int count=0;
			while(k < numOfPiles)
			{
				if(pile[k]%2==0)
				{
					pile[k]=pile[k]/2;
					k=0;
					++count;
					continue;
				}
				else
				{
					k++;
				}
			}
			
			if(count%2==0)
			{
				result.add("Alan");
			}
			else
			{
				result.add("Charlie");
			}
		}
		
		for(int temp=0;temp<result.size();++temp)
		{ 
			System.out.println(result.get(temp));
		}
		
		input.close();
	}

}
