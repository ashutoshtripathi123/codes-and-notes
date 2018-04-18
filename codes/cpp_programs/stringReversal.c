#include <stdio.h>
#include<string.h>

int main()
{
	int len=0,t=0, i=0;
	char arr[30];
	scanf("%d", &t);
	
	for(i=0;i<t;i++)
	{
		scanf("%s", arr);
		len = strlen(arr) - 1;
	
		for(;len>=0;--len)
		{
			printf("%c",arr[len]);
		}
		printf("\n");
		len=0;
	}
return 0;	
}
