#include <bits/stdc++.h>
using namespace std;

//priority_queue should be preferred for problems where we need to perform operation on array, like insert delete modify, but we always need to maintain the
//order in the queue, i.e. ascending or descending 

int main()
{
    priority_queue <int> descending;
    descending.push(5);
    descending.push(1);
    descending.push(10);
    descending.push(30);
    descending.push(20);
    descending.push(10);
 
    cout<<"Printing descending order priority_queue:"<<endl;
    while(!descending.empty())
    {
        cout<<descending.top()<<"\t";
        descending.pop();
    }
    
    priority_queue <int, vector<int>, greater<int> > ascending;
    ascending.push(5);
    ascending.push(1);
    ascending.push(10);
    ascending.push(30);
    ascending.push(20);
    ascending.push(10);
 
    cout<<endl<<"Printing ascending order priority_queue:"<<endl;
    while(!ascending.empty())
    {
        cout<<ascending.top()<<"\t";
        ascending.pop();
    }
    
    cout<<endl;
    return 0;
}