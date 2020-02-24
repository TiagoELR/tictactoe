package com.mycompany.tictactoe;

import com.mycompany.tictactoe.core.Game;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Game g = new Game();
            g.play();
        } catch (IOException ex) {
            System.out.println("Entrada invalida");
        }

    }
}
