package it.polito.tdp.extflightdelays.model;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;

public class Model {

	Graph<Airport, DefaultWeightedEdge> grafo;
	Map<Integer,Airport> idMap;
	
	public Model() {
		idMap= new HashMap<>();
	}
	public Graph creaGrafo(int x) {
		grafo= new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		ExtFlightDelaysDAO dao= new ExtFlightDelaysDAO();
	
		dao.loadAllAirports(idMap);
		Graphs.addAllVertices(grafo, idMap.values());
		
		List<Archi> archi= dao.getArchi(idMap,x);
		for(Archi a: archi) {
			Graphs.addEdge(grafo, a.getPartenza(), a.getArrivo(), a.getPeso());
		}
		return grafo;
	}

}
