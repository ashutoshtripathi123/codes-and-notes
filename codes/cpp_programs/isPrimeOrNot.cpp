/*The complexity of this solution is O(sq(N)).
I have taken this solution from the discussion section of hackerrank ctci. This is a newer approach. 
Instead of sqrt(n) when i was taking n/2, i was getting 3 test cases as out of time. This trick helped.*/
#include <iostream>
#include<iomanip>
#include<cmath>
using namespace std;

enum prime{
    OFF,
    PRIME,
    NOTPRIME
};

int main(){
    int p;
    enum prime p1;
    cin >> p;
    for(int a0 = 0; a0 < p; a0++){
        int n;
        cin >> n;
        p1=OFF;
        if(n==1)
        {
            cout<<"Not prime"<<endl;
            continue;
        }
        int sq = sqrt(n);
        for(int i=2;i<=sq;i++)
        {
            if(n%i==0)
            {
                cout<<"Not prime"<<endl;
                p1=NOTPRIME;
                break;
            }
        }
        if(p1 == OFF)
            cout<<"Prime"<<endl;
    }
    return 0;
}

