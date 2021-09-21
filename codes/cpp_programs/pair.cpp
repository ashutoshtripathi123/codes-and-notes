// CPP program to illustrate pair STL
#include <iostream>
#include <utility>
using namespace std;

int main()
{
    pair<int, char> PAIR1;
    //Another way to initialize a pair is by using the make_pair() function.
    //pair g2;
    //g2 = make_pair(1, 'a');

    PAIR1.first = 100;
    PAIR1.second = 'G';

    cout << PAIR1.first << " ";
    cout << PAIR1.second << endl;

    return 0;
}