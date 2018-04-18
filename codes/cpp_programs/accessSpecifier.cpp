#include<iostream>
using namespace std;

class Derived; //Change required for forward declaration 
class Base
{
	private:
		int iAmPrivate;
		Derived *d1; // note here that * is required, because compilaer doesnt know yet abt Derived class
		             // thats why he can create a pointer of Derived object, but not a full fledge object
		             // as compiler doesn't yet know how much size it should allocate
	protected:
		int iAmProtected;
	public:
		int iAmPublic;
	    
		Base():iAmPrivate(0),iAmProtected(0),iAmPublic(0)
		{
			cout<<"Constructor of Base Called"<<endl;
		}
		
		void baseAcess()
		{
			cout<<"private="<<iAmPrivate<<" protected="<<iAmProtected<<" public="<<iAmPublic<<endl;
		}
		
		void baseAssign()
		{
			iAmPrivate=10;
			iAmProtected=20;
			iAmPublic=30;
		} 
};


class Derived:public Base
{
	protected:
		//protected function cannot be called directly from the object unlike public
		/*void protectedFuncOfDerived()
		{
			
		}*/
	public:
	Derived()
	{
		cout<<"Constructor of Derived Called"<<endl;
	}	
	derivedModifyingBase()
	{
		//iAmPrivate=100; //it gives a compilation error. I cannot access any private member of even Base class from derived
		iAmProtected=200;
		iAmPublic=300;
	}	
};

int main()
{
	Derived d;
	d.baseAssign();
	d.baseAcess();
	d.derivedModifyingBase();
	//d.protectedFuncOfDerived();
	d.baseAcess();
	
	return 0;
}
