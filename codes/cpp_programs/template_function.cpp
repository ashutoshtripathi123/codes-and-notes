//this is an example of function template
/*C++ adds two new keywords to support templates: ‘template’ and ‘typename’. The second keyword can always be replaced by keyword ‘class’.*/

#include <iostream>
using namespace std;

template <class T>
T largerOne(T a1, T a2)
{
	return (a1>a2)?a1:a2;
}

int main()
{
	int a1, a2;
	float s1,s2;
	char d1, d2;
	cout<<"Enter two integers"<<endl;
	cin>>a1>>a2;
	cout<<largerOne(a1,a2)<<" is the larger integer"<<endl; //can also be called as largerOne<int>(a1, a2)
	cout<<"Enter two floats"<<endl;
	cin>>s1>>s2;
	cout<<largerOne(s1,s2)<<" is the larger float"<<endl;
	cout<<"Enter two chars"<<endl;
	cin>>d1>>d2;
	cout<<largerOne(d1,d2)<<" is the larger float"<<endl;
	return 0;
}

