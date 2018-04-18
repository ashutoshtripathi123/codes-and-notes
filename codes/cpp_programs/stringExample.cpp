/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main()
{
    cout<<"Hello World"<<endl;
    char ch;
    string str1;
    for(int i=0;i<8;i++)
    {
        cin>>ch;
        //str1+=ch;
        str1.append(1,ch);// i can use either this or the above line
    }
    
    cout<<str1;
    if(str1 != "ASHUTOSH")
    	cout<<"YES"<<endl;
    str1.clear();
    return 0;
}




