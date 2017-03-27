/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioevaluaciontema4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Antonio
 */
public class Sudoku 
{
    //variables privadas de la clase
    private ArrayList<ArrayList<Integer>> sudo;
    private Random aleatorio;
    
    /**
     * constructor por defecto de la clase sudoku
     */
    public Sudoku()
    {
        sudo = new ArrayList<>();
    }
    
    
    public void inicializar()
    {
        sudo = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) 
        {
            ArrayList<Integer> huecos = new ArrayList<>();
            for (int j = 0; j < 9; j++) 
            {
                huecos.add(0);
            }
            sudo.add(huecos);
        }
        aleatorio = new Random();
        int contador= 0;
        while (contador<24)
        {
            contador++;
            int px = aleatorio.nextInt(9-1)+1;
            int py = aleatorio.nextInt(9-1)+1;
            int num_aleatorio = aleatorio.nextInt(9-1)+1;
            
            
            
        }
    }
    
    @Override
    public String toString()
    {
        String resultadoFinal = "";
        for (int i = 0; i < sudo.size(); i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                int numero = sudo.get(i).get(j);
                resultadoFinal += numero+"";
            }
           resultadoFinal +="\n"; 
        }
        return resultadoFinal;
    }
    
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException
    {
        if (puedoInsertar(fila, columna, elemento)== true)
        {
            sudo.get(fila-1).set(columna-1, elemento);
        }
        else
            System.out.println("Error modificando elemento");
    }
    
    public void vaciarElemento (int fila, int columna)
    {
        sudo.get(fila-1).remove(columna-1);
    }
    
    private boolean comprobarFila(int columna, int elemento)
    {
        boolean resultado = true;
        
        return resultado;
    }
    
    private boolean comprobarCuadrante(int fila, int columna, int elemento)
    {
        boolean resultado = true;
        
        return resultado;
    }
    
    private boolean puedoInsertar(int fila, int columna, int elemento)
    {
        boolean resultado = false;
        
        return resultado;
    }
}
