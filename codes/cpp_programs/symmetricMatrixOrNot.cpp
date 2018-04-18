/*You are given a square matrix of size n. Rows are indexed 1 to n from top to bottom and columns are indexed 1 to n

form left to right. Matrix consists of only '*' and '.'. You need to check whether matrix is symmetric or not. if it is, 
check it is symmetric about vertical axis or horizontal axis or both.

A matrix is said to be symmetric about horizontal axis if 1st
row is identical to nth row, 2nd is identical to (n-1)th

row and so on...

A matrix is said to be symmetric about vertical axis if 1st
column is identical to nth column, 2nd identical to (n-1)th

and so on for all columns.

INPUT :

First line contains t
,the number of test cases. First line of each test case contains n the size of matrix. Each of next n lines contain n

characters.

OUTPUT:

Output t lines, answer for each test case. Print "HORIZONTAL" if symmetric about horizontal axis. Print "VERTICAL" if symmetric about vertical axis. 
Print "BOTH" if symmetric about both axes. print "NO" if it is not symmetric.

Constraints :

1<t=500

1<n<50

SAMPLE INPUT

3
4
*.*.
.*.*
*.*.
.*.*
3
.*.
*.*
.*.
3
..*
**.
..*

SAMPLE OUTPUT

NO
BOTH
HORIZONTAL
 */
 
#include<iostream>
#include<cstring>
using namespace std;
//Another approach to solve this problem which I found on geeks is to calculate the transpose of the matrix, and check if the 
//original and the transpose are the same or not. That approach is a much shorter and faster way to calculate
int main()
{
	int testCases=0;
	string first;// = new char[50];
	string second;// = new char[50];	
	cin>>testCases;
	while(testCases)
	{
		int n;
		cin>>n;
		char mat[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				cin>>mat[i][j];
			}
		}
		
		int voteHor=0,voteVer=0; //0 = NO, 1=HOR,2=VER,3=BOTH
		int horCountTop=0, horCountBottom=n-1, verCount=0;
		
		while(horCountTop < n/2)
		{	
			while(verCount<n)
			{
				//strcat(first,&mat[horCountTop][verCount]);
				first += mat[horCountTop][verCount];
				++verCount;
			}
			
			verCount=0;
			while(verCount<n)
			{
				//strcat(second,&mat[horCountBottom][verCount]);
				second += mat[horCountBottom][verCount];
				++verCount;
			}
			
			//cout<<"Horizontal String:: "<<first<<"  "<<second<<endl;
			
			if(first != second)
			{
				//memset(first,0,50);
				//memset(second,0,50);
				first.clear();
				second.clear();
				break;
			}
			++horCountTop;
			--horCountBottom;
			verCount=0;
			//memset(first,0,50);
			//memset(second,0,50);
			first.clear();
			second.clear();
			++voteHor;
		}
		
		
		
		int verCountFirst=0, verCountLast=n-1, horCount=0;
		
		while(verCountFirst < n/2)
		{	
			while(horCount<n)
			{
				//strcat(first,&mat[horCount][verCountFirst]);
				first += mat[horCount][verCountFirst];
				++horCount;
			}
			
			//horCount=n-horCount;
			horCount=0;
			while(horCount<n)
			{
				//strcat(second,&mat[horCount][verCountLast]);
				second += mat[horCount][verCountLast];
				++horCount;
			}
			
			//cout<<"Vertical String:: "<<first<<"  "<<second<<endl;
			
			if(first != second)
			{
				//memset(first,0,50);
				//memset(second,0,50);
				first.clear();
				second.clear();
				break;
			}
			++verCountFirst;
			--verCountLast;
			horCount=0;
			//memset(first,0,50);
			//memset(second,0,50);
			first.clear();
			second.clear();
			++voteVer;
		}
		
		
		if(voteHor == n/2 && voteVer == n/2)
		{
			cout<<"BOTH"<<endl;
		}
		else if(voteHor == n/2)
		{
			cout<<"HORIZONTAL"<<endl;
		}
		else if(voteVer == n/2)
		{
			cout<<"VERTICAL"<<endl;
		}	
		else
		{
			cout<<"NO"<<endl;
		}
		--testCases;
	}
	
	//delete first;
	//delete second;
} 



















