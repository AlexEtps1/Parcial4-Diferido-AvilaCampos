package sv.edu.utec.avilacampos_parcial4_diferido.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import sv.edu.utec.avilacampos_parcial4_diferido.Entidades.EntAsig;

public class Asignaturas extends BaseHelper{
    public Asignaturas(@Nullable Context context) {
        super(context);
    }

    public long insertAsigna(String Nombre, String Acronimo, String Descripcion, String Edificio, String Clase, String GrupoHorario) {
        long codigo =0;

        try{
            BaseHelper baseHelper = new BaseHelper(context);
            SQLiteDatabase bd = baseHelper.getWritableDatabase();

            ContentValues valoresAsig = new ContentValues();
            valoresAsig.put("Nombre", Nombre);
            valoresAsig.put("Acronimo", Acronimo);
            valoresAsig.put("Descripcion", Descripcion);
            valoresAsig.put("Edificio", Edificio);
            valoresAsig.put("Clase", Clase);
            valoresAsig.put("GrupoHorario", GrupoHorario);

            codigo = bd.insert("Asignatura", null, valoresAsig);
            return codigo;
        } catch (Exception ex) {
            ex.toString();
            return codigo = 0;
        }
    }

    public ArrayList<EntAsig> mostrarAsig() {
        BaseHelper baseHelper = new BaseHelper(context);
        SQLiteDatabase bd = baseHelper.getWritableDatabase();
        ArrayList<EntAsig> listaAsig = new ArrayList<>();
        EntAsig entAsig = null;
        Cursor cursorAsig;

        cursorAsig = bd.rawQuery("SELECT IdAsignatura, Nombre, Acronimo, Descripcion, Edificio, Clase, GrupoHorario FROM Asignatura", null);
        if(cursorAsig.moveToFirst()) {
            do{
                entAsig = new EntAsig();
                entAsig.setIdAsignatura(cursorAsig.getInt(0));
                entAsig.setNombre(cursorAsig.getString(1));
                entAsig.setAcronimo(cursorAsig.getString(2));
                entAsig.setDescripcion(cursorAsig.getString(3));
                entAsig.setEdificio(cursorAsig.getString(4));
                entAsig.setClase(cursorAsig.getString(5));
                entAsig.setGrupoHorario(cursorAsig.getString(6));
                listaAsig.add(entAsig);
            }while (cursorAsig.moveToNext());
        }
        cursorAsig.close();
        return listaAsig;
    }

    public int actualizarAsig(int IdAsignatura, String Nombre, String Acronimo, String Descripcion, String Edificio, String Clase, String GrupoHorario) {
        BaseHelper baseHelper = new BaseHelper(context);
        SQLiteDatabase bd = baseHelper.getWritableDatabase();

        ContentValues valoresAsig = new ContentValues();
        valoresAsig.put("Nombre", Nombre);
        valoresAsig.put("Acronimo", Acronimo);
        valoresAsig.put("Descripcion", Descripcion);
        valoresAsig.put("Edificio", Edificio);
        valoresAsig.put("Clase", Clase);
        valoresAsig.put("GrupoHorario", GrupoHorario);

        return bd.update("Asignatura", valoresAsig, "IdAsignatura = ?", new String[]{String.valueOf(IdAsignatura)});
    }

    public int eliminarAsig(int IdAsignatura) {
        BaseHelper baseHelper = new BaseHelper(context);
        SQLiteDatabase bd = baseHelper.getWritableDatabase();

        return bd.delete("Asignatura", "IdAsignatura = ?", new String[]{String.valueOf(IdAsignatura)});
    }
}
