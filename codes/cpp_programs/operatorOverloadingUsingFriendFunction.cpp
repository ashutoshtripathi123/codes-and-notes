#include<iostream>
#include <unistd.h>
using namespace std;

class Cents{
	private:
		int mCents;
	public:
		Cents(int input):mCents(input)
		{
			cout<<"Constructor Called"<<endl;
		}
		
		friend Cents operator+(Cents &c1, Cents &c2);
		friend Cents operator-(Cents &c1, Cents &c2);
		int getCents()
		{
			return mCents;
		}
};

Cents operator+(Cents &c1, Cents &c2)
{
	return Cents(c1.mCents + c2.mCents);//I am returning here a Cents Object, this is where a new Cents object is getting created, and assigned to sum object
}

Cents operator-(Cents &c1, Cents &c2)
{
	return Cents(c1.mCents - c2.mCents);
}

int main()
{
	Cents c1(5);
	Cents c2(6);
	Cents sum = c1 + c2;
	cout <<"Sum of the objects="<<sum.getCents()<<endl;
	return 0;	
}
