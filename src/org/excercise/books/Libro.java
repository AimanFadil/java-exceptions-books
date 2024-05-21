package org.excercise.books;

public class Libro {

    //ATTRIBUTI

    private String titolo;
    private int nPagine;
    private String autore;
    private String editore;


    //COSTRUTTORI

    public Libro(String titolo, int nPagine, String autore, String editore) {
        setTitolo(titolo);
        setnPagine(nPagine);
        setAutore(autore);
        setEditore(editore);
    }


    //METODI

    @Override
    public String toString() {
        return
                " titolo = " + titolo +
                ", nPagine = " + nPagine +
                ", autore = " + autore +
                ", editor e= " + editore
                ;
    }


    //GETTER

    public String getTitolo() {
        return titolo;
    }

    public int getnPagine() {
        return nPagine;
    }

    public String getAutore() {
        return autore;
    }

    public String getEditore() {
        return editore;
    }



    //SETTER

    public void setTitolo(String titolo) throws  IllegalArgumentException{
        if(titolo == null || titolo.trim().isEmpty()){
            throw new IllegalArgumentException("Il titolo non può essere vuoto.");
        };
        this.titolo = titolo;
    }
    public void setnPagine(int nPagine) throws  IllegalArgumentException{
        if(nPagine <= 0){
            throw new IllegalArgumentException("Il numero di pagine non può essere meno di 0.");
        };
        this.nPagine = nPagine;
    }
    public void setAutore(String autore) throws  IllegalArgumentException {
        if(autore == null || autore.trim().isEmpty()){
            throw new IllegalArgumentException("l'autore non può essere vuoto.");
        };
        this.autore = autore;
    }

    public void setEditore(String editore)  throws  IllegalArgumentException{
        if(editore == null || editore.trim().isEmpty()){
            throw new IllegalArgumentException("l'editore non può essere vuoto.");
        };
        this.editore = editore;
    }


}
