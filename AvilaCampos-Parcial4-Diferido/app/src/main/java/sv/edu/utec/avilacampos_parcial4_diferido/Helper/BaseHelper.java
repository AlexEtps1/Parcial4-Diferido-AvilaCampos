package sv.edu.utec.avilacampos_parcial4_diferido.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper {
    Context context;
    String NombreBase = "MateriasDB";

    public BaseHelper(@Nullable Context context){
        super(context, NombreBase, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Asignatura (" +
                "IdAsignatura INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Nombre TEXT, " +
                "Acronimo TEXT, " +
                "Descripcion TEXT," +
                "Edificio TEXT," +
                "Clase TEXT," +
                "GrupoHorario TEXT)");

        db.execSQL("CREATE TABLE Deber (" +
                "IdDeber INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre TEXT," +
                "Descripcion TEXT," +
                "Fecha_Entrega DATE," +
                "Hora_Entrega TIME," +
                "Ubicacion TEXT," +
                "IdAsignatura INTEGER," +
                "Ponderacion REAL," +
                "GrupoHorario TEXT)");

        db.execSQL("CREATE TABLE Evento (" +
                "IdEvento INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre TEXT," +
                "Descripcion TEXT," +
                "Ubicacion TEXT," +
                "GrupoHorario TEXT," +
                "IdAsignatura INTEGER)");

        db.execSQL("CREATE TABLE Horario (" +
                "IdHorario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Grupo TEXT," +
                "Fecha TEXT," +
                "Hora_Inicio TEXT," +
                "Hora_Fin TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Asignatura");
        db.execSQL("DROP TABLE IF EXISTS Deber");
        db.execSQL("DROP TABLE IF EXISTS Evento");
        db.execSQL("DROP TABLE IF EXISTS Horario");

        onCreate(db);
    }
}
