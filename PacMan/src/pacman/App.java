/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception{
        int rowCount =21;
        int columnCount =19;
        int tileSize= 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;
        
        JFrame frame = new JFrame("Pac Man");
       // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PacMan pacmanGame=  new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);
    }
    
}