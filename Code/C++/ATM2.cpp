#include <iostream>
using namespace std;

int main() {
    int a;
    cin >> a;
    for(int i=0; i<a;i++)
    {
        int n,k;
        cin >>n>>k;
        for(int i=0;i<n;i++){
            int p;
            cin>>p;
            if(p>k){
                cout<<'0';
            }
            else{
                k=k-p;
                cout<<'1';
            }
        }
        cout<<endl;
    }
	return 0;
}
