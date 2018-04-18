/*Programs in this file will keep on changing, as this file is just used to Compile short puzzles from hackerearth or anyother portal*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
//Program to count the occurance of each digit in a string
int main()
{
	int arr[10] = {0};
	char input[100];
	int size=0,i=0;
	scanf("%s", input);
	size = strlen(input)-1;
	for(i=0;i<=size;i++)
	{
		char temp = input[i];
		int num = temp - '0';
		++arr[num];

	}
	for(i=0;i<=9;i++)
	{
		printf("%d %d \n", i, arr[i]);
	}
	return 0;
}
*/

/*
int main()
{
    int num=0;
    int i=0;
    int sum = 0;
    scanf("%d", &num);
    int arr[num];
    for(i=0;i<num;i++)
    {
        scanf("%d", &arr[i]);
        sum+=arr[i];
    }
    
    int avg = sum/num;
    printf("%d", ++avg);
    return (0);  
}
*/

/*
int main()
{
    //printf("Hello World");
    void *mallocPtr = (int *)malloc(sizeof(int)*10);
    void *callocPtr = (int *)calloc(10,1);
    printf("addr = %ld, next addr = %ld \n", mallocPtr, ++mallocPtr);
    printf("addr = %ld, next addr = %ld \n", callocPtr, ++callocPtr);
    
    free(mallocPtr);
    free(callocPtr);
    return 0;
}
*/
#include <stdio.h>

int main()
{
    unsigned int l = 3;
    unsigned char c = l;
    //sprintf(&c, "%d", l);
	printf("C = %d", c);
    return 0;
}

