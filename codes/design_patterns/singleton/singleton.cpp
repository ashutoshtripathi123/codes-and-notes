#include "singleton.h"

Singleton* Singleton::singletonInstance = nullptr;

Singleton* Singleton::getInstance()
{
    if (nullptr == singletonInstance)
    {
        singletonInstance = new Singleton(5);
    }

    return singletonInstance;
}

int Singleton::getData()
{
    return this->data;
}

void Singleton::setData(int value)
{
    this->data = value;
}
