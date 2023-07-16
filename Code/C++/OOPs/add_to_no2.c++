#include <iostream>
using namespace std;

class num
{
    int a,b;
    public:
    void get();
    void add();
    void show();
};
void num::get()
{
    cout<<"Enter 2 number:";
    cin>>a>>b;
};
void num::add()
{
    int c;
    c=a+b;
    show(c);
};
void num::show(int s)
{
    cout<<"The addition is:"<<s <<endl;
};

int main()
{
    num obj;
    obj.get();
    obj.add();
    return 0;

}