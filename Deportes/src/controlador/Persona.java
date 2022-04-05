package controlador;

public class Persona {

    private String nombre, sexo;
    private int edad;
    private float estatura, peso;

    public Persona(String nombre, String sexo, int edad, float estatura, float peso) {
        setNombre(nombre);
        setSexo(sexo);
        setEdad(edad);
        setEstatura(estatura);
        setPeso(peso);

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /*------------Métodos-------------*/
    public boolean aplicaParaFutbol() {
        return sexo.equals("hombre") ? edad < 17 && estatura >= 1.70 && peso >= 60 : edad < 18 && peso >= 50;
    }
    
    public boolean aplicaParaBasket() {
        return sexo.equals("hombre") ? estatura >= 1.80 : estatura >= 1.70;
    }
    
    public boolean aplicaParaVoleibol() {
        return edad > 18; 
    }
    
    public String admitidoEnFutbol() {
        return aplicaParaFutbol() ? "Aplica para futbol" : "No aplica para futbol";
    }
    
    public String admitidoEnBasket() {
        return aplicaParaBasket() ? "Aplica para basket" : "No aplica para basket";
    }
    
    public String admitidoEnVoleibol() {
        return aplicaParaVoleibol() ? "Aplica para voleibol" : "No aplica para voleivol";
    }
    
}
