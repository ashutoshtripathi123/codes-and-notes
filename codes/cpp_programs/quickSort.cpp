//NOT WORKING
#include <stdio.h>
#include<iostream>
using namespace std;
void swap(int *a, int *b)
{
	int temp = *b;
	*b = *a;
	*a = temp;
	return;
}

int partition(int *arr, int start, int end)
{
	int pivot = arr[end];
	int pIndex = start;
	for(int i=0;i<end-1;i++)
	{
		if(arr[i]<=pivot)
		{
			//swap arr[i] and arr[pIndex]
			swap(&arr[i], &arr[pIndex]);
			pIndex = pIndex + 1;
		}
	}
	
	//swap(arr[pIndex],arr[end])
	swap(&arr[pIndex], &arr[end]);
	return pIndex;
}
void quickSort(int *arr, int start, int end)
{
	int pIndex=0;
	if(start >= end)
	{
		return;
	}
	pIndex = partition(arr, start, end);
	quickSort(arr, start, pIndex-1);
	quickSort(arr, pIndex+1, end);
}

int main()
{
	int arr[]={7,2,1,6,8,5,3,4};
	int size=0;
	size = sizeof(arr)/sizeof(arr[0]);
	cout<<size<<endl;
	quickSort(arr, 0, size-1);
	for(int i=0;i<size-1;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	return 0;
}
