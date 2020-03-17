
import java.util.*;

public class Carrera
{
    private String codigo;
    private String nombre;
    private Integer numSem;
    private Integer numCreditos;
    private String titulo;
    private String director;
    Date fechaIni;

    //Constructor Carrera
    public Carrera(){
        this.codigo="115";
        this.nombre="Ingeniería de Sistemas";
        this.numSem=3;
        this.numCreditos=26;
        this.titulo="Ingeniero de Sistemas";
        this.director="Oscar Gallardo";
        this.fechaIni= new java.util.Date();
    }
    
    public Carrera(String codigo,String nombre,Integer numSem,Integer numCreditos,String titulo,String director,
    Date fechaIni)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.numSem=numSem;
        this.numCreditos=numCreditos;
        this.titulo=titulo;
        this.director=director;
        this.fechaIni=fechaIni;

    }
    
    public void imprimirCreditos(){
        System.out.println("Los creditos de la carrera son: " +getNumCreditos());
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Integer getNumSem(){
        return numSem;
    }

    public void setNumSem(Integer numSem){
        this.numSem=numSem;
    }

    public Integer getNumCreditos(){
        return numCreditos;
    }

    public void setNumCreditos(Integer numCreditos){
        this.numCreditos=numCreditos;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director=director;
    }
    
    public Date getfechaIni(){
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni){
        this.fechaIni=fechaIni;
    }
}//fin class Carrera
