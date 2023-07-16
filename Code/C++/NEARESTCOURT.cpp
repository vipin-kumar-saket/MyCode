#include <iostream>

using namespace std;

int main()
{
   int a;
   cin>>a;
   for(int i=0; i<a;i++ )
   {
       
      	int x, y, z,a,b;
		cin >> x >> y;

		
		
			z = (x + y) / 2;
			
			a = max(abs(x - z), abs(y - z));

			cout << a << endl;
   }

    return 0;
}