//reverse a linked list
#include<iostream>
#include<stdlib.h>
#include<unistd.h>
using namespace std;

typedef struct Node
{
	int data;
	Node *next;
}Node;
 
Node *head=NULL;

void pop()
{
        if(head)
        {
                Node *temp;
                temp=head;
                head=head->next;
                //temp->next=NULL;
                printf("popped data is:%d\n",temp->data);
                free(temp);
        }
        else
        {
                printf("stack empty\n");
        }
}
 
void push(int data)
{
        Node *temp;
        int i;
        temp= (Node*) malloc (sizeof( Node));
        temp->data=data;
        temp->next=head;
        head=temp;
}
 
void display(Node *temp)
{

        Node *trav;
        trav=head;
        printf("the data in stack is:\n");
        for(;trav!=NULL;trav=trav->next)
        {
                printf("%d\n",trav->data);
        }

} 

 Node* Reverse(Node *temp)
{
	Node *prev=NULL;
	Node *curr = temp;
	Node *next = NULL;
	while(curr != NULL)
	{
		next = curr->next;
		curr->next = prev;
		prev = curr;
		curr = next;
	}
	
	curr = prev;
	head = prev;
	return head;
}

 
int main()
{
	push(4);
	push(3);
	push(2);
	push(1);
	display(head);
	Node *rev = Reverse(head);
	cout<<"\n";
	display(rev);
	//pop();
		
}
