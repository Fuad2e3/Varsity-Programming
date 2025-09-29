#include <iostream>
using namespace std;

int main()
{
	int Size, i, S_ITEM, BEG, END, MID;
	cout<<"Enter the array size: ";
	cin>>Size;
	int A[Size];
	for(i=1; i<=Size; i++)
		cin>>A[i];
	
	cout<<"Array elements are: ";
	for(i=1; i<=Size; i++)
		cout<<A[i]<<" ";
	
	BEG = 1, END = Size;
	MID = (BEG+END)/2;
	cout<<"\nEnter your search ITEM: ";
	cin>>S_ITEM;
	
	while(A[MID] != S_ITEM && BEG<=END)
	{
		if(S_ITEM<A[MID])
				END = MID-1;
		else
				BEG = MID+1;
		MID = (BEG+END)/2;
	}
	
	if(A[MID] == S_ITEM)
		cout<<MID<<" is the location of item "<<S_ITEM;
	else
		cout<<"data not found";
	cout<<endl;
}