#include<iostream>
#include<set>
#include<iterator>
/*in set each element is unique because that element identifies itself.
The value of the element once inserted in set, cannot be modified*/
using namespace std;
int main()
{
	set<int,greater<int>>gquiz1;//For storing elements in set in descending order
	set<int>gquiz2; //Bydefault elements are stored in ascending order in set
	set<int>::iterator ir;
	gquiz2.insert(1);
	gquiz2.insert(2);
	gquiz2.insert(3);
	gquiz2.insert(16);
	gquiz2.insert(15);
	gquiz2.insert(14);
	cout<<"Element in gquiz2 are:"<<endl;
	for(ir=gquiz2.begin(); ir!= gquiz2.end(); ir++)
	{
		cout<<*ir<<endl;
	}

	/*lower_bound and upper_bound are interesting concepts*/
	auto it = gquiz2.lower_bound(10);
	if (it != gquiz2.end())
		cout<<"gquiz2.lower_bound(10) is "<<*it<<endl;

	it = gquiz2.upper_bound(14);
	if (it != gquiz2.end())
		cout<<"gquiz2.upper_bound(14) is "<<*it<<endl;
}








