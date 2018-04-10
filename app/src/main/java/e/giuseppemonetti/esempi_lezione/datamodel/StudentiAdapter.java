package e.giuseppemonetti.esempi_lezione.datamodel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import e.giuseppemonetti.esempi_lezione.R;

/**
 * Created by Giuseppe Monetti on 10/04/2018.
 */

public class StudentiAdapter extends BaseAdapter {

    private List<Studente> lista;






    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Studente getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.riga_studente_layout);

        TextView vMatricola = view.findViewById(R.id.textMatricola);
        TextView vNomeCompleto = view.findViewById(R.id.textNomeCompleto);

        Studente s = lista.get(i);



        return null;
    }
}

