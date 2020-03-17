
public class Estudiante
{
    private String codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipoDoc;
    private Integer creditos;
    private Integer semestre;
    private String estado;
    private Carrera carrera;
    private Asignatura asignatura;

    //Constructor
    public Estudiante(String codigo, String nombre, String telefono, String email,
    String direccion, String edad, String documento,
    String tipoDoc, Integer creditos, Integer semestre,
    String estado, Carrera carrera){
        this.codigo="1151923";
        this.nombre="Douglas Alvarez";
        this.telefono="3118327842";
        this.email="douglasarleyaoch@ufps.edu.co";
        this.direccion="CLL 5 AV 7-02";
        this.edad=18;
        this.documento="1264762412";
        this.tipoDoc="CC";
        this.creditos=26;
        this.semestre=20;
        this.estado="Activo";
        this.carrera=new Carrera();
    }

    /*Metodos: *Calcular si el estudiante es mayor de edad.
     *El promedio de creditos cursado.
     *Matricular el proyector de grado: el estudiante debe haber aprobado el 70% creditos y estar o superior de 7 semestre. 
     *Obtener el promedio de creditos por semestre.
     *Mostrar si el estudiante cursó el total de creditos de la carrera.
     *Actualizar el estado(El estudiante puede tener estado:Matriculado, PFU)
     */

    public void calcularMayorEdad(){
        if (getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else {
            System.out.println("El estudiante es menor de edad");
        }
    }

    public void cursoTotalCreditos(){
        if(getCreditos()>=carrera.getNumCreditos()){
            System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumCreditos());
            System.out.println("Estás a un paso de ser:   "+carrera.getTitulo());
        }
        else 
        {   System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumCreditos());

        }
    }

    public void matricularProyecto(){
        if(getCreditos()>=(carrera.getNumCreditos()*0.7) && getSemestre()>=7)
        {
            System.out.println("Señor estudiante usted ya puede matricular proyecto de grado");}

        else
            System.out.println("No puedes matricular poryecto de grado te faltan creditos y semestres por cursar");
    }

    public void promedioCreditosSemestre(){
        Float promedio=(float)(getCreditos()/getSemestre());

        System.out.println("El promedio de creditos cursados es: " + promedio);
    }

    public void actualizarEstado(){
        if (getSemestre()>=carrera.getNumSem()*2)
        {
            this.estado ="PFU";
        }
        System.out.println("Los semestres cursados son: " + getSemestre());
        System.out.println("Los semestres cursados son: " +carrera.getNumSem());

    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo=codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {this.telefono=telefono;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String Email)
    {
        this.email=email;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }

    public Integer getEdad()
    {
        return edad;
    }

    public void setEdad(Integer edad)
    {
        this.edad=edad;
    }

    public String getDocumento()
    {
        return documento;
    }

    public void setDocumento(String documento)
    {
        this.documento=documento;
    }

    public String getTioDoc()
    {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc)
    {
        this.tipoDoc=tipoDoc;
    }

    public Integer getCreditos()
    {
        return creditos;
    }

    public void setCreditos(Integer creditos)
    {
        this.creditos=creditos;
    }

    public Integer getSemestre()
    {
        return semestre;
    }

    public void setSemestre(Integer semestre)
    {
        this.semestre=semestre;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado=estado;
    }

    public Carrera getCarrera()
    {
        return carrera;
    }

    public void setCarrera(Carrera carrera)
    {
        this.carrera=carrera;
    }

}//fin class Estudiante
