import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int cantidadEstudiantes; 
        int contador = 0;
        int nota = 0;
        int cantidadCategorias = 0;
        
      
        
        System.out.println("Ingrese la cantidad de estudiantes a evaluar: ");
        cantidadEstudiantes = entrada.nextInt();
        
        while(cantidadEstudiantes <= 0){
            System.out.println("Ingrese un numero que sea mayor y diferente de cero ");
            System.out.println("Ingrese la cantidad de estudiantes a evaluar: ");
            cantidadEstudiantes = entrada.nextInt();    
        }
        
        int[]notas = new int[cantidadEstudiantes];
        
        int[]categoria = new int[5];
       
            for(int i = 0; i < notas.length; i++){ 
            System.out.println("Ingrese la nota del estudiante:  [" + (i+1) + "]");
            notas[i] = entrada.nextInt();
            
            while(nota <0 && nota > 100){
                System.out.println("Ingrese una nota que sea mayor y diferente de cero");
                System.out.println("Ingrese la nota del estudiante:  [" + (i+1) + "]");
                notas[i] = entrada.nextInt();
                
             }
            if(nota >= 0 || nota <= 59){
                categoria[0]++;
                
            }else if(nota >= 60 ||  nota <= 69){
                categoria[1]++;
            }else if(nota >= 70 || nota <= 79){
                categoria[2]++;
                
            }else if(nota >= 80 || nota <=89 ){
                categoria[3]++;
                
            }else if(nota >= 90 || nota <= 100 ){
                categoria[4]++;
            }
          
      
        }
         System.out.println("");
        
        System.out.println("Estas son las categorias de cada calificacion: ");
        System.out.println("0-59 = (Reprobado) ");
        System.out.println("60-69 (Regular)");
        System.out.println("70-79 (Bueno)");
        System.out.println("80-89 (Muy bueno)");
        System.out.println("90-100 (Excelente)");
                
            
        System.out.println("***CATEGORIA (CONTEO):***");
        System.out.println("");
        System.out.println("Reprobados: " + categoria[0]);
        System.out.println("");
        System.out.println("Regular: " + categoria[1]);
        System.out.println("");
        System.out.println("Bueno: " + categoria[2]);
        System.out.println("");
        System.out.println("Muy bueno: " + categoria[3]);
        System.out.println("");
        System.out.println("Excelente: " + categoria[4]);
        
        entrada.close();
    }
}
