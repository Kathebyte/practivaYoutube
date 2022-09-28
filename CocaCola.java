//La empresa Cocacola solicita un sistema que determine los dias de vacaciuones a los que tiene derecho un trabajador, tomando en cuenta las siguentes cararcteristicas: 
//departamento atencion al cliente (clave 1)
//departmaneto de logistica (clave 2)
//gerencia (clave 3)
//clave 1 =  un ano de servicio 6 dias, 2+6 anos 14 dias de vaciones-apartir de 7 anos 20 dias vacaciones
//clave 2= un ano de servicio 7 dias vacaciones, 2-6 anos 15 dias de vaciones- 7 anos 22 dias
//clave 3= 1 ano de servicio 10 dias; 2-6 20 dias de vacaiones- 7 anos 30 dias vacaciones
//solicita ingresar nombre, clave de departamento, antiguedad./ mensaje trabajor, dias de vacciones.


import java.util.Scanner;

class CocaCola{
   public static void main (String args[]){
   String nombre = "";
   Integer clave = 0 , antiguedad = 0;

   System.out.println("** ** ** ** ** *** *** *** ** ** * * * * * *****");
   System.out.println("Bienvenido al sistema de VACACIONES de Cocacola");
   System.out.println("** ** ** ** ** *** *** *** ** ** * * * * * *****");
   
   Scanner datos = new Scanner(System.in);
   
   System.out.println("Como es tu nombre ");
   nombre = datos.nextLine();
   System.out.println("** ** ** ** ** *** *** *** ** ** * * * * * *****");
   
   System.out.println("Cuantos anos de servicio tienes ");
   antiguedad = datos.nextInt();
   System.out.println("** ** ** ** ** *** *** *** ** ** * * * * * *****");

   System.out.println("Cual es el departamento de tu clave Atencion al cliente 1 - Logistica 2 - Gerencia 3 ");
   clave = datos.nextInt();
   
   if(clave == 1){

      if(antiguedad == 1){
         System.out.println(nombre + "Tienes de vacaciones 6 dias");
      } else if(antiguedad >=2 && antiguedad < 6){
         System.out.println(nombre + "tienes de vacacuines 14 dias");
      }else if(antiguedad >=7){
         System.out.println(nombre + "Tienes 22 dias de vacaciones");
      }
   }else if(clave == 2){
      if (antiguedad == 2){
         System.out.println(nombre + "tienes 7 dias de vacaciones");
      }else if (antiguedad >= 2 && antiguedad < 6){
         System.out.println(nombre + "Tienes 15 dias de vacaciones");
      }else if (antiguedad >= 7){
         System.out.println(nombre + "tienes 22 dias de vacaciones");
      }
   }else if(clave == 3){
      if (antiguedad == 3){
         System.out.println(nombre + "tienes 10 dias de vacaciones");
      }else if (antiguedad >= 2 && antiguedad < 6){
         System.out.println(nombre + "Tienes 20 dias de vacaciones");
      }else if (antiguedad >= 7){
         System.out.println(nombre + "tienes 30 dias de vacaciones");
      }
   }
   datos.close();
   }

}
