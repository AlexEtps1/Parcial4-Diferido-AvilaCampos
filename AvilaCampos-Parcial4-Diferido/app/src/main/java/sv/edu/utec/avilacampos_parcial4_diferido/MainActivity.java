package sv.edu.utec.avilacampos_parcial4_diferido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btnAsigna, btnDeber, btnHorario, btnEvento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsigna = findViewById(R.id.asignatura);
        btnDeber = findViewById(R.id.deberes);
        btnHorario = findViewById(R.id.horario);
        btnEvento = findViewById(R.id.evento);

        btnAsigna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}