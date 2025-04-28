/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem5colecciones;
/**
 * @Elizabeth Mitma
 * @Bianca Orihuela
 * @Angie Casas
 * @Enzo Giron
 * @Brayam Pari
 */
import java.util.HashMap;
import java.util.Map;
public class Sem5Colecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {1, 5, 3, 4, 5, 2, 9};

        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int num : numeros) {
            mapa.put(num, mapa.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("====================================================");
                System.out.println("Numero: " + entry.getKey() + " - Repetido: " + entry.getValue() + " Veces");
            }
        }
    } 
}
