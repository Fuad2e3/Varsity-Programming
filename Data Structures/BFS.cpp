#include <iostream>
using namespace std;

int main()
{
    int vertices, edges, i, j, k, v, visited[5]={0,0,0,0,0};
    int visiting[5]={0,0,0,0,0};
    int Queue[5], Rear=0, Front=0;
    cout<<"Enter the number of vertices: ";
    cin>>vertices;

    int Graph[vertices+1][vertices+1] ={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    cout<<"\nEnter the number of edges: ";
    cin>>edges;

    for(k=1; k<=edges; k++)
    {
        cin>>i>>j;
        Graph[i][j] = 1;
    }

    for(i=1; i<=vertices; i++)
    {
        for(j=1; j<=vertices; j++)
        {
            cout<<Graph[i][j]<<" ";
        }
        cout<<endl;
    }

    cout<<"\nEnter the starting vertex: ";
    cin>>v;
    cout<<"\nDFS Visiting ORDER: "<<v<<" ";

    visited [v] = 1;
    int step=1;

    while(step<vertices)
    {
        for(j=1; j<=vertices; j++)
        {
            if(Graph[v][j]==1 && visited[j]==0 && visiting[j]==0)
            {
                visiting [j] = 1;
                Queue[Rear] = j;
                Rear++;
            }
        }
        v = Queue[Front++];
        cout<<v<<" ";
        visited[v] = 1;
        visiting[v] = 0;
        step++;
    }
}
