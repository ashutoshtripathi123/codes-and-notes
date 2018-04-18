/*The question is how can I avoid creating objects on Stack. The answer to it is by putting the destructor in private or protected specifier.
When you create object by value, its destrcutor gets called when it moves out of scope. Now since ur destructor is private, compiler wont call it.
So what will i do to delete dynamically allocated objects - either create a friend function, which will call the destructor, or overload ur delete operator*/
#include<iostream>
#include<stdlib.h>
using namespace std;

class Test{
private:
	~Test()
	{
		cout<<"Destructor Called !!!"<<endl;
	}
	
	friend void deleteObj(Test *ptr);
public:
	Test(){
		cout<<"Constructor Called !!!"<<endl;
	}
	
	//not working yet
	void operator delete(void *ptr)
	{
		cout<<"Overloaded Delete Called"<<endl;
		delete ptr;
	}
};

void deleteObj(Test *ptr)
{
	cout<<"Friend Function Called"<<endl;
	delete ptr;
}

int main()
{
	//Test t1; //This will give compilation error
	Test *t1; 
	t1 = new Test(); 
	deleteObj(t1); //Calling friend function
	delete t1; //not working yet
}
