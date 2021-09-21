#include <iostream>
#include <thread>
using namespace std;

//Normal Function
void normalFunc(int num)
{
    while(num--)
    {
        cout<<"Normal function as thread"<<endl;
        //sleep(1);
    }
}

//Using function objects
class thread_obj {
public:
    void operator()(int x)
    {
        for (int i = 0; i < x; i++)
            cout << "Thread using function"
                  " object as  callable\n";
    }
};

int main()
{
    cout<<"hello world"<<endl;

    // Define a Lambda Expression
    auto f = [](int x) {
        for (int i = 0; i < x; i++)
            cout << "Thread using lambda"
             " expression as callable\n";
    };

    thread t1(normalFunc, 3);
    thread t2(thread_obj(), 3);
    thread t3(f, 3);
    cout<<"Let's wait for the thread to finish"<<endl;
    t1.join();
    t2.join();
    t3.join();
    return 0;
}
