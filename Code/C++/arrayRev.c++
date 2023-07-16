#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int a, b;

    string num1[99] = 
    { "zero","one","two","three","four","five","six","seven","eight","nine"};

    string num2[] = { "even", "odd" };
    string num3[99] = { "nine" };

    cin >> a;
    cin >> b;
    int c=a,d=b;
    
    for(int i=0;i<10;i++)
    {
        if(i==a)                cout<<num1[i]<<endl;
        

         if(i==b)           cout<<num1[i]<<endl;
         if (a>9&&b>9)      cout<<num3<<endl;

        

        

    }

    // if(c%2==0)  cout<<"even"<<endl;
    // else        cout<<"odd1"<<endl;
    // if(d%2==0)  cout<<"even"<<endl;
    // else        cout<<"odd"<<endl;
    


return 0;
}
