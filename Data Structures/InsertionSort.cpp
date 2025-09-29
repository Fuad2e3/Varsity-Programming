#include <iostream>
using namespace std;

int selectionSort(int A[], int Size)
{
	int step, compare, key_value;
	for(step = 2; step<=Size; step++)
	{
		key_value= A[step];
		compare = step-1;
		while(compare>=1 && A[compare]>key_value)
		{
			A[compare+1] = A[compare];
			compare--;
		}
		A[compare+1] = key_value;
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