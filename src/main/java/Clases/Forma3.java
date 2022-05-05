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
    
    public void sumar(Forma3 a, Forma3 b)
    {
        Nodo p=a.head,q=b.head;
        end =null;
        int c =0;
        while(p!=null && q!=null)
        {
            if(p.getExp()==q.getExp())
            {
                c = p.getCoe() + q.getCoe();
                if (c!=0)
                {
                    insertarFinal(c,q.getExp());
                }
                p=p.getLiga();
                q=q.getLiga();
            }
            else
            {
                if (p.getExp()>q.getExp())
                {
                    insertarFinal(p.getCoe(),p.getExp());
                    p=p.getLiga();
                }
                else
                {
                    insertarFinal(q.getCoe(),q.getExp());
                    q=q.getLiga();
                }
            }
            
        }
        while (p!=null)
        {
            insertarFinal(p.getCoe(),p.getExp());
            p=p.getLiga();
        }
        while (q!=null)
        {
            insertarFinal(q.getCoe(),q.getExp());
            q=q.getLiga();
        }
    }//Fin sumar
}

