package code;

public class Nomina {

    private int numHoras;
    private float valorHora;
    
    public Nomina(int numHoras, float valorHora) {
        setNumHoras(numHoras);
        setValorHora(valorHora);
    }
    
    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float calcSalarioBasico() {
        return getNumHoras() * getValorHora();
    }

    public float obtenerSubsidio() {
        return calcSalarioBasico() < 800000 ? 50000 : 0;
    }

    public float obtenerRetencion() {
        if (calcSalarioBasico() < 800000) {
            return (float) (calcSalarioBasico() * 0.03);
        } else {
            if (calcSalarioBasico() > 800000 && calcSalarioBasico() < 2000000) {
                return (float) (calcSalarioBasico() * 0.05);
            } else {
                return (float) (calcSalarioBasico() * 0.07);
            }
        }
    }

    public float TotalAPagar() {
        return calcSalarioBasico() + obtenerSubsidio() - obtenerRetencion();
    }

}
