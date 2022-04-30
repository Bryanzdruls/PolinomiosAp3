/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author goku3
 */
public class Forma3 {
    //Atributo
    Nodo head, end;
    //Metodos
    
    public Forma3()//constructor
    {
        head=null;
        end=null;
    }//Fin constructor
    public void insertarFinal(int c, int e)
    {
        //Nodo x = new Nodo(c,e);
        Nodo x = new Nodo();
        x.setCoe(c);
        x.setExp(e);
        if(head == null)
        {
            head = x;
            end=x;
        }
        else
        {
            end.setLiga(x);
            end = x;
        }
    }//Fin insertar final
}

