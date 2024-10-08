package fr.diginamic.maison;

public class Maison {

    public Maison(Piece[] pArray) {
        this.pArray = pArray;
    }

    Piece[] pArray = {};

    public Piece[] ajouterPiece(Piece piece){
        //Le bloc de code s'éxécute seulement si l'objet qu'on essaie d'ajouter n'est pas null et que sa superficie est supérieur à 0
        if (piece != null && piece.getSuperficie()>0) {
            Piece[] array1 = pArray;
            Piece[] array2 = {piece};
            pArray = new Piece[pArray.length+1];
            int posTableau = 0;

            for (Piece i : array1) {
                pArray[posTableau] = i;
                posTableau++;
            }
            for (Piece i : array2) {
                pArray[posTableau] = i;
                posTableau++;
            }
        }
         return pArray;
    }

    public int superficieTotal(){
        int sum = 0;
        for (Piece i : pArray){
            int j = i.getSuperficie();
            sum += j;
        }
        return sum;
    }

    public int superficieEtage(int nEtage) {
        int sum = 0;
        for (Piece i : pArray){
            int a = i.getnEtage();
            if (nEtage == a){
                int j = i.getSuperficie();
                sum += j;
            }
        }
        return sum;
    }

    public int superficieType(String type){
        int sum = 0;
        for (Piece i : pArray){
            if (i.getType() == type){
                int j = i.getSuperficie();
                sum += j;
            }
        }
        return sum;
    }

    public int nbPiece(String type){
        int sum = 0;
        for (Piece i : pArray){
            if (i.getType() == type){
               sum++;
            }
        }
        return sum;
    }
}
