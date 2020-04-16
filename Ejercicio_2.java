
/**
 * Realizar un programa que contenga un método que su parámetro sea una cadena de números enteros, 
 * y que realice la suma de todos los números de un solo dígito que se puedan extraer del número dado, 
 * la suma ahora será el número a abstraer dígitos, repetir hasta obtener un número de un solo digito y retornarlo.
 * 
 */
public class Ejercicio_2
{
    //metodo de prueba
    public static void main(String args[]){
        int array[] = {1,5,5};
        System.out.println(sumaDig(array));
    }
    
    //Metodo que suma los digitos y solo retorna numeros de 1 digito
    
    public static int sumaDig(int nums[])
    {
        int suma = 0, j=0;
        boolean band = false;
        
        do{
            for(int i = 0; i < nums.length-j; i++){
                suma += nums[i];
            }
            if(suma < 10){
                band = true;
            }else{
                j++;
                
                suma =0;
            }
        }while(band ==false);
        return suma;
    }
    
}


     
        




