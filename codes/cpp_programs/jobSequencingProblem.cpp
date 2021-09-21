// { Driver Code Starts
// Program to find the maximum profit job sequence from a given array
// of jobs with deadlines and profits
#include<bits/stdc++.h>
using namespace std;

// A structure to represent a job
struct Job
{
    int id;	 // Job Id
    int dead; // Deadline of job
    int profit; // Profit if job is over before or on deadline
};


 // } Driver Code Ends

/*
struct Job
{
    int id;	 // Job Id
    int dead; // Deadline of job
    int profit; // Profit if job is over before or on deadline
};
*/

/*
1) Sort the Jobs based upon profit in descending order
2) select top job, put it in array slot closest to its deadline
3) if slot is already taken, then check and pick up the next minimum slot
*/

class Solution
{
    public:
    static bool comparator(Job v1, Job v2)
    {
        return (v1.profit > v2.profit);
    }

    //Function to find the maximum profit and the number of jobs done.
    vector<int> JobScheduling(Job arr[], int n)
    {
        //sort the arr
        //Sort the jobs according to maximum profit
        sort(arr,arr+n,comparator);

        //we will keep a deadline check array, at which deadline the jobs had done
        bool check[n+1] = {0};

        int profit = 0;
        int noOfJobs = 0;


        //Iterate throught the jobs array
        for(int i=0;i<n;i++){

            //Iterate to the check array backwards
            //why j=min() because maybe the deadline is more than n but we can do it
            //before n also.
            for(int j=min(n,arr[i].dead); j>=1; j--){
                if(check[j]==0){
                    profit+=arr[i].profit;
                    noOfJobs++;
                    check[j] = 1;
                    break;
                }
            }
        }

        return {noOfJobs, profit};
    }
};

// { Driver Code Starts.
// Driver program to test methods
int main()
{
    int t;
    //testcases
    cin >> t;

    while(t--){
        int n;

        //size of array
        cin >> n;
        Job arr[n];

        //adding id, deadline, profit
        for(int i = 0;i<n;i++){
                int x, y, z;
                cin >> x >> y >> z;
                arr[i].id = x;
                arr[i].dead = y;
                arr[i].profit = z;
        }
        Solution ob;
        //function call
        vector<int> ans = ob.JobScheduling(arr, n);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
	return 0;
}


  // } Driver Code Ends
