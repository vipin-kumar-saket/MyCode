#include <bits/stdc++.h>

using namespace std;

int main()
{
   int a;
   cin>>a;
   for(int i=0;i<a;i++)
   {
       int x,y,z;
       long long sum=0;
       cin>>x>>y>>z;
       int a,b;
       if(z%y==0){
           int t=z/y;
           if(t>x)t=x;
           for(int j=0; j<t; j++){
               sum+=(pow(y,2));
           }
       }
       else{
           int t = z/y;
           if(t>x)t=x;
           int rem = z%y;
           for(int j=0; j<t; j++){
               sum+=(pow(y,2));
           }
           sum+=pow(rem,2);
       }
       cout<<sum<<endl;
   }

    return 0;
}