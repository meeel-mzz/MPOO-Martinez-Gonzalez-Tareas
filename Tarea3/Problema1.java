import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            System.out.println(1);
            return;
        }
        
        String input = sc.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println(1);
            return;
        }

        // Limpiar corchetes y espacios en blanco si existen
        input = input.replace("[", "").replace("]", "").trim();
        
        // Separar por comas o espacios
        String[] partes = input.split("[,\\s]+");
        int[] monedas = new int[partes.length];
        int count = 0;

        for (String p : partes) {
            if (!p.trim().isEmpty()) {
                monedas[count++] = Integer.parseInt(p.trim());
            }
        }

        monedas = Arrays.copyOf(monedas, count);
        Arrays.sort(monedas);

        long monedaMinima = 1;
        for (int m : monedas) {
            if (m > monedaMinima) {
                break;
            }
            monedaMinima += m;
        }

        System.out.println(monedaMinima);
    }
}
