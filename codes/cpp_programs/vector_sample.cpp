#include <iostream>
#include <vector>    // for vector
#include <algorithm> // for lower_bound, upper_bound and sort
using namespace std;

/*
Iterators::
1. begin() – Returns an iterator pointing to the first element in the vector
2. end() – Returns an iterator pointing to the theoretical element that follows last element in the vector
3. rbegin() – Returns a reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element
4. rend() – Returns a reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end)

Capacity::
1. size() – Returns the number of elements in the vector
2. max_size() – Returns the maximum number of elements that the vector can hold, something like 4611686018427387903
3. capacity() – Returns the size of the storage space currently allocated to the vector expressed as number of elements
4. resize(size_type g) – Resizes the container so that it contains ‘g’ elements
5. empty() – Returns whether the container is empty
6. reserve(n) - If i am sure that i will need to store 'n'  elements then its better to reserve it
Difference between resize and reserve - resize can be used to increase or decrease the vector,
                                        reserve can be used to allocate defined space right at the beginning 

Modifiers::
1.1 assign(input_iterator first, input_iterator last) – Assigns new content to vector and resize
1.2 assign(size_type n, const value_type g) – Assigns new content to vector and resize
2. push_back(const value_type g) – Adds a new element ‘g’ at the end of the vector and increases the vector container size by 1
3. pop_back() – Removes the element at the end of the vector, i.e., the last element and decreases the vector container size by 1
4.1 insert(const_iterator q, const value_type g) – Adds element ‘g’ before the element referenced by iterator ‘q’ and returns an 
    iterator that points to the newly added element
4.2 insert(const_iterator q, size_type n, const value_type g) – Adds ‘n’ elements each with value ‘g’ before the element currently 
    referenced by iterator ‘q’ and returns an iterator that points to the first of the newly added elements
4.3 insert(const_iterator q, InputIterator first, InputIterator last) – Adds a range of elements starting from first to last, 
    the elements being inserted after the position currently referred by ‘q’
5.1 erase(const_iterator q) – Deletes the element referred by ‘q’ and returns an iterator to the element followed by the deleted element
5.2 erase(const_iterator first, const_iterator last) – Deletes the elements in the range first to last, with the first iterator included 
    in the range and the last iterator not included, and returns an iterator to the element followed by the last deleted element
6. swap(vector q, vector r) – Swaps the contents of ‘q’ and ‘r’
7. clear() – Removes all elements from the vector
*/

int main()
{
	vector<int> g1;

	vector<int>:: iterator i;
	vector<int>:: reverse_iterator ir;
    for (int i = 1; i <= 5; i++)
        g1.push_back(i);

    cout << "Output of begin and end:";
    for (i = g1.begin(); i != g1.end(); ++i)
        cout << *i << '\t';
        
    cout<<endl<<"Another way to parse the vector:"<<endl;
    for(int i=0;i<g1.size();i++)
    {
    	cout<<g1[i]<<'\t';
	}
 
    cout << endl << endl;
    cout << "Output of rbegin and rend:";
    for (ir = g1.rbegin(); ir != g1.rend(); ++ir)
    	cout  << *ir<<'\t';
        
    cout << "\n Size : " << g1.size();
    cout << "\nCapacity : " << g1.capacity();
    cout << "\nMax_Size : " << g1.max_size();  
	cout << "\nReference operator [g] : g1[2] = " << g1[2];
    cout << endl;
    cout << "at : g1.at(4) = " << g1.at(4);
    cout << endl;
    cout << "front() : g1.front() = " << g1.front();
    cout << endl;
    cout << "back() : g1.back() = " << g1.back();
    cout << endl;

    //-------------- Assign operation -----------------------	  
    g1.assign(5, 10);   // 5 elements with value 10 each
    vector <int> g2;
    vector <int> g3;
    i = g1.begin()+1;
    g2.assign(i, g1.end() -1);
    int quiz[] = {1,2};
    g3.assign(quiz,quiz+2);
    cout <<"g2 size = " <<g2.size() << endl;
    cout <<"g3 size = " <<g3.size() << endl;
    
    //------------ upper and lower bound --------------------
    int gfg[] = {5,6,7,7,6,5,5,6}; 
    vector<int> v(gfg,gfg+8);    // 5 6 7 7 6 5 5 6
    sort (v.begin(), v.end());  // 5 5 5 6 6 6 7 7
    vector<int>::iterator lower,upper;
    lower = lower_bound (v.begin(), v.end(), 6); 
    upper = upper_bound (v.begin(), v.end(), 6); 
    cout << "lower_bound for 6 at position " << (lower- v.begin()) << '\n';
    cout << "upper_bound for 6 at position " << (upper - v.begin()) << '\n';
     
    return 0;	 
}
