#include<iostream>
using namespace std;
 
int main()
{
int i,s_it,size,location=1;
cout<<"Enter array size";
cin>>size;
 
int a[size];
 
srand(time(0));
for(int i=0; i<size; i++){
a[i]=rand()%50;
}
 
for(int i=0; i<size; i++){
cout<<a[i]<<" ";
}
cin>>s_it;
while(a[location] !=s_it  && location<=size )
location++;
if(location==size+1)
cout<<"Not found";
else
cout<<location<<"is the location of the item"<<s_it;
cout<<endl;
 
}
 
