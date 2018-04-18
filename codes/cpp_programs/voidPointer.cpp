#include<iostream>
using namespace std;

int main()
{
	int n=10;
	void *ptr = &n;
	cout<<*((int *)ptr);cout<<endl;
	cout << *static_cast<int *>(ptr);//If I dont' put * at the begining of static_cast, then it would print the address
	return 0;
}
