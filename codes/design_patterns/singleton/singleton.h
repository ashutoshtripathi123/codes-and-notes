#ifndef __SINGLETON__
#define __SINGLETON__
#include <iostream>
using namespace std;
class Singleton
{
    private:
    int data;
    static Singleton *singletonInstance;
    Singleton (int value):data(value)
    {
        cout<<"Singleton Instance created"<<endl;
    }
    public:
    Singleton (Singleton &) = delete; //Its reqd. for because Singletons should not be cloneable.
    Singleton& operator = (Singleton&) = delete; //Singletons should not be assignable.
    static Singleton* getInstance();
    int getData();
    void setData(int value);
};
#endif
