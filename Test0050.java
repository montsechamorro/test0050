
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    

    /**
     * Constructor for objects of class Test0050
     */
    public Test0050()
    {
        
    }

    /**
     * Metodo que realiza multiplicaciones enteras mediante el uso de sumas o restas
     */
    public int multiplicacion(int numero, int multiplicador)
    {
        int resultado = 0;
        
        while (multiplicador > 0)
        {
            resultado += numero;
            multiplicador--;
        }
        return resultado;
    }
    /**
     * Metodo que realiza divisiones mediante el uso de sumas o restas
     */
    public int divisiones(int numero, int divisor)
    {
        int resultado = 0;
        
        while (numero > 0)
        {
            numero = numero - divisor;
            resultado++;
            
        }
        return resultado;
    }
    /**
     * metodo que realiza modulos entre dos numeros dados
     */
    public int modulo(int operando1, int operando2)
    {
        int contador = 0;
        
        while (operando1 > 0 && operando1 >= operando2)
        {
            operando1 = operando1 - operando2;
            contador++;
        }
        return contador;
    }
    /**
     * metodo que realiza potencias entre dos numeros dados
     */
    public int potencia(int numero, int exponente)
    {
        int resultado = numero;
        int contador = 1;
        
        while (contador < exponente)
        {
            resultado = multiplicacion(resultado, numero);
            contador++;
        }
        return resultado;
    }
}
          
        

