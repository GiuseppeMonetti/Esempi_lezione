package e.giuseppemonetti.esempi_lezione.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Giuseppe Monetti on 10/04/2018.
 */


//FONTE DATI MODEL
public class DataSource {

    //Unico database
    private static DataSource istanza = null;

    private DataSource() {
        startDataSource();
    }

    public static DataSource getIstanza()
    {
        if(istanza==null)
        {
            istanza = new DataSource();
        }
        return istanza;
    }

    //Fonte dati
    static private HashMap<String, Studente> elenco;

    public void aggiungiStudente(Studente studente){
        elenco.put(studente.getMatricola(),studente);
    }
    public void rimuoviStudente (String matricola){
        elenco.remove(matricola);
    }
    public void aggiornaStudente (Studente studente){
        elenco.remove(studente.getMatricola());
        elenco.put(studente.getMatricola(),studente);
    }
    public Studente leggiStudente(String matricola){
        return elenco.get(matricola);
    }
    public List<Studente> elencoStudenti(String prefissoMatricola){
        ArrayList<Studente> ris = new ArrayList<Studente>();
        for (HashMap.Entry<String,Studente> elemento: elenco.entrySet()) {
            if(elemento.getKey().startsWith(prefissoMatricola))
                ris.add(elemento.getValue());
        }
        return ris;
    }

    static private void startDataSource()
    {
        elenco.put("A13000860",new Studente("A13000860","Monetti","Giuseppe",109,27.7));
        elenco.put("A13001118",new Studente("A13001118","Fierro","Salvatore",102,25.4));
    }


}
