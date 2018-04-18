#include<iostream>
#include<queue> //NOTICE THIS, similarly for stack its #include <stack>. however for priority_queue, its <queue>
using namespace std;
/*The functions supported by queue are :
empty() – Returns whether the queue is empty
size() – Returns the size of the queue
front() – Returns a reference to the first element of the queue
back() – Returns a reference to the last element of the queue
push(g) – Adds the element ‘g’ at the end of the queue
pop() – Deletes the first element of the queue*/

/*priority_queue is exactly similar to queue, only difference that all its members are in sorted order, with top being the biggest*/

/*The functions associated with stack are:
empty() – Returns whether the stack is empty
size() – Returns the size of the stack
top() – Returns a reference to the top most element of the stack
push(g) – Adds the element ‘g’ at the top of the stack
pop() – Deletes the top most element of the stack*/

/*Double ended queues are sequence containers with the feature of expansion and contraction on both the ends. 
They are similar to vectors, but are more efficient in case of insertion and deletion of elements at the end, and also the beginning.
 Unlike vectors, contiguous storage allocation may not be guaranteed.
The functions for deque are same as vector, with an addition of push and pop operations for both front and back.*/

//NOTE:: Iterator cannot be used in stack or queue, its the tool available only for vector, deque
void show(queue <int> input)
{
	queue <int> temp = input;
	while(!temp.empty())
	{
		cout << '\t' << temp.front();
		temp.pop();
	}
	
}

int main()
{
	queue<int> input;
	input.push(10);
	input.push(20);
	input.push(30);
	input.push(40);
	input.push(50);
	cout << "input.size()="<<input.size()<<endl;
	cout << "input.front()="<<input.front()<<endl;
	cout << "input.back()="<<input.back()<<endl;
	show(input);
	return 0;
}











