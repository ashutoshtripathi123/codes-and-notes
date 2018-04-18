#include<iostream>
#include<map>
#include<iterator>
#include <string>
//#include<assert>
using namespace std;


//resource from: http://www.geeksforgeeks.org/map-associative-containers-the-c-standard-template-library-stl/
#if 0
int main()
{
	map<int,int> a1;
	map<int,int> a2;
	map<int,int>::iterator itr;
	
	a1.insert(pair<int, int>(1, 10));
	a1.insert(pair<int, int>(2,20));
	a1.insert(pair<int,int>(3,30));
	a1.insert(pair<int, int>(4, 40));
	a1.insert(pair<int, int>(5, 50));
	
	for(itr=a1.begin();itr !=a1.end();++itr)
	{
		cout<<itr->first<<'\t'<<itr->second;
		cout << endl;
	}
	
	cout<<"Printing a2:"<<endl;
	//a2=a1; //internally calls copy constructor
	a2.insert(a1.begin(), a1.end());
	
	for(itr=a2.begin();itr !=a2.end();++itr)
	{
		cout<<itr->first<<'\t'<<itr->second;
		cout << endl;
	}
	
	/*Another example of Map taken from stackoverflow*/
  map<string, int> m;
  m["hello"] = 23;
  // check if key is present
  if (m.find("world") != m.end())
    cout << "map contains key world!\n";
  // retrieve
  cout << m["hello"] << '\n';
  map<string, int>::iterator i = m.find("hello");
  //assert(i != m.end());
  std::cout << "Key: " << i->first << " Value: " << i->second << '\n';
  return 0;	
	
}
#endif
#if 1 //User defined Data Type as key
class User
{
    std::string m_id;
    std::string m_name;
public:
    User(std::string name, std::string id)
    :m_id(id), m_name(name)
    {}
    const std::string& getId() const {
        return m_id;
    }
    const std::string& getName() const {
        return m_name;
    }
    bool operator< (const User& userObj) const
    {
        if(userObj.m_id < this->m_id)
            return true;
    }
};

int main()
{
    std::map<User, int> m_UserInfoMap;

    m_UserInfoMap.insert(make_pair<User, int>(User("Mr.Y", "3"), 100) );
    m_UserInfoMap.insert(std::make_pair<User, int>(User("Mr.X", "1"), 120) );
    m_UserInfoMap.insert(std::make_pair<User, int>(User("Mr.Z", "2"), 300) );

    std::map<User, int>::iterator it = m_UserInfoMap.begin();
    for(; it != m_UserInfoMap.end(); it++)
    {
        std::cout<<it->first.getName()<<" :: "<<it->second<<std::endl;
    }
    
    return 0;
}

#endif

#if 0
int main()
{
	map<string, string> data;
	map<string, string>::iterator ir;
	data.insert(pair<string, string>("x.c","A"));
	data.insert(pair<string, string>("y.c","A"));
	data.insert(pair<string, string>("z.c","A"));
	
	//data.insert(pair<string, string>("x.c","B"));
	//data.insert(pair<string, string>("y.c","B"));
	//data.insert(pair<string, string>("z.c","B"));
	
	//data.insert(pair<string, string>("z.c","C"));
	
	for(ir=data.begin();ir != data.end(); ir++)
	{
		cout<<ir->first<<'\t'<<ir->second<<endl;
	}
	
	ir = data.find("x.c");
	if(ir != data.end())
	{
		//ir->second="B";
		//strcat(&ir->second,"B");
		ir->second.append("B");	
	}
	
	cout<<endl;
	for(ir=data.begin();ir != data.end(); ir++)
	{
		cout<<ir->second<<endl;
	}
	
}
#endif
