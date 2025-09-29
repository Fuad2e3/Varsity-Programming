#include <iostream>
using namespace std;

struct Node{
int data;
struct Node *left, *right;
};

Node *newNode (int data)
{
    Node *temp = new Node;
    temp->data = data;
    temp->left = temp->right = NULL;
    return temp;
}

void preOrder( struct Node *node)
{
    if(node==NULL)
        return;
    cout<<node->data<<" ";
    preOrder(node->left);
    preOrder(node->right);
}

void inOrder( struct Node *node)
{
    if(node==NULL)
        return;
    inOrder(node->left);
    cout<<node->data<<" ";
    inOrder(node->right);
}

void postOrder( struct Node *node)
{
    if(node==NULL)
        return;
    postOrder(node->left);
    postOrder(node->right);
    cout<<node->data<<" ";
}
int main()
{
    struct Node* root = newNode(1);
    root->left = newNode(2);
    root->right = newNode(3);
    root->left->left = newNode(4);
    root->right->left = newNode(6);
    cout<<"\nPreOrder Traversal: ";
    preOrder(root);
    cout<<"\nInOrder Traversal: ";
    inOrder(root);
    cout<<"\nPostOrder Traversal: ";
    postOrder(root);
}
