/*Smart pointers take care of the case such that if you forget to do clean up after doing memory allocation,
then smart pointers will take care of cleaning it up. This code has been taken from learncpp*/
#include <iostream>
using namespace std; 
template<class T>
class Auto_ptr1
{
	T* m_ptr;
public:
	// Pass in a pointer to "own" via the constructor
	Auto_ptr1(T* ptr='\0')
		:m_ptr(ptr)
	{
		cout<<"Inside Constructor of Auto_ptr1"<<endl;
	}
	
	// The destructor will make sure it gets deallocated
	~Auto_ptr1()
	{
		cout<<"Inside Destructor of Auto_ptr1"<<endl;
		delete m_ptr;
	}
 
	// Overload dereference and operator-> so we can use Auto_ptr1 like m_ptr.
	T& operator*() const { return *m_ptr; }
	T* operator->() const { return m_ptr; }
};
 
// A sample class to prove the above works
class Resource
{
public:
    Resource() { std::cout << "Resource acquired\n"; }
    ~Resource() { std::cout << "Resource destroyed\n"; }
};
 
int main()
{
	Auto_ptr1<Resource> res(new Resource); // Note the allocation of memory here
 
        // ... but no explicit delete needed
 
	// Also note that the Resource in angled braces doesn't need a * symbol, since that's supplied by the template
 
	return 0;
} // res goes out of scope here, and destroys the allocated Resource for us
