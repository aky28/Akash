package tree;

import java.util.LinkedList;

public class Graph {
   int v;
   LinkedList<Integer> adj[];
   int visited[];
   Graph(int n)
   {
	   v=n;
	   adj=new LinkedList[v];
	   visited=new int[n];
	   for(int i=0;i<adj.length;i++)
		   adj[i]=new LinkedList<Integer>();
	   for(int i=0;i<n;i++)
		   visited[i]=0;
   }
   
   public void add(int i,int j)
   {
	   adj[i].add(j);
	   adj[j].add(i);
   }
   
   public void display(int source)
   {
	   visited[source]=1;
	   System.out.println(source+" ");
	   for(int i=0;i<adj[source].size();i++)
	   {
		   if(visited[adj[source].get(i)]==0)
			   display(adj[source].get(i));
	   }
   }
}
