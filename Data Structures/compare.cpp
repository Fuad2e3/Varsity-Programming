#include <iostream>
using namespace std; 
int main()
{
	int number1, number2, number3;
	cout<<"Enter a number: ";
	cin>>number1;
	cout<<"Enter another number: ";
	cin>>number2;
	cout<<"Enter another number: ";
	cin>>number3;
	if(number1>number2 && number1>number3)
		cout<<"a is maximum";
	else if(number2>number3)
		cout<<"b is maximum";
	else 
		cout<<"c is maximum";
}