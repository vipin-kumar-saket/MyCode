#include<iostream> 
#include<math.h>
using namespace std; 
int main () 
{  
float a,b,PI ,in,cm,m,p;
p=3.14; 
int c,decimalNum, binaryNum[50],rem,octalNum[50], i=0;
char hexaDecimalNum[50];
cout<<endl; 
cout<<"********//V.I.P.//*********** Calculator ********//V.I.P//**********\n"; 
cout<<"1:  Division"<<endl; 
cout<<"2:  Multiplication"<<endl; 
cout<<"3:  Subtraction"<<endl; 
cout<<"4:  Addition"<<endl;
cout<<"5:  Remainder"<<endl; 
cout<<"6:  Exponent"<<endl; 
cout<<"7:  Square root"<<endl;
cout<<"8:  Sin"<<endl;
cout<<"9:  Cos"<<endl;
cout<<"10: Tan"<<endl;
cout<<"11: Inverse of Sin"<<endl;
cout<<"12: Inverse of Cos"<<endl;
cout<<"13: Inverse of Tan"<<endl;
cout<<"14: Log With base e "<<endl;
cout<<"15: Log with base 10 "<<endl;
cout<<"16: Decimal to binary"<<endl;
cout<<"17: Decimal to Hexadecimal"<<endl;
cout<<"18: Decimal to OctalNumber"<<endl;
cout<<"19: Inches into centimeters"<<endl;
cout<<"20: Centimeters into Meters"<<endl;
cout<<"21: Meters into Kilometer"<<endl;
cout<<"22: SImpleinterest"<<endl;
cout<<"23: Area of circle"<<endl;
cout<<"24: Area of rectangle"<<endl;
cout<<"\nEnter the function that you want to perform : "; 
cin>>c; 
PI=3.14159265; 
switch(c) 
{ 
case 1: 
cout<<"Enter 1st number : "; 
cin>>a; 
cout<<"Enter 2nd number : "; 
cin>>b; 
cout<<"Division = "<<a/b<<endl; 
break; 
case 2: 
cout<<"Enter 1st number : "; 
cin>>a; 
cout<<"Enter 2nd number : "; 
cin>>b; 
cout<<"Multiplication = "<<a*b<<endl; 
break; 
case 3: 
cout<<"Enter 1st number : "; 
cin>>a; 
cout<<"Enter 2nd number : "; 
cin>>b; 
cout<<"Subtraction = "<<a-b<<endl; 
break; 
case 4: 
cout<<"Enter 1st number : "; 
cin>>a; 
cout<<"Enter 2nd number : "; 
cin>>b; 
cout<<"Addition = "<<a+b<<endl; 
break;
case 5: 
cout<<"Enter 1st number : "; 
cin>>c; 
cout<<"Enter 2nd number : "; 
cin>>rem; 
cout<<"Remainder = "<<(c%rem)<<endl; 
break;
case 6: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Enter the exponent : "; 
cin>>b; 
cout<<"Exponent = "<<pow(a,b)<<endl; 
break; 
case 7: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Square Root = "<<sqrt(a)<<endl; 
break; 
case 8: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Sin = "<<sin(a*PI/180) <<endl; 
break; 
case 9: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Cos = "<<cos(a*PI/180)<<endl; 
break; 
case 10: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Tan = "<<tan(a*PI/180)<<endl; 
break; 
case 11: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Inverse of Sin = "<<asin(a)*180.0/PI<<endl; 
break; 
case 12: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Inverse of Cos = "<<acos(a)*180.0/PI<<endl; 
break; 
case 13: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Inverse of tan = "<<atan(a)*180.0/PI<<endl; 
break; 
case 14: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Log = "<<log(a)<<endl; 
break; 
case 15: 
cout<<"Enter the number : "; 
cin>>a; 
cout<<"Log with base 10 = "<<log10(a)<<endl; 
break; 

case 16:
cout<<"Enter the Decimal Number : "; 
cin>>decimalNum; 

while(decimalNum!=0)
    {
        binaryNum[i] = decimalNum%2;
        i++;
        decimalNum = decimalNum/2;
    }
    cout<<"\nEquivalent Binary Value is: ";
for(i=(i-1); i>=0; i--)
        cout<<binaryNum[i];
    cout<<endl;
 break;
    
case 17:
cout<<"Enter the Decimal Number : ";
cin>>decimalNum;
    while(decimalNum!=0)
    {
        rem = decimalNum%16;
    if(rem<10)
            rem = rem+48;
    else
            rem = rem+55;
        hexaDecimalNum[i] = rem;
        i++;
        decimalNum = decimalNum/16;
    }
    cout<<"\nEquivalent Hexadecimal Value is: ";
    for(i=i-1; i>=0; i--)
        cout<<hexaDecimalNum[i];
        cout<<endl;
    break;
case 18:
cout<<"Enter the Decimal Number : ";
cin>>decimalNum; 
    while(decimalNum != 0)
    {
        octalNum[i] = decimalNum%8;
        i++;
        decimalNum = decimalNum/8;
    }
        cout<<"\nEquivalent Octal Value is = ";
    for(i=(i-1); i>=0; i--)
        cout<<octalNum[i];
        cout<<endl;
    break;
    
case 19: 
cout<<"Enter the number ( In inches) : "; 
cin>>in; 
cout<<"Centimeter is =  "<<in*2.54<<endl; 
break;

case 20: 
cout<<"Enter the number ( In Centimeter) : "; 
cin>>cm; 
cout<<"Meter is = "<<cm/100.0<<endl; 
break;

case 21: 
cout<<"Enter the number ( In Meter) : "; 
cin>>m; 
cout<<"kilometer is = "<<m/1000.0<<endl; 
break;

case 22: 
cout<<"Enter the Principal amount : "; 
cin>>a; 
cout<<"Enter rate in % : "; 
cin>>b; 
cout<<"Enter the time in year : ";
cin>>m;
cout<<"Multiplication = "<<(a*b*m)/100<<endl; 
break;
case 23: 
cout<<"Enter the Radius : "; 
cin>>a; 
cout<<"Area of circle is = "<<a*a*p<<endl; 
break;
case 24: 
cout<<"Enter Length of rectangle : "; 
cin>>a; 
cout<<"Enter Width of rectangle : "; 
cin>>b; 
cout<<"Multiplication = "<<a*b<<endl; 
break;
default: 
cout<<"Wrong Input"<<endl; 
} 
}