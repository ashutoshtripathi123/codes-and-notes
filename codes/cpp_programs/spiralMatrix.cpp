#include <bits/stdc++.h>
using namespace std;
//4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
vector<int> spirallyTraverse(vector<vector<int> > &mat, int row, int col)
{
    int left=0,top=0,right=col-1, bottom = row-1;
    while(1)
    {
        if (left>right)
            break;
        for(int i=left;i<=right;i++)
        {
            cout<<mat[top][i]<<" ";
        }
        ++top;

        if (top>bottom)
            break;
        for(int i=top; i<=bottom;++i)
        {
            cout<<mat[i][right]<<" ";
        }
        --right;

        if (left>right)
            break;
        for(int i=right; i>=left;--i)
        {
            cout<<mat[bottom][i]<<" ";
        }
        --bottom;

        if(top>bottom)
            break;
        for(int i=bottom;i>=top;--i)
        {
            cout<<mat[i][left]<<" ";
        }
        left++;

    }
}

void printMatrix(vector<vector<int>>mat, int r, int c)
{
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<mat[i][j]<<" ";
        }
        cout<<endl;
    }
}

int main()
{

    int r=0,c=0;
    cin>>r>>c;
    vector<vector<int>>mat(r);
    for(int i=0;i<r;i++)
    {
        mat[i].assign(c, 0);
        for(int j=0;j<c;j++)
        {
            cin>>mat[i][j];
        }
    }
    cout<<"Matrix = "<<endl;
    printMatrix(mat, r, c);
    spirallyTraverse(mat, r, c);
    cout<<"Spiral Matrix= "<<endl;
    printMatrix(mat, r, c);
}