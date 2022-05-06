/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author goku3
 */
public class Forma3 
{
    //Atributo
    Nodo head, end;
    //Metodos
    
    public Forma3()//constructor
    {
        head=null;
        end=null;
    }//Fin constructor

    public void setHead(Nodo head) {
        this.head = head;
    }

    public void setEnd(Nodo end) {
        this.end = end;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getEnd() {
        return end;
    }
    
    public  Forma3 InsertarFinal(int c, int e, Forma3 a)
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
        return a;
    }//Fin insertar ordenado
        public void sumar(Forma3 a, Forma3 b)//Sumar
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
                        InsertarFinal(c,q.getExp(),this);
                    }
                    p=p.getLiga();
                    q=q.getLiga();
                }
                else
                {
                    if (p.getExp()>q.getExp())
                    {
                        InsertarFinal(p.getCoe(),p.getExp(),this);
                        p=p.getLiga();
                    }
                    else
                    {
                        InsertarFinal(q.getCoe(),q.getExp(),this);
                        q=q.getLiga();
                    }
                }
            }
            while (p!=null)
            {
                InsertarFinal(p.getCoe(),p.getExp(),this);
                p=p.getLiga();
            }
            while (q!=null)
            {
                InsertarFinal(q.getCoe(),q.getExp(),this);
                q=q.getLiga();
            }
        }//Fin sumar
        public void mostrar(Forma3 a)//Mostrar
        {
            Nodo p=a.head;
            while (p!=null)
            {            
                System.out.print("|"+p.getCoe()+"|"+p.getExp()+"|");   
                p=p.getLiga();
            }     
        }//Fin Mostrar

        public void reconstruir(Forma3 a)//Reconstruir
        {
            Nodo p=a.head;      
        }
    }//Fin class
    
    


