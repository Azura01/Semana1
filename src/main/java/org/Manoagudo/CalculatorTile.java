package org.Manoagudo;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorTile {

    public static void CalculatorTileMethod() {


        Scanner scanner = new Scanner(System.in);

        // Se lee la entrada
        System.out.println("Insert the size of the tiles");
        int X = scanner.nextInt(); // Tamaño de las baldosas
        System.out.println("Insert the width of the rectangule");
        int N = scanner.nextInt(); // Dimensiones del área rectangular (ancho)
        System.out.println("Insert the lenght of the rectangule");
        int M = scanner.nextInt(); // Dimensiones del área rectangular (largo)

        // Se calcula el área total a cubrir
        int areaTotal = N * M;

        // Se calcula el área de cada baldosa
        int areaBaldosa = X * X;

        // Se calcula el número mínimo de baldosas necesarias
        int numBaldosas = (int) Math.ceil((double) areaTotal / areaBaldosa);

        // Se imprime el resultado
        System.out.println("The number of tiles to cover it is " + numBaldosas);

        // Se cierra el objeto Scanner
        scanner.close();
    }
}


