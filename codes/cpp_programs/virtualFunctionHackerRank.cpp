/******************************************************************************
https://www.hackerrank.com/challenges/virtual-functions/problem
*******************************************************************************/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Person
{
    protected:
    char *name;
    int age;
    public:
    Person()
	{
		name = new char[100];	
	}
	
	~Person()
	{
		delete [] name;
	}
    virtual void getdata(){}
    virtual void putdata(){}
};

class Professor: virtual public Person
{
    protected:
    int publication;
    int objectsLocalCurId;
    
    public:
    static int cur_id;
    void putdata()
    {
      cout<<name<<" "<<age<<" "<<publication<<" "<<objectsLocalCurId <<endl;      
    }
    
    void getdata()
    {
        ++cur_id;
        cin>>name;
        cin>>age;
        cin>>publication;
        objectsLocalCurId = cur_id;
    }
    
};

class Student: virtual public Person
{
    protected:
    int marks[6];
    int objectsLocalCurId;
    
    public:
    static int cur_id;
    void putdata()
    {
      int sum = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5];
      cout<<name<<" "<<age<<" "<<sum<<" "<<objectsLocalCurId << endl;      
    }
    
    void getdata()
    {
        ++cur_id;
        cin>>name;
        cin>>age;
        for(int i=0;i<6;i++)
        {
            cin>>marks[i];
        }
        objectsLocalCurId = cur_id;
    }
    
};
int Professor::cur_id=0;
int Student::cur_id=0;

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}

