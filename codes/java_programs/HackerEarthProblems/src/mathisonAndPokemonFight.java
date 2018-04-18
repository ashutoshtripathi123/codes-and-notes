/*Mathison and the Pokémon fights
Max. Marks: 100

Mathison has decided to become a Pokémon master. In order to do that he has to gain some experience by fighting in a lot of tournaments, some of which can take quite a lot of time.

Recently, he has signed up for a new one, among other N contestants. Each Pokémon trainer has to use exactly two Pokémons, a primary and a secondary, each having some value. There are s few rules about how the competition should be structured but they are way too complicated to explain here. The rules about fighting are simple and are easily explained below.

A fight can only be carried between Pokémons of equal value (otherwise it would be clear who the winner is). However, this is way too restrictive and the judges have come up with a compromise. A fight can also contain a training period. Basically, the weaker Pokémon spends some time in the PokeGym to become as good as the other one (one second of hard-work is required to gain one hitpoint). The actual fight takes place instantly. To sum up: a fight between two Pokémons of values a and b lasts exactly |a - b| seconds.
A fight between two trainers is actually made from two fights, one between the primary Pokémons and one between the secondary Pokémons, that run at the same time (i.e. they run in parallel). The length of the whole fight is the maximum duration between the two fights.
Note: Pokémons have an awful memory and they forget their training right after their fight ends.

Mathison is trying to find a suitable strategy in order to spend as little time as possible in the gyms. In order to do that, he writes a program that computes how much would it last to fight all the trainers from i to j if a primary Pokémon of value a and a secondary Pokémon of value b are chosen?
The program is complex enough to support updates. From time to time, Mathison finds out that the p-th trainer (i.e. trainer with id p) has changed their pair of Pokémons.

You'd also like a change at becoming a Pokémon master but in order to do that you have to use the same program. Are you able to code it?

Input
The first line of the input file will contain two integers, N and Q, representing the number of trainers and the number of operations.
Each of the next N lines will contain a pair of integers, valueprimary valuesecondary, representing the values of the primary and secondary Pokémons of the corresponding trainer.
Each of the next Q lines will have one of the following two forms:

    0 p valueprimary valuesecondary: the p-th trainer will change their Pokémons to (valueprimary, valuesecondary)
    1 i j valueprimary valuesecondary: How much would it last to fight all trainers with ids from i to j using (valueprimary, valuesecondary) as the chosen pair of Pokémons?

Output
The output file will contain the answers for the second type of operations. Each answer will be printed on its own line.

Constraints

    1 ≤ N ≤ 100,000
    1 ≤ Q ≤ 200,000
    Every value of a Pokémon is an integer between -109 and 109
    1 ≤ i ≤ j ≤ N and 1 ≤ p ≤ N
    All indices are 1-based.

SAMPLE INPUT

4 5
1 2
4 5
8 1
-5 3
1 1 3 3 7
0 2 4 -9
1 1 3 -3 7
0 3 -3 2
1 1 4 5 6

SAMPLE OUTPUT

13
32
37

Explanation

The first operation is of type two: Mathison tries to fight using a primary Pokémon of value 3 and a secondary of value 7. He fights the first three trainers. The first fight lasts for max(|3 - 1|, |7 - 2|) = 5 seconds. The second fight lasts for max(|3 - 4|, |7 - 5|) = 2 seconds and the third one for max(|3 - 8|, |7 - 1|) = 6. The total duration of all three fights is 5 + 2 + 6 = 13 seconds.

The second operation is an update. The second trainer has changed their Pokémons to a pair with values 4 (primary) and -9 (secondary).

The third operation is another question. Mathison tries to fight using a primary Pokémon of value -3 and a secondary of value 7. He fights the first three trainers. The first fight lasts for max(|-3 - 1|, |7 - 2|) = 5 seconds. The second fight lasts for max(|-3 - 4|, |7 - (-9)|) = 16 seconds. The third fight last for max(|-3 - 8|, |7 - 1|) = 11 seconds. The total duration of all three fights is 5 + 16 + 11 = 32 seconds.

The forth operation is an update. The third trainer has changed their Pokémons to a pair with values -3 (primary) and 2 (secondary).

The fifth (and last) operation is another question. Mathison tries to fight using a primary Pokémon of value 5 and a secondary of value 6. He fights the first four trainers. The first fight lasts for max(|5 - 1|, |6 - 2|) = 4 seconds. The second fight lasts for max(|5 - 4|, |6 - (-9)|) = 15 seconds. The thirst fight lasts for max(|5 - (-3)|, |6 - 2|) = 8 seconds. The fourth fight lasts for max(|5 - (-5)|, |6 - 3|) = 10 seconds. The total duration of all four fights is 4 + 15 + 8 + 10 = 37 seconds.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Pokemon
{
	int valPrimary;
	int valSecondary;
};

public class mathisonAndPokemonFight {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				
        String line = br.readLine();
        String [] tokens = line.split(" ");
		int numberOfTrainers = Integer.parseInt(tokens[0]);//input.nextInt();
		int numberOfOperations = Integer.parseInt(tokens[1]);//input.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		//Creating one extra pokemon object. The one at 0'th location will not be used
		// for simplicity sake
		Pokemon [] pokObj = new Pokemon[numberOfTrainers+1];//This wont allocate any space or create objects
		
		for(int i=1;i<numberOfTrainers+1;i++)
		{
			pokObj[i] = new Pokemon();
			line = br.readLine();
			tokens = line.split(" ");
			pokObj[i].valPrimary = Integer.parseInt(tokens[0]);//input.nextInt();
			pokObj[i].valSecondary = Integer.parseInt(tokens[1]);//input.nextInt();
		}
		
		//Parse the Operations now
		for(int i=0;i<numberOfOperations;i++)
		{
			line = br.readLine();
			tokens = line.split(" ");
			int pos1 = Integer.parseInt(tokens[0]);//input.nextInt();
			if(pos1 == 1)
			{
				// Call the function, which would do the job of finding diff between
				// primary and secondary

				int fromTrainer = Integer.parseInt(tokens[1]);//input.nextInt();
				int toTrainer = Integer.parseInt(tokens[2]);//input.nextInt();
				final int tempPrimary = Integer.parseInt(tokens[3]);//input.nextInt();
				final int tempSecondary = Integer.parseInt(tokens[4]);//input.nextInt();
				int sum=0, loop=fromTrainer;
				int sumOfPrimary=0,sumOfSecondary=0;
				while(loop<=toTrainer)
				{
					sum+=Math.max(Math.abs(pokObj[loop].valPrimary - tempPrimary),
							Math.abs(pokObj[loop].valSecondary - tempSecondary));
					
					//sumOfPrimary+=pokObj[loop].valPrimary; //approach 2
					//sumOfSecondary+=pokObj[loop].valSecondary;//approach 2
					++loop;
				}
				//int diff = (toTrainer-fromTrainer)+1; //approach 2
				//int finalPrimary = Math.abs(sumOfPrimary-(diff*tempPrimary));//approach 2
				//int finalSecondary = Math.abs(sumOfSecondary-(diff*tempSecondary));//approach 2
				//sum = Math.max(finalPrimary, finalSecondary);//approach 2
				result.add(sum);
				sum=0;
			}
			else
			{
				// call the function which shall do the job of modifying pokemon objects
				int pos2 = Integer.parseInt(tokens[1]);//input.nextInt();
				pokObj[pos2].valPrimary = Integer.parseInt(tokens[2]);//input.nextInt();
				pokObj[pos2].valSecondary = Integer.parseInt(tokens[3]);//input.nextInt();
			}
		}
		
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
		//input.close();
	}

}
