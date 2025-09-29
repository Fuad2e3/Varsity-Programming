#include <iostream>

using namespace std;

int main()
{
	int vertices, i, j, v, Min, a, b, minCost = 0;
	cout<<"Enter the number of vertices: ";
	cin>>vertices;
	int visited[vertices+1] = {0};
	int weight[vertices+1][vertices+1] = {0};
	
	cout<<"Enter the weighted matrix: \n";
	for(i=1; i<=vertices; i++)
	{
		for(j=1; j<=vertices; j++)
		{
			cin>>weight[i][j];
			if(weight[i][j]==0)
				weight[i][j]=100;
		}
	}	
	
	for(i=1; i<=vertices; i++)
	{
		for(j=1; j<=vertices; j++)
		{
			cout<<weight[i][j]<<" ";
		}
		cout<<endl;
	}	
	
	cout<<"Enter the starting vertex: ";
	cin>>v;
	visited[v] =1;
	int step =1;
	
	while(step<=vertices)
	{
		Min = 100;
	
	for(i=1; i<=vertices; i++)
	{
		for(j=1; j<=vertices; j++)
		{
			if(weight[i][j]<Min)
			{
				if(visited[i]==1)
				{
					Min = weight[i][j];
					a = i;
					b = j;
				}
			}
		}
	}
		if(visited[a]==0 || visited[b]==0)
		{
			cout<<"\nEdge: ("<<a<<", "<<b<<") = "<<Min;
			minCost = minCost+Min;
		}
		weight[a][b] = weight[b][a] = 100;
		visited[b] =1;
		step++;
	}
	cout<<"\nMST cost = "<<minCost<<endl;
}