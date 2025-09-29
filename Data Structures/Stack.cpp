#include <iostream>
using namespace std;
#define MAXSIZE 5
int Stack[MAXSIZE], TOP=0, ITEM;
void PUSH()
{
    if(TOP==MAXSIZE)
        cout<<"Stack is Full!! OVERFLOW";
    else
    {
        cout<<"\nEnter the value to be PUSHED: ";
        cin>>ITEM;
        cout<<"\n##Position: "<<TOP<<", Pushed Value: "<<ITEM;
        Stack[TOP++] = ITEM;
    }
}
void POP()
{
    if(TOP==0)
        cout<<"Stack is Empty!!UNDERFLOW";
    else
    {
        TOP--;
        cout<<"\n##Position: "<<TOP<<", Popped Value: "<<Stack[TOP];
    }
}
void Display()
{
    if(TOP==0)
        cout<<"Stack is Empty";
    else
    {
        for(int i=TOP-1; i>=0; i--)
            cout<<"\n##Position: "<<i<<", Value: "<<Stack[i];
    }
}
int main()
{
    int choice;
    while(1)
    {
      cout<<"\n\n**STACK Main Menu**";
      cout<<"\n1 PUSH\n2 POP\n3 Display\n4 Exit";
      cout<<"\nEnter you choice: ";
      cin>>choice;
      switch(choice)
      {
      case 1:
        PUSH();
        break;
      case 2:
        POP();
        break;
      case 3:
        Display();
        break;
      case 4:
        exit(0);
        break;
      default:
        cout<<"Wrong choice!!Try Again";
      }
    }

}
