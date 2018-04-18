#include<iostream>
using namespace std;

class Point{
	private:
		double m_x, m_y, m_z;
	public:
		Point(double x=0, double y=0, double z=0):
			m_x(x),m_y(y),m_z(z)
			{
			}
		//special attention to the return type of the friend function, its return by reference and not value
		//its because ostream specifically disallows being copied	
		friend ostream& operator<<(ostream &out, Point &p1); //cout is an object of ostream
		friend istream& operator>>(istream &in, Point &p1);//cin is the object of istream
};

ostream& operator<<(ostream&out, Point &p1)
{
	out<<p1.m_x<<" "<<p1.m_y<<" "<<p1.m_z<<endl; //instead of out, I can even use cout
}

istream& operator>>(istream &in, Point &p1)
{
	in>>p1.m_x;
	in>>p1.m_y;
	in>>p1.m_z;
}

int main()
{
	Point p1=Point(1,2,3);
	cout<<p1<<endl;
	Point p2;
	cin>>p2;
	cout<<p2;
	return 0;
}
