public class Operaciones{
   public static void main (String args[]){
      Integer operaciones = 5;
      Integer num1= 4;
      Integer num2 = 4;
      Integer resultado =0;
      
      if(operaciones==1){
         resultado= num1+num2;
         System.out.println("Resulatado de la suma es " +resultado);
      }else{
         if(operaciones ==2){
            resultado= num1-num2;
            System.out.println("Resultado de la Resta es "+resultado);
         }else{
            if(operaciones== 3){
               resultado= num1*num2;
               System.out.println("Resultado de la multiplicacion es "+resultado);
            }else{
               if(operaciones== 4){ 
               resultado= num1/num2;
               System.out.println("Resultado de la division es "+resultado);
               }else{
                  System.out.println("La opcion que eleguiste no existe");
               }              
            }
         }
      }
   }
}