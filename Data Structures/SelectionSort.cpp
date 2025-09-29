#include <iostream>
using namespace std;

int selectionSort(int A[], int Size)
{
	int step, compare, smalles_index;
	for(step = 1; step<=Size-1; step++)
	{
		smalles_index = step;
		for(compare=step+1; compare<=Size; compare++)
		{
			if(A[compare]<A[smalles_index])
				smalles_index = compare;
		}
		swap(A[step], A[smalles_index]);
		
}
return 0;
}

int main()
{
	int Size, i;
	cout<<"Enter the array size: ";
	cin>>Size;
	int A[Size];
	srand(time(0));
	for(i=1; i<=Size; i++)
		A[i] = rand()%50;
	
	cout<<"Array elements are: ";
	for(i=1; i<=Size; i++)
		cout<<A[i]<<" ";
	cout<<endl;

	selectionSort(A, Size);
	
	cout<<"Array elements after sorting: ";
	for(i=1; i<=Size; i++)
		cout<<A[i]<<" ";
	cout<<endl;
}