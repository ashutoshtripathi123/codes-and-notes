#ifndef _FACTORY_PATTERN_H_
#define _FACTORY_PATTERN_H_

#include <iostream>
using namespace std;

class Connection{
public:
    virtual string description()=0;
};

class OracleConnection: public Connection{
public:
    string description()
    {
        cout<<"This is an Oracle DB Connection"<<endl;
        return "Oracle";
    }
};

class MongoConnection: public Connection{
public:
    string description()
    {
        cout<<"This is an Mongo DB Connection"<<endl;
        return "Mongo";
    }
};

class FactoryOfConnections{
public:
string type;
Connection* creatConnection();
FactoryOfConnections(string input):type(input){}
};

#endif //_FACTORY_PATTERN_H_
