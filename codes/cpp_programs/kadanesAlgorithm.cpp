//Kadane's Algorithm : https://youtu.be/ohHWQf1HDfU

#include<bits/stdc++.h>
using namespace std;


class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){

        // This logic will work only if there is atleast one positive element in the array
        // So for corner case, where all elements are -ve, lets have one check which checks for all elements
        bool flagAllNegative=true;
        int biggestNegativeNumber=INT_MIN;
        int ans=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                //One +ve element found
                flagAllNegative=false;
                break;
            }
            else
            {
                biggestNegativeNumber=max(biggestNegativeNumber, arr[i]);
            }
        }

        if(!flagAllNegative)
        {
            for(int i=0;i<n;i++)
            {
                if((sum+arr[i])>0)
                {
                    sum+=arr[i];
                }
                else
                {
                    sum=0;
                }
                ans=max(sum,ans);
            }
        }
        else
        {
            ans = biggestNegativeNumber;
        }
        return ans;
    }
};

int main()
{
    int n;
    cin>>n; //input size of array
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i]; //inputting elements of array
    Solution ob;
    cout << ob.maxSubarraySum(a, n) << endl;
}