#include <iostream>
using namespace std;
class Base
{
public:
	Base(){
		cout<<"Base Constructor"<<endl;
	}
	~Base()
	{
		cout<<"Base Destructor"<<endl;
	}
    virtual const char* getName() { return "Base"; }
};
 
class Derived: virtual public Base
{
public:
	Derived()
	{
		cout<<"Derived Constructor"<<endl;
	}
	~Derived()
	{
		cout<<"Derived Destructor"<<endl;
	}
    virtual const char* getName() ; //I could have declared it inside as well, but just wanted to try keeping it outside
    int abcd;
};

const char * Derived:: getName()
{
	return "Derived";
}

int main()
{
    Derived derived ;
    Base &base = derived;
    // Calls Base::GetName() instead of the virtualized Derived::GetName()
    std::cout << base.Base::getName() << endl;
    //cout<<base.abcd; //this is not possible, as its not defined in base
    cout<<base.getName()<<endl;
    //delete derived;
    
}
