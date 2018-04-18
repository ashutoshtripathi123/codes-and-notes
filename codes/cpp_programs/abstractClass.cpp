#include<iostream>
#include <map>
#include <iterator>
#include <string>
using namespace std;

class Abstract
{
	public:
		Abstract()
		{
			cout<<"Abstract Constructor"<<endl;
		}
		
		virtual ~Abstract()
		{
			cout<<"Abstract Destructor"<<endl;
		}
		virtual void listDir()=0;
		virtual void setData()=0;
};

class Result
{
	//void addToMap(char *filePath);
	map<string, string> ds;
	map<string, string> finalResult;
	map<string, string>::iterator ir1, ir2;
	char *inputString;
	
	public:
		int data;
	Result()
	{
		cout<<"Result Constructor"<<endl;	
	}	
	~Result()
	{
		cout<<"Result Destructor"<<endl;	
	}
	void setData()
	{
		cout<<"setData() of Result"<<endl;	
	}	
};

class Linux: virtual public Result, virtual public Abstract
{
	public:
		Result rs;
	Linux()
	{
		cout<<"Linux Constructor"<<endl;	
	}
	
	~Linux()
	{
		cout<<"Linux Destructor"<<endl;	
	}	
	
	void listDir()
	{
		cout<<"listDir inside Linux"<<endl;
	}
	void setData()
	{
		cout<<"setData() of Linux"<<endl;	
	}	
};

int main()
{
	Abstract *a = new Linux(); 
	a->listDir();
	a->setData();
	delete a;
	return 0;
}
