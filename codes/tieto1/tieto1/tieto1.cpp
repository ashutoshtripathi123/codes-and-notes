// tieto1.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "libraryArch.h"

int main(int argc, char** argv)
{
	if (argc < 3) {
		cout << "Directory Path and Platform information is required to search for files, \
			Refer to readme document for format" << endl;
		exit(-1);
	}
	
	fileSystemParser *fs;
	if (strcmp(argv[2], "Windows") == 0)
	{
		fs = new Windows(argv[1]);
	}
	else
	{
		//For all other platforms, we can use if-else condition to make
		// fileParser point to proper Derived class, based upon input
	}

	fs->listDir(argv[1]);
	fs->output();
	delete fs;
	return 0;
}