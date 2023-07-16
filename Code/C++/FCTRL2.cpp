

#include <bits/stdc++.h>

#include <iostream>
using namespace std;


int main() {
	
	int a;
	cin>>a;
	for(int i =0;i<a;i++)
	{
	    int n;
	    cin>>n;
	    int factorials=1;
	    for(int i=n;i>0;i--)
	    factorials=factorials*i;
	    cout<<factorials<<endl; 
	}
	
	return 0;
}




