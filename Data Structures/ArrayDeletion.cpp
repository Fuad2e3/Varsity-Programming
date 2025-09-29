#include <iostream>
using namespace std;
int main()
{
	int Size, i, position, J, value;
	cout<<"Enter the array size: ";
	cin>>Size;
	int Array[Size];
	for(i=1; i<=Size; i++)
		cin>>Array[i];
	cout<<"Array size: "<<Size;
	cout<<"\nArray elements are: ";
	for(i=1; i<=Size; i++)
		cout<<Array[i]<<" ";
	cout<<"\nEnter the position to be inserted: ";
	cin>>position;
	cout<<"Enter the value to be inserted: ";
	cin>>value;
	for(J=Size; J>=position; J--)
		Array[J+1] = Array[J];
	Array[position] = value;
	cout<<"Array size: "<<Size+1;
	cout<<"\nArray elements are: ";
	for(i=1; i<=Size+1; i++)
		cout<<Array[i]<<" ";
	cout<<endl;
}