


/**
 * Realizar un programa que contenga un método que su parámetro sea una cadena de números enteros, 
 * y que realice la suma de todos los números de un solo dígito que se puedan extraer del número dado, 
 * la suma ahora será el número a abstraer dígitos, repetir hasta obtener un número de un solo digito y retornarlo.
 * 
 */


public class Ejercicio_2
{
    public static void main(String args[]){//El metodo main solo funge coomo un metodo de prueba
        System.out.println(sumaDig(args[0]));//Imprimimos el valor obtenido del metodo sumaDig
    }
    
    public static int sumaDig(String nums){//El metodo recibe un un string de numeros y retorna un valor entero
        int sumaD;//Esta variable se utiliza para realizar la suma y es la variable que se retornara
        do{
            sumaD = 0;
            for(int i = 0; i < nums.length(); i++){
                sumaD += Integer.parseInt(""+nums.charAt(i));//Fuerzo el caracter obtenido del "String nums" a ser un string para hacer la conversión
            }
            nums =""+sumaD;//intercambiamos los digitos originales, por los de la suma resultante para poder realizar nuevamente las operaciones de ser necesario
        }while(sumaD > 9);//Aquí termina el metodo do while. El cual determina la condición del problema
        return sumaD;//Retornamos la suma de los digitos bajo las condiciones dadas por el problema en forma de un valor entero
    }
}
