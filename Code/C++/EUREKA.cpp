#include <iostream>
#include <bits/stdc++.h>
#include <cmath>

using namespace std;

int main()
{
    int a;
    cin>>a;
    for(int i=0;i<a;i++)
    {
        int x;
        cin>>x;
        double result = pow((0.143)*x , x);
        cout<<round(result)<<endl;
    }

    return 0;
}