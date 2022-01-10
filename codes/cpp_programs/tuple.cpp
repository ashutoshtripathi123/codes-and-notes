/*
A tuple is an object that can hold a number of elements. The elements can be of different data types. The elements of tuples are initialized as arguments in order in which they will be accessed.

Operations on tuple :-
get() :- get() is used to access the tuple values and modify them, it accepts the index and tuple name as arguments to access a particular tuple element
make_tuple() :- make_tuple() is used to assign tuple with values. The values passed should be in order with the values declared in tuple.
*/
// C++ code to demonstrate tuple, get() and make_pair()
#include<iostream>
#include<tuple> // for tuple
using namespace std;
int main()
{
	// Declaring tuple
	tuple <char, int, float> geek;

	// Assigning values to tuple using make_tuple()
	geek = make_tuple('a', 10, 15.5);

	// Printing initial tuple values using get()
	cout << "The initial values of tuple are : ";
	cout << get<0>(geek) << " " << get<1>(geek);
	cout << " " << get<2>(geek) << endl;

	// Use of get() to change values of tuple
	get<0>(geek) = 'b';
	get<2>(geek) = 20.5;

	// Printing modified tuple values
	cout << "The modified values of tuple are : ";
	cout << get<0>(geek) << " " << get<1>(geek);
	cout << " " << get<2>(geek) << endl;

	return 0;
}
