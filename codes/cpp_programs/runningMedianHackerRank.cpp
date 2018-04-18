//Running median - Hacker Rank
#include<iostream>
//#include<sort>
#include<algorithm>
#include<list>
#include<vector>
#include<iomanip>
#include<queue>
using namespace std;

int main()
{
	vector<float> arr;
	//vector<float>::iterator ir;
	int N=0;
	cin>>N;
	int i=1;
	float temp=0; int size=0;
	float median = 0.0;
	int comp=0;
	cout<<setprecision(1)<<fixed;
	
	//for the first element
	cin>>temp;
	arr.push_back(temp);
	median = arr[0];
	cout<<median<<endl;
	
	while(i<N)
	{
		size = 0;
		comp=0;
		cin>>temp;
		arr.push_back(temp);
		sort(arr.begin(), arr.end());
		size = i+1;//arr.size();
		//for(ir = arr.begin();ir!=arr.end();ir++)
		//{
		//	cout<<*ir<<" ";
		//}
		comp = size%2;
	
		//if(size == 1)
		//{
		//	median = arr[0];
		//}
        if(comp!=0)
        {
        	comp = size/2;
            median = arr[comp];//cout<<"Odd comp = "<<comp<<"size = "<<size<<endl;
        }
        else if(comp==0)
        {
        	comp = size/2;
            median = (arr[comp-1]+arr[comp])/2;
            //cout<<"Even comp = "<<comp<<"size = "<<size<<endl;
        }
	    
		cout<<median<<endl;
		++i;
	}
}
