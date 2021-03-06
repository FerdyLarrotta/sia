package sia.Datos;
import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private ArrayList<Grupo> grupo;
    private int identificador;

    public Asignatura(){
      this("Asignatura sin nombre :c", -1);
    }

    public Asignatura(String nombre, int identificador){
      this.nombre = nombre;
      this.identificador = identificador;
    }
    public String getNombre(){
      return this.nombre;
    }

    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public ArrayList<Grupo> getGrupo(){
      return this.grupo;
    }

    public void setGrupo(ArrayList<Grupo> grupo){
      this.grupo = grupo;
    }

    public int getIdentificador(){
      return this.identificador;
    }

    public void setIdentificador(int identificador){
      this.identificador = identificador;
    }

    private String grupos (){
        String a = new String ();
        for (int i = 0; i<grupo.size(); i++){
            a.concat(String.valueOf(grupo.get(i).getIdentificador()));
            a.concat("  ");
            a.concat(String.valueOf(grupo.get(i).getMateria()));
            a.concat("  ");
        }
        return a;
    }
    
    @Override
    
    public String toString(){
        return "Estudiante: "+nombre+" Identificador: "+identificador+ " Grupo: "+grupos();
    }
    
}
