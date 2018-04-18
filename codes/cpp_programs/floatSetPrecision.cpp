#include <iostream>
#include<iomanip>
using namespace std;

int main()
{
    float a = 1.12345;
    cout<<a<<endl;
    cout<<fixed<<setprecision(2);
    cout<<"After setting of precision"<<endl;
    cout<<a<<endl;

    return 0;
}

