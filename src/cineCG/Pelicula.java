package cineCG;

public class Pelicula {
	public Actor actorPrincipal;
	public Actor actrizPrincipal;
	
	//uno de los dos puede ser null, pero no los dos
	public Pelicula(Actor actorPrincipal, Actor actrizPrincipal) throws Exception {
		super();
		if(actorPrincipal==null&&actrizPrincipal==null)throw new Exception();
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}
	
}
