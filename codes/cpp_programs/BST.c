#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

struct Node
{
	int data;
	struct Node * right;
	struct Node * left;
}; 

struct Node *root = NULL;

struct Node * newNode(int temp)
{

	struct Node *local = (struct Node *)malloc(sizeof(struct Node ));
	local->data=temp;
	local->left=NULL;
	local->right=NULL;
	return local;
}

struct Node * insert(struct Node *temp, int value)
{
	if(temp == NULL)
	{
		temp = newNode(value);
		return temp;
		
	}
	else
	{
		if(value>temp->data)
		{
			temp->right=insert(temp->right, value);
		}
		else if(value < temp->data)
		{
			temp->left = insert(temp->left, value);
		}
	}
}

void search()
{
}

void inorder(struct Node *node)
{
	if(node != NULL)
	{
		inorder(node->left);
		printf("%d ", node->data);
		inorder(node->right);
	}
}

void preorder(struct Node *node)
{
	if(node != NULL)
	{
		printf("%d ", node->data);
		preorder(node->left);
		preorder(node->right);
	}
}

void postorder(struct Node *node)
{
	if(node != NULL)
	{
		postorder(node->left);
		postorder(node->right);
		printf("%d ", node->data);
	}
}

int height(struct Node *node)
{
	int lheight=0,rheight=0;
	if(node == NULL)
	{
		return 0;
	}
	else
	{
		lheight = height(node->left);
		rheight = height(node->right);
	}
	
	if(lheight>rheight)
	{
		return (lheight+1);
	}
	else
	{
		return (rheight+1);
	}
}

void printGivenLevel(struct Node *node, int level)
{
	if(root == NULL)
	{
		return;
	}
	
	if(level == 1)
	{
		printf("%d ", node->data);
	}
	else if(level>1)
	{
		printGivenLevel(node->left, level-1);
		printGivenLevel(node->right, level-1);
	}
}

/*breadthFirstOrder or search is also called as Level Order Tree Traversal*/
void breadthFirstOrder(struct Node *node)
{
	int h = height(node);
	int i=1;
	for(i=1;i<=h;i++)
	{
		printGivenLevel(root, i); //Important, see this, every time I am calling Root, it's 'i' which will ask func to traverse further down
	}
	
}

/*Create a mirror image of a binary tree */
void mirror(struct Node *node)
{
	if(node == NULL)
	{
		return;
	}
	else
	{
		struct Node *temp;
		mirror(node->left);
		mirror(node->right);
		temp        = node->left;
		node->left  = node->right;
		node->right = temp;
	}
}

/***************** left View of a Binary Tree **************************/
void leftViewUtil(struct Node *node, int level, int *max_level)
{
	if(node == NULL)
	{
		return;
	}

	if(*max_level < level)
	{
		printf("%d \t", node->data);
		*max_level = level;
	}

	leftViewUtil(node->left, level+1,max_level); //if you want to print the right side view of binary tree, then swap these 2 lines
	leftViewUtil(node->right, level+1,max_level);

}

void leftView(struct Node *head)
{
	int max_level=0;
	leftViewUtil(head, 1, &max_level);
}
/************************************************************************/

int main()
{
	int op=1;
	int temp=0;
	while(op!=0)
	{
		printf("\n Select from the following Operation: 0) Exit 1)Insert 2) Search 3)Inorder 4) Preorder 5) Postporder 6) BFS 7) Height\n");
		scanf("%d", &op);
		switch(op)
		{
			case 0:
				exit(1);
				break;
			case 1:	
				printf("Give a Number: \n");
				scanf("%d", &temp);
				root=insert(root, temp);
				break;
			case 2:
				search();
				break;
			case 3:
				inorder(root);
				break;
			case 4:
				preorder(root);
				break;
			case 5:
				postorder(root);
				break;
			case 6:
				breadthFirstOrder(root);
				break;
			case 7:
				temp = height(root);
				printf("%d \n", temp);
				break;
			default:
				exit(1);
		}
	}
}





