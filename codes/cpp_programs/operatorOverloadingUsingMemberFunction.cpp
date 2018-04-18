#include<iostream>
#include <unistd.h>
using namespace std;
/*In the friend function version, the expression cents1 + 2 becomes function call operator+(cents1, 2). 
Note that there are two function parameters. This is straightforward.
In the member function version, the expression cents1 + 2 becomes function call cents1.operator+(2).
 Note that there is now only one explicit function parameter, and cents1 has become an object prefix.
 However, we are not able to overload operator<< as a member function. Why not? Because the overloaded operator must be added as a member of the left operand.
  In this case, the left operand is an object of type std::ostream. std::ostream is fixed as part of the standard library. 
  We can’t modify the class declaration to add the overload as a member function of std::ostream.

This necessitates that operator<< be overloaded as a friend.

Similarly, although we can overload operator+(Cents, int) as a member function (as we did above), we can’t overload operator+(int, Cents) as a member function,
 because int isn’t a class we can add members to.
Typically, we won’t be able to use a member overload if the left operand is either not a class (e.g. int),
 or it is a class that we can’t modify (e.g. std::ostream).*/
 
 /*The following rules of thumb can help you determine which form is best for a given situation:

    If you’re overloading assignment (=), subscript ([]), function call (()), or member selection (->), do so as a member function.
    If you’re overloading a unary operator, do so as a member function.
    If you’re overloading a binary operator that modifies its left operand (e.g. operator+=), do so as a member function if you can.
    If you’re overloading a binary operator that does not modify its left operand (e.g. operator+), do so as a normal function or friend function.
*/
class Cents{
	private:
		int mCents;
	public:
		Cents(int input):mCents(input)
		{
			cout<<"Constructor Called"<<endl;
		}
		
		Cents operator+(int);
		Cents operator-(int);
		int getCents()
		{
			return mCents;
		}
};

Cents Cents:: operator+(int input)
{
	return Cents(mCents+input);//I am returning here a Cents Object, this is where a new Cents object is getting created, and assigned to sum object
}

Cents Cents:: operator-(int input)
{
	return Cents(mCents-input);
}

int main()
{
	Cents c1(5);
	Cents c2(6);
	Cents sum = c1 + 5;
	Cents sub = c1 - 2;
	cout <<"Sum to the objects="<<sum.getCents()<<endl;
	cout << "Sub from the object="<<sub.getCents()<<endl;
	return 0;	
}
