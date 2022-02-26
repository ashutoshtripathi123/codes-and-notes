#include <string>
#include <iostream>
#include <list>

class Resource
{
	int value;
	public:
		Resource()
		{
			value = 0;
		}
		
		void Reset()
		{
			value = 0;
			std::cout<<"Value reset to Zero"<<std::endl;
		}
		
		int getValue()
		{
			return value;
		}
		
		void setValue(int a)
		{
			value = a;
		}
};

class ObjectPool
{
private:
	std::list<Resource*>resource;
	static ObjectPool *objectPoolInstance;
	ObjectPool()
	{
		
	}
public:
	static ObjectPool *getObjectPoolInstance()
	{
		if (objectPoolInstance == nullptr)
			objectPoolInstance = new ObjectPool;
			
		return objectPoolInstance;		
	}	
	
	Resource *getResource()
	{
		if (resource.empty())
		{
			std::cout<<"Creating New Resource Object"<<std::endl;
			return new Resource;
		}
		else
		{
			std::cout<<"Returning existing Resource Object"<<std::endl;
			Resource *obj = resource.front();
			resource.pop_front();
			return obj;
		}
	}
	
	void returnResource(Resource *object)
	{
		object->Reset();
		resource.push_back(object);
	}
};

