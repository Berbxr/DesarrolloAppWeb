import java.util.Scanner;

    public class romanos {
        public static String numeros_Romanos(int numero){
            int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] simbolos= {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            String resultado = "";
            int i = 0;

            while (numero > 0) {
                if (numero >= valores[i]){
                    resultado += simbolos[i];
                    numero -= valores[i];
                } else {
                    i++;
                }
            }
            return resultado;
        }

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);

            System.out.println("Escribe un numero romano");
            int num = leer.nextInt();

            if (num >= 1 && num <= 3000000){
                System.out.println("tu numero en romano es: " + numeros_Romanos(num));
            } else{
                System.out.println("no pongas un numero tan grande porfavor vas a tronar la pc");
            }
            leer.close();
        }
    }