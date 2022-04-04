
package controlador;

public class Calculadora {
    
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
    
    public int restar(int num1, int num2) {
        return num1 - num2;
    }
    
    public long multiplicar(long num1, long num2) {
        
        long resultado = 0;
        
        for (int i = 1; i <= num2; i++) {
            resultado += num1;
        }
        
        return resultado;
    }
    
    public int dividir(int num1, int num2) {
        
        int divisiones = 0;
        
        while(num1 >= num2) {
            num1 -= num2;
            
            divisiones++;
        }
        
        return divisiones;
    }
    
    public long potenciar(long num1, long num2) {
        
        long base = num1;
        long exponente = num2;
                      
        for(int i = 1; i < exponente; i++) {
            base = multiplicar(base, num1);
        }
        
        long potencia = base;
        
        return potencia;
    }
}
