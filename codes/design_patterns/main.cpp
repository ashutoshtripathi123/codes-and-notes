#include <iostream>
#include "singleton/singleton.cpp"
#include "observer/observer.cpp"
using namespace std;

int main()
{
    /********************SINGLETON**********************/
    #if 0
    Singleton *ptrSingletonInstance = Singleton::getInstance();
    cout<<"Data = "<<ptrSingletonInstance->getData()<<endl;
    #endif
    /***************************************************/

    /****************Observer pattern********************/
    #if 0
    Database *dbObj = new Database(1,"LG");
    Listener1 *l1 = new Listener1();
    Listener2 *l2 = new Listener2();
    Listener3 *l3 = new Listener3();

    dbObj->addToListOfObserver(l1);
    dbObj->addToListOfObserver(l2);
    dbObj->addToListOfObserver(l3);

    int choice=0;
    do{
        cout<<"1: set Data \t 2: Edit Data \t 3: remove listener \t 4: Show Data \t 5: Exit"<<endl;
        cin>>choice;
        switch(choice)
        {
            case 1:
                {
                    cout<<"Input new data"<<endl;
                    int data=0;
                    string name;
                    cin>>data>>name;
                    dbObj->setData(data, name);
                }
                break;
            case 2:
                {
                    cout<<"Input new data"<<endl;
                    int data=0;
                    string name;
                    cin>>data>>name;
                    dbObj->editData(data, name);
                }
                break;
            case 3:
                if (l1 != nullptr)
                {
                    cout<<"Removing l1"<<endl;
                    dbObj->removeFromListOfObserver(l1);
                }
                else if (l2 != nullptr)
                {
                    cout<<"Removing l2"<<endl;
                    dbObj->removeFromListOfObserver(l2);
                }
                else if (l3 != nullptr)
                {
                    cout<<"Removing l3"<<endl;
                    dbObj->removeFromListOfObserver(l3);
                }
                else
                {
                    cout<<"Nothing to remove"<<endl;
                }
                break;
            case 4:
                {
                    dbObj->showData();
                }
                break;
            default:
                {
                    cout<<"unknown operation... Exiting"<<endl;
                    delete dbObj;
                }
                break;
        }
    }while(choice<5);

    #endif
    /*************************************/
}
