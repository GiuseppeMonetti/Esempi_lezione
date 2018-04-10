package e.giuseppemonetti.esempi_lezione;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ElencoStudentiActivity extends AppCompatActivity {


    private ListView vListaStudenti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RIFERIMENTO ALLE VIEW
        vListaStudenti = findViewById(R.id.listaStudenti);
    }


}
