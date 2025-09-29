#include <iostream>
using namespace std;

int main()
{
	int Size, i, S_ITEM, location=1;
	cout<<"Enter the array size: ";
	cin>>Size;
	int A[Size];
	srand(time(0));
	for(i=1; i<=Size; i++)
		A[i] = rand()%50;
	
	cout<<"Array elements are: ";
	for(i=1; i<=Size; i++)
		cout<<A[i]<<" ";
	
	cout<<"\nEnter your search ITEM: ";
	cin>>S_ITEM;
	
	while(A[location] != S_ITEM && location<=Size)
		location = location+1;
	
	if(location == Size+1)
		cout<<"Data not found";
	else
		cout<<location<<" is the location of item "<<S_ITEM;
	cout<<endl;
}