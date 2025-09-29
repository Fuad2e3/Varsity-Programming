#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
}*head = NULL;

void insertAtBegining(int value)
{
    struct Node *newNode;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    if(head==NULL)
    {
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        newNode->next = head;
        head = newNode;
    }
    cout<<"Node "<<value<< " is inserted at begining";
}

void insertAtEnd(int value)
{
    struct Node *newNode;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    if(head==NULL)
    {
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        newNode->next = NULL;
        struct Node *temp = head;
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
    }
    cout<<"Node "<<value<<" is inserted at End";
}

void deleteAtBegining()
{
    if(head==NULL)
        cout<<"Linked List Emplty";
    else
    {
        struct Node *temp = head;
        head = head->next;
        cout<<"Node "<<temp->data<<" is deleted from Begining";
        free(temp);
    }
}

void deleteAtEnd()
{
    struct Node *prev = NULL;
    struct Node *temp = head;
    while(temp->next != NULL)
    {
        prev = temp;
        temp = temp->next;
    }
    prev->next = NULL;
    cout<<"Node "<<temp->data<<" is deleted from End";
    free(temp);
}

void display()
{
    if(head==NULL)
        cout<<"Linked List is Empty";
    else
    {
        struct Node *temp = head;
        cout<<"\nLinked List elements are: ";
        cout<<"Head-->";
        while(temp->next != NULL)
        {
            cout<<temp->data<<"-->";
            temp = temp->next;
        }
        cout<<temp->data<<"--NULL\n";
    }
}

int main()
{
    int choice1, value, choice2;
    while(1)
    {
        mainMenu:
        cout<<"\n***LINKED LIST MAIN MENU***";
        cout<<"\n1. INSERT\n2. DELETE\n3. DISPLAY\n4. Exit\n";
        cout<<"Enter your choice: ";
        cin>>choice1;
        switch(choice1)
        {
        case 1:
            cout<<"Enter the value to be INSERT: ";
            cin>>value;
            while(1)
            {
                cout<<"\nWhere you want to INSERT: \n1. At the begining\n2. At the End";
                cout<<"\nEnter your choice: ";
                cin>>choice2;
                switch(choice2)
                {
                case 1:
                    insertAtBegining(value);
                    break;
                case 2:
                    insertAtEnd(value);
                    break;
                default:
                    cout<<"\nWrong Choice!! Try Again";
                goto mainMenu;
                }
                goto mainMenu;
            }
            break;
        case 2:
            while(1)
            {
                cout<<"\nFrom where you want to delete: ";
                cout<<"\n1. From Begining\n2. From End";
                cout<<"\nEnter your choice: ";
                cin>>choice2;
                switch(choice2)
                {
                    case 1:
                        deleteAtBegining();
                        break;
                    case 2:
                        deleteAtEnd();
                        break;
                    default:
                        cout<<"\nWrong Choice!! Try Again";
                        goto mainMenu;
                }
                goto mainMenu;
            }
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
            break;
        default:
            cout<<"\Wrong Choice!! Try Again\n\n";
        }
    }
}
