package gmit;

public class GraphRunner {
	private Graph graph = new Graph();
	private Vertex galway = new Vertex("Galway");
	
	
	public static void main(String[] args) {
		GraphRunner runner = new GraphRunner();
	}
	
	public GraphRunner(){
		init();
		
		Search s = new GraphSearch(graph, SearchType.DEPTH_FIRST);
		s.search(galway);
	}
	
	private void init(){
		Vertex sligo = new Vertex("Sligo");
		Vertex letterkenny = new Vertex("Letterkenny");
		Vertex belfast = new Vertex("Belfast");
		Vertex drogheda = new Vertex("Drogheda");
		Vertex dublin = new Vertex("Dublin");
		Vertex waterford = new Vertex("Waterford");
		Vertex cork = new Vertex("Cork");
		Vertex tralee = new Vertex("Tralee");
		Vertex limerick = new Vertex("Limerick");
		Vertex 	longford = new Vertex("Longford");
		Vertex athlone = new Vertex("Athlone");
		Vertex kilkenny = new Vertex("Kilkenny");
		Vertex clonmel = new Vertex("Clonmel");		
		
		
		graph.addEdge(galway, sligo);
		graph.addEdge(galway, limerick);
		
		graph.addEdge(sligo, letterkenny);
		graph.addEdge(sligo, longford);
		
		graph.addEdge(letterkenny, belfast);
		
		graph.addEdge(belfast, drogheda);
		
		graph.addEdge(drogheda, dublin);
		
		graph.addEdge(limerick, clonmel);
		graph.addEdge(limerick, tralee);
		
		graph.addEdge(tralee, clonmel);
		graph.addEdge(tralee, cork);
		
		graph.addEdge(cork, waterford);
		
		graph.addEdge(waterford, dublin);
		
		graph.addEdge(longford, drogheda);
		graph.addEdge(longford, athlone);
		
		graph.addEdge(clonmel, athlone);
		
		graph.addEdge(athlone, kilkenny);
		
		graph.addEdge(kilkenny, dublin);
		graph.addEdge(kilkenny, waterford);
		
	}
}
