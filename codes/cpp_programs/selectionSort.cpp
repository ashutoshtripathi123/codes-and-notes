/*When having a problem in visualizing the working of any sorting technique, check the visualizer tab
in hackerearth its good*/
#include<iostream>
using namespace std;

int main()
{
	int N, x, i, j, minPos;
	cin>>N>>x;
	int arr[N];
	for(i=0;i<N;i++)
		cin>>arr[i];
	for(i=0;i<N;i++)
	{
		minPos=i;
		for(j=i;j<N;j++)
		{
			if(arr[j]<arr[minPos])//See, i am comparing with minPos and not i, as its possible to find even smaller number while parsing array
			{
				minPos = j;
			}
		}
		
		swap(arr[minPos], arr[i]);
	}
	
	for(i=0;i<N;i++)
	{
		cout<<arr[i]<<" ";	
	}	
	return 0;
}
