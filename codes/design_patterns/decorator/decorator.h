#ifndef _DECORATOR_H_
#define _DECORATOR_H_
#include <iostream>
using namespace std;

class IceCream{
public:
    virtual void make() = 0;
    virtual ~IceCream(){}
};

class SimpleIceCream : public IceCream
{
public:
    virtual void make()
    {
        cout<<"Milk + Sugar + Ice Cream Powder ";
    }
};

class IceCreamDecorator : public IceCream
{
public:
    IceCreamDecorator(IceCream &decorator) : m_decorator(decorator){}
    virtual void make()
    {
        m_decorator.make();
    }
private:
    IceCream &m_decorator;
};

class WithFruits:public IceCreamDecorator{
public:
    WithFruits(IceCream &decorator) : IceCreamDecorator(decorator){}
    virtual void make()
    {
        IceCreamDecorator::make();
        cout<<" + Fruits ";
    }
};

class WithNuts:public IceCreamDecorator{
public:
    WithNuts(IceCream &decorator) : IceCreamDecorator(decorator){}
    virtual void make()
    {
        IceCreamDecorator::make();
        cout<<" + Nuts ";
    }
};

class WithWaffers:public IceCreamDecorator{
public:
    WithWaffers(IceCream &decorator) : IceCreamDecorator(decorator){}
    virtual void make()
    {
        IceCreamDecorator::make();
        cout<<" + Waffers ";
    }
};

#endif // _DECORATOR_H_
