# Servicio de  compra online en MERCADAW

## Índice

1. [Resumen](#Resumen)
2. [Clase_Bus](#clase-bus)
6. [Entrega](#entrega)

## Resumen
>Con esta app haremos ua carrea a muerte entre los dos Davids

> [!WARNING]
> ¡SOLO PUEDE QUEDAR UNO!

## Clase Bus

```Java

public class Bus {

   public static final int TAM = 97;
   static Random aleatorio = new Random();

   public static void main(String[] args) throws InterruptedException {

      int a = 0;
      int b = 0;

      System.out.println("\n<<<<<<<<<< CARRERA POR EL HONOR >>>>>>>>>>");
      System.out.println("          DAVID BIEN vs DAVID MAL");
      System.out.println("                ¡¡¡FIGHT!!!");

      //Esto retarda cada iteracion del bucle 3 milisegundos.
      Thread.sleep(3000);

      while (a < TAM && b < TAM) {

         //int turno = aleatorio.nextInt(2)+1;

         a += aleatorio.nextInt(3);
         b += aleatorio.nextInt(3);

//            if(turno == 1){
//                a++;
//            }else{
//                b++;
//            }

         limpiarPantalla();

         if (a<TAM && b<TAM) {
            System.out.println(dibujarCarrera(a));
            System.out.println(dibujarCarrera2(b));
            Thread.sleep(70);
         }

         if (a >= TAM){

            //\033[32m hace que el texto sea verde y \033[0m hace que vuelva al color original.
            System.out.println("\033[32m"+ "HA GANADO DAVID BIEN!! AHORA SOLO HAY UN DAVID!" + "\033[0m");
            break;

         } else if (b >= TAM) {

            System.out.println("\033[32m"+ "HA GANADO DAVID MAL!! AHORA SOLO HAY UN DAVID!" + "\033[0m");
            break;

         }
      }
   }

   public static String dibujarCarrera(int n1) {

      StringBuilder sb = new StringBuilder();

      sb.append("-".repeat(117)).append("\n");
      sb.append(" ".repeat(n1)).append("_______________  ").append(" ".repeat(100 - n1)).append("|\n");
      sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
      sb.append(" ".repeat(n1)).append("|    DAVID BIEN   |)").append(" ".repeat(TAM - n1)).append("|\n");
      sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
      sb.append("_".repeat(117));


      return sb.toString();
   }

   public static String dibujarCarrera2(int n2){

      StringBuilder sb = new StringBuilder();

      sb.append(" ".repeat(n2)).append("_______________  ").append(" ".repeat(100 - n2)).append("|\n");
      sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
      sb.append(" ".repeat(n2)).append("|     DAVID MAL   |)").append(" ".repeat(TAM - n2)).append("|\n");
      sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
      sb.append("_".repeat(117));


      return sb.toString();
   }

   public static void limpiarPantalla() {
      try {
         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } catch (Exception e) {
         System.out.print("\033[H\033[2J");
         System.out.flush();
      }
   }
}

```

## Entrega

- [x] **Código Fuente**: [Github](https://github.com/Csar-46/Java---DAW/tree/main/Extructuras/src/main/java/org/example/stringbuilder)
