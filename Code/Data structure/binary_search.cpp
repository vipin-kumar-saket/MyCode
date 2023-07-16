#include <iostream>
using namespace std;

int binarysearch(int arr[],int size,int key)
{
    int start=0;
    int end=size-1;
    int mid=end-(end -start)/2;
    while(start<=end)
    {
        if(arr[mid]==key)
        {
            return mid;
        }
        if(arr[mid]<key)
        {
            start=mid+1;

        }
        else{
            end=mid-1;
        }
        int mid=end-(end -start)/2;
    }
    return -1;
}
int main()
{
    int arr[10]={5,8,9,11,19,20,33,45,68,98};
    int index=binarysearch(arr,10,20);
    cout<<"index is "<<index<<endl;

}