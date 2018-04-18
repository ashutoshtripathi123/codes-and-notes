#include<iostream>
using namespace std;

class Calc
{
	private:
		int data;
	public:
		Calc()
		{
			data=1;
		}
		
		Calc& add(int ip)
		{
			data+=ip;
			return *this;
		}
		
		Calc& mul(int ip)
		{
			this->data*=ip; //no need to use this here, I've just simply put it
			return *this;			
		}
		
		void print()
		{
			cout<<"data="<<data<<endl;
		}
};

int main()
{
	Calc c1;
	//c1.add(5) basically gets translated internally to add(Calc &c1, int ), thats why i am able to return Calc& from the function
	c1.add(2).mul(5);//this type of chaining is possible only because I am using a this pointer while returning
	c1.print();
	return 0;
}
