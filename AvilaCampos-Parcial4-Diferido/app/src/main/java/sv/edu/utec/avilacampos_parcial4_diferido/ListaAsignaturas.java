package sv.edu.utec.avilacampos_parcial4_diferido;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sv.edu.utec.avilacampos_parcial4_diferido.Entidades.EntAsig;
import sv.edu.utec.avilacampos_parcial4_diferido.Helper.Asignaturas;

public class ListaAsignaturas extends AppCompatActivity {
    RecyclerView listAsig;

    ArrayList<EntAsig> alistAsig;

    int IdAsignatura;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asignaturas_lista);

        listAsig = findViewById(R.id.lsvAsignaturas);

        listAsig.setLayoutManager(new LinearLayoutManager(this));

        IdAsignatura = getIntent().getIntExtra("IdAsignatura", 0);

        if(IdAsignatura != 0){
            Asignaturas dbAsig = new Asignaturas(getApplicationContext());
            alistAsig = new ArrayList<>();

            alistAsig = dbAsig.mostrarAsig();
        }
    }
}
