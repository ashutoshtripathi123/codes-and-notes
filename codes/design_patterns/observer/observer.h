#ifndef _OBSERVER_H_
#define _OBSERVER_H_
#include <bits/stdc++.h>
using namespace std;

class Observer
{
    public:
        virtual void update(string operation)=0;
        //virtual ~Observer();
};

class Listener1: public Observer
{
    void update(string name);
};

class Listener2: public Observer
{
    void update(string name);
};

class Listener3: public Observer
{
    void update(string name);
};

class Database
{
private:
    int m_data;
    string m_name;
public:
    vector<Observer*>list_of_observer;
    void addToListOfObserver(Observer *entry);
    void removeFromListOfObserver(Observer *entry);
    void setData(int data, string name);
    void editData(int data, string name);
    Database getData();
    void notifyObserver();
    Database(int data, string name):m_data(data), m_name(name){cout<<"New object created of Database"<<endl;}
    Database() = default;
    void showData();
};


#endif // _OBSERVER_H_
