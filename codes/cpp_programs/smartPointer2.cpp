/*This example I have taken from codeproject:: https://www.codeproject.com/Articles/15351/Implementing-a-simple-smart-pointer-in-c*/
#include<iostream>
using namespace std;

class Person{
	private:
		int age;
		char *pName;
	public:
		Person():pName(0),age(0)
		{/*Empty Constructor*/}
		Person(char *name, int data):pName(name),age(data)
		{
			cout<<"Parameterized Constructor Called"<<endl;
		}
		~Person()
		{
			cout<<"Destructor Called of Person Class "<<endl;
		}
		
		void Display()
		{
			cout<<"Name = "<<pName<<" age = "<<age<<endl;
		}
		
		void Shout()
		{
			cout<<"OOOOOOOOOOOOOOO"<<endl;
		}
};

template<typename T> //If you don't want it to be generic, then just remove the Comments below, lines wherever I have used T
class SP
{
	private:
		T *person; //Person *person;
	public:
		SP(T *pValue): person(pValue) //SP(Person *pValue): person(pValue)
		{
			cout <<"Constructor of Smart Pointer Called"<<endl;
		}
		~SP()
		{
			delete person;
			cout<<"Destructor Called of SP Class"<<endl;
		}
		
		/*Implement the dereferencing and indirection operator*/
		T& operator*() //Person& operator*()
		{
			return *person;
		}
		
		T* operator->() //Person* operator->()
		{
			return person;
		}
};


int main()
{
	/*Ideally I would be required to do these steps*/
	//Person *p = new Person("Ashu", 30);
	//p->Display();
	//delete p;
	
	//This is non generic, that means tightly coupled to type Person
	//SP p(new Person("Ashu", 30));
	//p->Display();
	//return 0;
	
	//example of Generic Smart Pointer
	SP<Person>p(new Person("ASHU", 30));
	p->Display();
	
	
}
