#include <iostream>
using namespace std;
int main()
{
    int n,d;
    cout<<"Enter totle amount in ₹: "<<endl;
    cin>>n;
    cout<<"Enter a you give dicount in %:";
    cin>>d;
    int dis=(n*d)/ 100;
    int totel=n-dis;
    cout<<"The discount of totle amount is:"<<totel<<endl;
}