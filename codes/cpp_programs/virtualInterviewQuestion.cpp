/*The question is, what would be the output, if I declare a virtual function in Base class as public, however in derived class
its private. Answer is it would go ahead and call. Reason being, access specifiers are checked only during compilation time,
since Base object can call its own func function which is public, it would assume that this will get called, and wont throw any compilation error*/
#include<iostream>
using namespace std;

class Base
{
	public:
		Base()
		{
			cout <<"Base Constructor"<<endl;
		}
		~Base()
		{
			cout<<"Base Destructor"<<endl;
		}
	virtual void func()
	{
		cout<<"Virtual of Base"<<endl;
	}	
};

class Derived: public Base
{
	private:
		virtual void func()
		{
			cout<<"Virtual of Derived"<<endl;
		}
	
	public:
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
	Base &b = d;
	b.func();
	return 0;
}

#if 0
// Asked in unisys
#include <iostream>

class Base {
    virtual void method() {std::cout << "from Base" << std::endl;}
public:
    virtual ~Base() {method();}
    void baseMethod() {method();}
};

class A : public Base {
    void method() {std::cout << "from A" << std::endl;}
public:
    ~A() {method();}
};

int main(void) {
    Base* base = new A;
    base->baseMethod();
    delete base;
    return 0;
}
#endif
