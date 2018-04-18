#include<iostream>
using namespace std;

class Base
{
	public:
		Base()
		{
			cout<<"Base Constructor"<<endl;
		}
		~Base()
		{
			cout<<"Base Destructor"<<endl;
		}
};

class Derived
{
	public:
		Base b;  //will call Base constructor first, since I am creating Base object by Value. Base constructor will not be called if declared as Base *b
		Derived()
		{
			cout<<"Derived Constructor"<<endl;
		}
		~Derived()
		{
			cout<<"Derived Destrcutor"<<endl;
		}		
};

int main()
{
	Derived d;
}
