/******************Insertion Sort******************/
/*When having a problem in visualizing the working of any sorting technique, check the visualizer tab
in hackerearth its good*/
#include<iostream>
using namespace std;


int main()
{
	int N=0,i=0,j=0;
	cin>>N;
	int arr[N], original[N];
	for(i=0;i<N;i++)
	{
		cin>>arr[i];
	}
	
	for(i=0;i<N;i++)
	{
		original[i]=arr[i];
	}
		
	i=1;
	j=0;
	
	while(i<N)
	{
		j=i;
		while(j>0)
		{
			if(arr[j-1]>arr[j])
			{
				//swap
				int temp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
			--j;	
		}
		
		++i;
	}
	
	//The below commented code was the requirement of Hackerearth submission. It has nothing to do with Insertion Sort
	/*
	i=0; j=0;
	while(i<N)
	{
		j=0;
		while(j<N)
		{
		    if(original[i]==arr[j])
		    {

					cout<<j+1<<" ";
					break;
		    }

			++j;			
		}
		
		++i;
	}
	*/	
	
	for(i=0;i<N;i++)
	{
		cout<<arr[i]<<'\t';
	}	
	return 0;
	
}
