#include <iostream>
using namespace std;

class base{
    public:
    void fun1(){
        cout<<"1";
    }
    virtual void fun2(){
        cout<<"3";
    }

};
class derived : public base{
    public:
    virtual void fun1(){
        cout<<"2";
    }
     void fun2(){
        cout<<"4";
    }

};

int main()
{
    base *b1= new derived();
    b1->fun1();
    b1->fun2();

 return 0;   
}