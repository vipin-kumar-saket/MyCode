#include <iostream>
using namespace std;

class Hero
{

    private:

    int health;

    public:
    char lavel;

    int getHealth()
    {
        return health;
    }
    char getlavel()
    {
        return lavel;
    }

    void setHelth(int h)
    { 
        health=h;
    }
    void setLavel(char ch)
    {
        lavel=ch;
    }


};
int main()
{
    Hero vipin;
    vipin.setHelth(70);
    vipin.setLavel('a');
    cout<<"vipin health is:"<<vipin.getHealth()<<endl;
    cout<<"vipin lavel is:"<<vipin.getlavel()<<endl;


    
}