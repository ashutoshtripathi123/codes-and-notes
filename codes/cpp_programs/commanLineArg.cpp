#include<iostream>
#include<string>
#include<cstring>
using namespace std;

int main(int argc, char** argv)
{
	string input;
	int i=0;
	string *list = new string;
	for(;i<argc;i++)
	{
		list[i] = &argv[i+1];
	}
	
	#if 0
	input = argv[1];
	cout<<input<<endl;
	char *delimiter = ",";
	char *token = strtok((char *)input.c_str(), delimiter);
	while(token)
	{
		cout<<token<<" ";
		token = strtok(NULL, delimiter);
	}
	#endif
	for(i=0;i<argc;i++)
	{
		cout<<input[i]<<endl;
	}
	
	return 0;
}
