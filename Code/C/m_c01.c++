#include <iostream>
using namespace std;
class c{
    public :
    void print(){
        cout<<"C proramming"<<endl;

    }
};
class cpp : public c{
    public: 
    void print (){
        cout<<"cpp programming"<<endl;
    }
};

int main()
{
    c *a1 =new c();
    c *b1= new cpp();
     
     a1->print();
     b1->print();


    
}