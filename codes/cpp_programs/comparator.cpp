#include <stdio.h>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool comparator(const pair<int, int>&a, const pair<int, int>&b)//sort in ascending order
{
    if (a.first > b.second) return true;
}

int main()
{
    cout<<"This is an example of user defined comparing function"<<endl;

    int arr[5]={1,2,3,4,5};
    int arr1[5]={10, 20, 30, 40, 50};
    vector<pair<int, int>>vec;

    for(int i=4; i>=0; i--)
    {
        vec.push_back(make_pair(arr[i], arr1[i]));
    }
    cout << "The vector before sort operation is:\n" ;
    for (int i=0; i<5; i++)
    {
        cout<<"First: "<<vec[i].first<<", second: "<<vec[i].second<<endl;
    }

    sort(vec.begin(), vec.end(), comparator);

    cout<<"Sorting the vector elements on the basis of second element of pairs in ascending order:"<<endl;
    for(int i=0; i< 5; i++)
    {
        cout<<"First: "<<vec[i].first<<", second: "<<vec[i].second<<endl;
    }

    return 0;
}
