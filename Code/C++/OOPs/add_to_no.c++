#include <iostream>
using namespace std;
class student
{
int a,b,c;
public:
    void get();
    void add();
    void show();
};

 void student::get()
{
    cout<<"Enter 2 number:";
    cin>>a>>b;
}

void student::add()
{
    c=a+b;
}
void student::show()
{
    cout<<"The addition is :"<<c<<endl;
}

int main()
{
    student s;
    s.get();
    s.add();
    s.show();
    return 0;
    
}