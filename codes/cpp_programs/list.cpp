#include <bits/stdc++.h>
using namespace std;

void showList(list<int>ll)
{
	if (ll.empty())
	{
		cout<<"List is empty"<<endl;
		return;		
	}

	list<int>::iterator ir;
	for(ir = ll.begin(); ir != ll.end(); ir++)
	{
		cout<<*ir<<", ";
	}
	cout<<endl;
}

int main()
{
	list<int>ll;
	ll.push_front(10);
	ll.push_back(20);
	showList(ll);
	ll.reverse();
	showList(ll);
	ll.sort();
	showList(ll);
	ll.pop_back();
	ll.pop_front();
	showList(ll);
	return 0;
}

// User defined HaspMap implemented using List.
// https://leetcode.com/problems/design-hashmap
#if 0
class MyHashMap {
public:
    list<int>data;
    list<int>::iterator ir;
    MyHashMap() {
        
    }
    
    void put(int key, int value) {
        ir = data.begin();
        advance(ir, key-1);
        if (ir != data.end())
        {
            cout<<"Data Inserted, Key Present:"<<value<<endl;
            *ir = value;
        }
        else
        {
            cout<<"Data Inserted, Key Not Present:"<<value<<endl;
            data.insert(ir, value);   
        }
    }
    
    int get(int key) {
        ir = data.begin();
        advance(ir, key-1);
        if(ir != data.end())
        {
            cout<<"Data to be displayed is:"<<*ir<<endl;
            return *ir;
        }
        cout<<"Data to be displayed is:"<<-1<<endl;    
        return -1;
    }
    
    void remove(int key) {
        ir = data.begin();
        advance(ir, key-1);
        cout<<"Data to be deleted is:"<<*ir<<endl;
        data.erase(ir);
    }
};

#endif
