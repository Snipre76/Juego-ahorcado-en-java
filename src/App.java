
public class App {
  public static void main(String[] args) throws Exception {

    
    // ARREGLOS: Estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre
    // Estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un índice
    // LOS ARREGLOS SO NTAMBIEN LLAMADOS VECTORES  O MATRICES 

    //DATO IMPORTANTE: El índice se comienza a contar por cero y no por uno

    //tipo nombre       indices
    //dato            0  1  2  3  4
    // int[] numeros = {10,20,30,40,50}; UNA MANERA DE INIALIZAR UN ARRAY

    //OTRA MANERA SERIA:
    int[] numeros = new int[5];
    numeros[0]= 1;
    numeros[1]= 2;
    numeros[2]= 3;
    numeros[3]= 4;
    numeros[4]= 5;

    numeros[2]=70;
    
    int indice =0;
    //forEach
    //    un elemento de arreglo
    for (int numero : numeros) {

      System.out.println(numero);  
      System.out.println(indice);
      indice++;   
    }

    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
      System.out.println(i);
    }
    

  }

}
