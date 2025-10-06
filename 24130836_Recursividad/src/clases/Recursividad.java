/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author cainm
 */
public class Recursividad {
    public Recursividad(){
        
    }
    
    //Metodo iterativo para obtener el factorial de un numero n
    public int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        
        return factorial;
    }
    
    public int factorialR(int n){
        if(n <= 1){
            return 1;
        }
        
        return factorialR(n - 1) * n;
        
    }
    
    //METODO ITERATIVO
    public int maximoMCD(int divisor, int dividendo){
        int residuo;
        while ((residuo = dividendo%divisor) !=  0 ) {
            
            if (dividendo%divisor != 0) {
                dividendo = divisor;
                divisor = residuo;
            }
            
        }
        return divisor;
    }
    
    
    public int maximoMCDR(int dividendo, int divisor){
        
        
        if(dividendo % divisor == 0){
            return divisor;
        }else{
            return maximoMCD(divisor, dividendo%divisor);
        }
        
     
    }
    
    //Metodo Iterativo
    public String fibonacci(int num){
        String cad = "0, 1";
        int suma, n1, n2;
        n1 = 0;
        n2 = 1;
        for (int i = 0; i < num-2; i++) {
            suma = n1+n2;
            cad = cad+","+suma;
            n1 = n2;
            n2 = suma;
        }
        return cad; 
    } 
    
    //Metodo Recursivo
    public String fibonacciR(int aux1, int aux2, int n1, String cad){
        
        if(n1 == 1)
            return "0 "+cad;
        else if(n1 == 2)
            return "0, 1"+ cad;
        else if(n1 > 2)
            return fibonacciR(aux2, aux1+aux2, n1-1, cad+=", "+(aux1 + aux2));
        
        return "";
    }
    
    
    //Metodo Iterativo
    public double sumatoriaI(int numLim, double x){
        double suma = 0;
        for (double i = 0; i < numLim ; i++) {
            suma += Math.pow(x, i/2);
            
        }
        return suma;
    }
    
    //Metodo Recursivo
    public double sumatoriaR(int numLim, double x, double i){
        
        if (numLim == 0) {
            return 0;
        }else{
            return sumatoriaR(numLim-1, x, i+0.5) + Math.pow(x, i);
        }
        
    }
    
    // Método Iterativo
    public String invertirI(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }

    // Método Recursivo
    public String invertirR(String cadena, int indice) {
        if (indice < 0) {
            return "";
        }else {
            return cadena.charAt(indice) + invertirR(cadena, indice - 1);
        }
    }
    
    
    // Método Iterativo
    public int sumaDigitosI(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n = n / 10;
        }
        return suma;
    }

    // Método Recursivo
    public int sumaDigitosR(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumaDigitosR(n / 10);
        }
    }
    
    
    // Método Iterativo
    public int contarVocalesI(String cadena) {
        int contador = 0;
            cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
}

    // Método Recursivo
    public int contarVocalesR(String cadena, int indice) {
        if (indice >= cadena.length()) {
            return 0;
        }else {
            char c = Character.toLowerCase(cadena.charAt(indice));
            int vocal = 0;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocal = 1;
            }
        return vocal + contarVocalesR(cadena, indice + 1);
        }
    }
    
    // Método Iterativo
    public String buscarNumeroI(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return "Encontrado";
            }
        }
        return "No encontrado";
    }

    // Método Recursivo
    public String buscarNumeroR(int[] arreglo, int numero, int indice) {
        if (indice >= arreglo.length) {
            return "No encontrado";
        }else{
            if (arreglo[indice] == numero) {
                return "Encontrado";
            }else{
                return buscarNumeroR(arreglo, numero, indice + 1);
            }
        }
    }   
    
    // Método Iterativo
    public boolean esPalindromoI(String palabra) {
        palabra = palabra.toLowerCase();
        int izquierda = 0;
        int derecha = palabra.length() - 1;
    
        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    // Método Recursivo
    public boolean esPalindromoR(String palabra, int izquierda, int derecha) {
        palabra = palabra.toLowerCase();
    
        if (izquierda >= derecha) {
            return true;
        }else{
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }else{
                return esPalindromoR(palabra, izquierda + 1, derecha - 1);
            }
        }
    }
    
    
    
    
    
    
}
