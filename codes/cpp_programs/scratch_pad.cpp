#include <iostream>
#include <string>
#include<iostream>
#include<map>
#include<iterator>
#include<utility>

using namespace std; 
#if 0
class Base
{
protected:
	int m_value;
 
public:
	Base(int value)
		: m_value(value)
	{
	}
 
	virtual const char* getName() { return "Base"; }
};
 
class Derived : public Base
{
public:
	Derived(int value)
		: Base(value)
	{
	}
 
	virtual const char* getName()  { return "Derived"; }
};


int main()
{
	Derived d(5);
	Base &b = d;
	std::cout << b.getName();
 
	return 0;
}
#endif
//////////////////////////////////////////////////
#if 0
/*Size of class having just hifour virtual function = 8 bytes, dont know why. keep it 4 or one, the size always returned is 8*/
class A
{
    virtual void func1(){}
    virtual void func2(){}
    virtual void func3(){}
    virtual void func4(){}
};

int main()
{
    cout<<"Sizeof Class = "<<sizeof(A);

    return 0;
}
#endif
///////////////////////////////////////////
#if 0
class Test
{
};

int main()
{
    std::cout <<"Class size = "<< sizeof(Test)<<endl;
    Test t;
    cout<<"Sizeof object = "<<sizeof(t)<<endl;
    return 0;
}
#endif
////////////////////////////////////////////////
#if 0
class ABC{
	public:
		char *ptr;
	void getdata()
	{
		cout<<"string = "<<ptr<<endl;
	}
};

int main()
{
	ABC a;//=new ABC();
	a.ptr=new char[4];
	cin>>a.ptr;
	a.getdata();
	delete [] a.ptr;
	return 0;
}
#endif
///////////////////////////////////////////
#if 0
template<typename T>
T* silly(T const &x)
{
    T *p = new(T);
    *p = x;
    return p;
}

template<>
int *silly<int>(int const &i)
{
    int *p = new (int);
    *p = i-1;
    return p;
}

int main()
{
    string s("Lucky Number ");
    cout<<*silly<string>(s)<<*silly(7);
    return 0;
}
#endif
////////////////////////
#if 0
class Base{};
class Derived: Base //Privately inherited
{};

int main()
{
	Derived *d = new Derived();
	Base *b ;
	*b = *d; //remember this will show an error: Base is an inaccessible base of Derived
}
#endif
//////////////////////////

