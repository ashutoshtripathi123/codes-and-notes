// https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach/problem
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int path = -1;
    bool visited = false;
    vector<Node *>kids;
};

int main()
{
    int testCases;
    cin>>testCases;
    while(testCases--)
    {
        int numberOfNodes=0,numberOfEdges=0;
        cin>>numberOfNodes>>numberOfEdges;
        
        //create all the nodes
        vector<Node*>nodes(numberOfNodes);
        for(int i=0; i< numberOfNodes; i++)
        {
            nodes[i] = new Node();
        }
        
        //Edges nothing but inserting in the kids of nodes
        for(int i=0; i< numberOfEdges; i++)
        {
            int a=0, b=0;
            cin>>a>>b;
            nodes[a-1]->kids.push_back(nodes[b-1]);
            nodes[b-1]->kids.push_back(nodes[a-1]);
        }
        
        int start=0;
        cin>>start;
        deque<Node *>q;
        q.push_back(nodes[start-1]);
        int path=0;
        q.front()->visited = true;
        q.front()->path = 0;
        while(!q.empty())
        {
            path = q.front()->path + 6;
            for(Node *ptr : q.front()->kids)
            {
                if (!ptr->visited)
                {
                    ptr->path = path;
                    ptr->visited = true;
                    q.push_back(ptr);
                }
            }
            q.pop_front();
        }
        
        for(Node *ptr : nodes)
        {
            if (ptr->path !=0)
                cout<<ptr->path<<" ";
        }
        cout<<endl;
    }
}