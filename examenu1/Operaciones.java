package examenu1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {
    List <Integer> listakate=new ArrayList<Integer>();
    List <Integer> listadatos=new ArrayList<Integer>();
    int opc;
    int opc2;
    Scanner c=new Scanner(System.in);
    int res;
    int a;
    public void Insertar(){
        System.out.println("Ingresa los datos de la lista");
        for(int i=0;i<=9;i++){
           int k=i+1;
            System.out.println("Ingresa el dato "+k);
            opc=c.nextInt();
        listakate.add(opc);
            }
    }
    
    public void suma(){
        System.out.println("1.Suma");
        System.out.println("Escribe las 3 posisciones que desees sumar");
        for(int j=0;j<=2;j++){
        opc=c.nextInt();  
        int k=opc-1;
        listadatos.add(listakate.get(k));
       
        }int a=listadatos.get(0);
        int b=listadatos.get(1);
        int c=listadatos.get(2);
        res=(a+b)+c;
           
        System.out.println("el Resultado es: "+res);
        
        
    }
    
    public void resta(){
         System.out.println("2.Resta");
        System.out.println("Escribe las 2 posisciones que desees restar");
        for(int j=0;j<=1;j++){
        opc=c.nextInt();  
        int k=opc-1;
        listadatos.add(listakate.get(k));
       
        }int a=listadatos.get(0);
        int b=listadatos.get(1);
        
        res=(a-b);
             
        System.out.println("el Resultado es: "+res);
    }
    
    public void multiplicacion(){
        System.out.println("3.Multiplicación");
        System.out.println("Escribe las 3 posisciones que desees multiplicar"); 
        for(int j=0;j<=2;j++){
        opc=c.nextInt();  
        int k=opc-1;
        listadatos.add(listakate.get(k));
       
        }int a=listadatos.get(0);
        int b=listadatos.get(1);
        int c=listadatos.get(2);
        res=(a*b)*c;
             
        System.out.println("el Resultado es: "+res);
    }
}
