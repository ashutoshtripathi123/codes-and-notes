#include "observer.h"

    void Database::addToListOfObserver(Observer *entry)
    {
        list_of_observer.push_back(entry);
    }

    void Database::removeFromListOfObserver(Observer *entry)
    {
        cout<<"Going to remove one of the listener"<<endl;
        list_of_observer.erase(std::remove(list_of_observer.begin(), list_of_observer.end(), entry), list_of_observer.end());
    }

    void Database::setData(int data, string name)
    {
        cout<<"Received an update in Database"<<endl;
        m_data = data;
        m_name = name;
        notifyObserver();
    }

    void Database::editData(int data, string name)
    {
        cout<<"Editing the data in database"<<endl;
        m_data = data;
        m_name = name;
        notifyObserver();
    }

    Database Database::getData()
    {
        Database tmp;
        tmp.m_data = this->m_data;
        tmp.m_name = this->m_name;
        return tmp;
    }

    void Database::notifyObserver()
    {
        cout<<"Going to Notify all the observers now"<<endl;
        for(int i=0; i<list_of_observer.size(); ++i)
            list_of_observer[i]->update(this->m_name);
    }

    void Database::showData()
    {
        cout<<"Saved Data is:: data = "<<m_data<<", name = "<<m_name<<endl;
    }

    void Listener1::update(string name)
    {
        cout<<"Listener1 Received Update....name = "<<name<<endl;
    }

    void Listener2::update(string name)
    {
        cout<<"Listener2 Received Update...name = "<<name<<endl;
    }

    void Listener3::update(string name)
    {
        cout<<"Listener3 Received Update...name = "<<name<<endl;
    }
