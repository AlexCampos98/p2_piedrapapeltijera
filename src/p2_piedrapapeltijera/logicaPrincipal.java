/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_piedrapapeltijera;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Campos Maestre
 */
public class logicaPrincipal
{

    public int vJugador;
    public int vMaquina;
    private int[][] reglas = {{3, 2},{0, 4},{1, 3},{4, 1},{2, 0}};    
    private String[] nombreN = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    public logicaPrincipal()
    {
        this.vJugador = 0;
        this.vMaquina = 0;
    }

    public void jugada(int opcionJugador)
    {
        int maquina = (int) Math.floor(Math.random() * (4 - 0 + 1) + 0);

        if (opcionJugador != maquina)
        {
            if (reglas[opcionJugador][0] == maquina)
            {
                victoriaJugador(opcionJugador, maquina);
            } else if (reglas[opcionJugador][1] == maquina)
            {
                victoriaJugador(opcionJugador, maquina);
            } else
            {
                victoriaMquina(opcionJugador, maquina);
            }
        } else
        {
            empate(opcionJugador, maquina);
        }
    }

    public int victoriaJugador(int jugador, int maquina)
    {
        JOptionPane.showMessageDialog(null, "El jugador ha ganado:\nJugador: " + nombreN[jugador] + " \nMaquina: " + nombreN[maquina], "Ganador", 1);

        return vJugador++;
    }

    public int victoriaMquina(int jugador, int maquina)
    {
        JOptionPane.showMessageDialog(null, "La maquina ha ganado:\nJugador: " + nombreN[jugador] + " \nMaquina: " + nombreN[maquina], "Ganador", 1);

        return vMaquina++;
    }
    
    public void empate(int jugador, int maquina)
    {
        JOptionPane.showMessageDialog(null, "Ha habido un empate:\nJugador: " + nombreN[jugador] + " \nMaquina: " + nombreN[maquina], "Ganador", 1);
    }

    public int getvJugador()
    {
        return vJugador;
    }

    public void setvJugador(int vJugador)
    {
        this.vJugador = vJugador;
    }

    public int getvMaquina()
    {
        return vMaquina;
    }

    public void setvMaquina(int vMaquina)
    {
        this.vMaquina = vMaquina;
    }
}