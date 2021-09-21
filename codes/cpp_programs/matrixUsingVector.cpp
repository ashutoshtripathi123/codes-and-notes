
#include<bits/stdc++.h>
using namespace std;

  //create a 3x3 matrix
int main(){
    vector<vector<int>>matrix(3);//remember this 3 is important here, as we have to tell how many rows are there
    int num=0;
    for(int i=0; i< 3; i++)
    {
        cout<<"initializing Row:"<<i<<endl;
        matrix[i].assign(3,0);//matrix[i].resize(3);//both are fine
        cout<<"initializing Row:"<<i<<endl;
        for(int j=0; j<3;j++)
        {
            cout<<"initializing Column:"<<j<<endl;
            matrix[i][j]=num++;
        }
    }

    cout<<"Printing matrix::"<<endl;
    for(int i=0; i< 3; i++)
    {
        matrix[i].resize(3);
        for(int j=0; j<3;j++)
        {
            cout<<matrix[i][j]<<'\t';
        }
        cout<<endl;
    }

    return 0;
}
