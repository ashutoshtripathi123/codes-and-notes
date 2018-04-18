#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//Transpose of a matrix
int main()
{
	int input_row=0, input_column=0;
	int output_row=0, output_column=0;
	int i=0,j=0;
	scanf("%d %d", &input_row, &input_column);
	int input_arr[input_row][input_column];
	for(i=0;i<input_row;i++)
	{
		for(j=0;j<input_column;++j)
		{
			scanf("%d",&input_arr[i][j]);
		}
	}
	printf("\n");
	output_row = input_column;
	output_column = input_row;
	int output_arr[output_row][output_column];
	
	for(i=0;i<input_column;i++)
	{
		for(j=0;j<input_row;j++)
		{
			output_arr[i][j]=input_arr[j][i];
		}
	}
	
	/*Print the output*/
	for(i=0;i<output_row;i++)
	{
		for(j=0;j<output_column;++j)
		{
			printf("%d ",output_arr[i][j]);
		}
		printf("\n");
	}	

}
