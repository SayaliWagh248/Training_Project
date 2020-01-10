package GraphDemo;

public class GraphAdjacencyMatrix {
    int vertex;
    int matrix[][];

    GraphAdjacencyMatrix(int vertex)
    {
        this.vertex=vertex;
        matrix=new int[vertex][vertex];
    }

    public void connectEdge(int source,int destination)
    {
        //for Connecting edge of directed graph
        matrix[source][destination]=1;

        //for connecting edge of undirected graph
        matrix[destination][source]=1;

    }

    public void printGraph()
    {
        System.out.println("---------------Graph representation using Adjacency matrix--------------");
        for (int i=0;i<vertex;i++)
        {
            for (int j=0;j<vertex;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<vertex;i++)
        {
            System.out.print("\n The vertex "+i+" is connected to ");

            for(int j=0;j<vertex;j++)
            {
                if(matrix[i][j]==1)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        GraphAdjacencyMatrix GAM=new GraphAdjacencyMatrix(6);

        GAM.connectEdge(0,3);
        GAM.connectEdge(0,5);
        GAM.connectEdge(1,2);
        GAM.connectEdge(2,2);
        GAM.connectEdge(2,4);
        GAM.connectEdge(3,5);
        GAM.connectEdge(4,1);
        GAM.connectEdge(4,3);
        GAM.connectEdge(5,3);

        GAM.printGraph();
    }

}
