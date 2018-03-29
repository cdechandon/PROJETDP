package model;

public abstract class AbstractPiece implements Pieces {
	  private Couleur couleur;
	  private Coord coord;
	  private String name;
	  boolean etat_initial;
	


	public AbstractPiece(Couleur couleur,Coord coord) {
		super();
		this.couleur=couleur;
		this.coord=coord;
		this.name=this.getClass().getSimpleName();
		etat_initial=true;
	}

	@Override
	public int getX() {
		return this.coord.x;
	}
	
	public Coord getCoord() {
		return this.coord;
	}

	@Override
	public int getY() {
		return this.coord.y;
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public Couleur getCouleur() {
		return this.couleur;
	}

	@Override
	public  abstract boolean isMoveOk(int xFinal, int yFinal);

	@Override
	/**
	 * return true si deplacement effectue
	 */

	public boolean move(int xFinal, int yFinal) {
		if (isMoveOk(xFinal, yFinal) ){
				coord.x=xFinal;
				coord.y=yFinal;
				etat_initial=false;
				return true;
			}

		return false;
	}

	@Override
	public boolean capture() {
		coord.x=-1;
		coord.y=-1;	
		return true;
	}
	
	public String toString(){
		
		
		return  " La piece "+this.getName() + " à les coordonnées : x:  "+this.getX()+" y: "+ this.getY() ;
		
	}

}
