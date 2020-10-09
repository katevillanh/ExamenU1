package examenu1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Operaciones  instanciaAcciones=new Operaciones();
       int opc;
       int opc2;
        Scanner c=new Scanner(System.in);
        instanciaAcciones.Insertar();
        
       do{
        System.out.println("¿Que acción quiere realizar?");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.Salir");
        opc=c.nextInt();
        
       
        
        switch(opc){
            
            case 1:
              instanciaAcciones.suma();
            break;
            
            case 2:
              instanciaAcciones.resta();
            break;
            
            case 3:
              instanciaAcciones.multiplicacion();
            break;
            
            case 4:
                System.exit(0);
            break;    
            
            default: System.out.println("Opción incorrecta");
        }
        
        do{
        System.out.println("¿Quieres realizar otra acción? 1. Si 2. No");
        opc2=c.nextInt();
        
             switch(opc2){
                 case 1:
                 opc2=1;
             break;
                 case 2:
                 System.exit(0);
                 break;
                 default: System.out.println("Opción incorrecta");
             }
        
        }while(opc2>1);
       
         }while(opc2==1);
    }
    
}
