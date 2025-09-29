#include <iostream>
using namespace std;
#define MAXSIZE 5

int Queue[MAXSIZE], Rear=-1, Front=-1, ITEM;
void enQueue()
{
    if(Rear==MAXSIZE-1)
        cout<<"Queue is Full!! OVERFLOW";
    else
    {
        if(Front==-1)
            Front = 0;
        cout<<"\nEnter the value to be insert: ";
        cin>>ITEM;
        Rear = Rear+1;
        cout<<"\n##Position: "<<Rear<<", Inserted Value: "<<ITEM;
        Queue[Rear] = ITEM;
    }
}
void deQueue()
{
    if(Front==-1 || Front>Rear)
        cout<<"Queue is Empty!!UNDERFLOW";
    else
    {
        cout<<"\n##Position: "<<Front<<", Deleted Value: "<<Queue[Front];
        Front=Front+1;
    }
}
void Display()
{
    if(Front==-1 || Front>Rear)
        cout<<"Queue is Empty";
    else
    {
        cout<<"Queue elements are: ";
        for(int i=Front; i<=Rear; i++)
            cout<<Queue[i]<<" ";
    }
}
int main()
{
    int choice;
    while(1)
    {
      cout<<"\n\n**Queue Main Menu**";
      cout<<"\n1 enQueue\n2 deQueue\n3 Display\n4 Exit";
      cout<<"\nEnter you choice: ";
      cin>>choice;
      switch(choice)
      {
      case 1:
        enQueue();
        break;
      case 2:
        deQueue();
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
