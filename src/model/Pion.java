package model;

public class Pion extends AbstractPiece{
	



	public Pion(Couleur couleur_de_piece, Coord coord){
		super(couleur_de_piece, coord);
	}


	@Override
	/**
	 * Retourne true si déplacement légal en fonction des algo de déplacement spécifique de chaque pièce
	 * etat_initial permet de savoir si c'est la première fois qu'on bouge le pion qui peut dans ce cas avancer de 2 cases
	 * @param int xFinal
	 * @param int yFinal
	 * @return boolean ret
	 */
	public boolean isMoveOk(int xFinal, int yFinal) {
		boolean ret=false;
		if(this.getCouleur()==Couleur.NOIR){
			ret =(this.getX()==xFinal) && (this.getY()+1==yFinal);
			if(ret=false){
				ret=(this.getX()==xFinal) && (this.getY()+2==yFinal);
			}
		}
		if(this.getCouleur()==Couleur.BLANC){
			ret =(this.getX()==xFinal) && (this.getY()-1==yFinal || this.getY()-2 == yFinal);
			if(ret=false){
				ret=(this.getX()==xFinal) && (this.getY()-2==yFinal);
			}
		}

		return ret;
	}
}