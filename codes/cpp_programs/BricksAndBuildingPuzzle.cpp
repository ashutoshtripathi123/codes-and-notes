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
1=N=105

1=A[i]=105
1=q=105
1=K=105


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
#include <iostream>
#include <vector>
using namespace std;
int main() 
{
		
    int numberOfBuildings = 0;
    scanf("%d", &numberOfBuildings);
	int sizeOfEachBuilding[numberOfBuildings] ;
	vector<int>result;
	vector<int>::iterator i;
	for(int i=0;i<numberOfBuildings;i++)
	{
		scanf("%d", &sizeOfEachBuilding[i]);
	}
	
	int numberOfQueries = 0;
	scanf("%d", &numberOfQueries);
	int query[numberOfQueries] ;
	for(int i=0;i<numberOfQueries;i++)
	{
		scanf("%d", &query[i]);
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
		result.push_back(count);	
		++k;
	}
	
	for(i=result.begin();i!=result.end();++i)
	{
		printf("%d\n", *i);
		
	}
	
	return 0;
}

