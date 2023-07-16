#include <iostream>

using namespace std;

int main()
{
   int a;
   cin>>a;
   for(int i=0; i<a;i++ )
   {
       int x,y;
       cin>>x>>y;
       if(x<y){
           cout<<"FIRST"<<endl;
       }
       
       else if (x>y){
           cout<<"SECOND"<<endl;
       }
       else if(x=y){
           cout<<"ANY"<<endl;
       }
       
   }

    return 0;
}