import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class MapaLibro {

	private static Map<String, Libro> 
	mapalibro;

	public Map<String, Libro> getMapalibro() {
		return mapalibro;
	}

	public void setMapalibro(Map<String, Libro> mapalibro) {
		MapaLibro.mapalibro = mapalibro;
	}

	public MapaLibro() {
		super();
		mapalibro = new HashMap<String, Libro>();
	}
	
	public void addLibro (String isbn, Libro lib)
	{
		mapalibro.put(isbn, lib);
	}
	
	public static Libro getLibro (String isbn)
	{
		return mapalibro.get(isbn);
	}
	
	

}
