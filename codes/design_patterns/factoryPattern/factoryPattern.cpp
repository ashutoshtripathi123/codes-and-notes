#include "factoryPattern.h"

// THe idea is an object that creates other objects

Connection* FactoryOfConnections::creatConnection()
{
    if (type == "Oracle")
        return new OracleConnection();
    else if (type == "Mongo")
        return new MongoConnection();
    else
        cout<<"Invalid Input";

    return nullptr;
}

