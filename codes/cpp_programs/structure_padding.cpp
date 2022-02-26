#include <iostream>

using namespace std;
// if we execute this program on onlinegdb.com, the sizeof(element2) is printed as 5, but not in case of devc++
// #pragma pack(1) method 1 to avoid structure padding 

typedef struct
{
    char c;
    int i;
}element1;

typedef struct element2
{
    char c;
    int i;
}__attribute__((packed)); //method 2 to avoid structure padding


int main()
{
 
    cout<<"Sizeof element1 = "<<sizeof(element1)<<endl;
    cout<<"Sizeof element2 = "<<sizeof(element2)<<endl;
    return 0;
}
