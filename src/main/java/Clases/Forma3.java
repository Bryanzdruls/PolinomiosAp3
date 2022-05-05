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
    /*public void InsertarOrdenado(int c, int e)
    {
            int sw = 0;
            Nodo p = head,  q = head,  fin = head;
            Nodo x = new Nodo();
            x.setCoe(c);
            x.setExp(e);
            if (head == null)
            {
                head = x;
                head.setLiga(x);
            }
            else
            {
                    do
                    {
                            fin = head.getLiga();
                            if (fin.GetDato() < d && sw == 0)
                            {
                                    sw = 1;
                                    x->Setld(head);
                                    x->Setli(fin);
                                    head->Setli(x);
                                    fin->Setld(x);
                            }
                            if (d <= p->GetDato() && sw == 0)
                            {
                                    sw = 1;
                                    if (p == head)
                                    {
                                            q = head->Getli();
                                            x->Setli(q);
                                            x->Setld(head);
                                            head->Setli(x);
                                            head = x;
                                            q->Setld(head);
                                            p = q;
                                            cout << "¡Se inserto el dato correctamente!" << endl;
                                    }
                                    else
                                    {
                                            p = p->Getli();
                                            p->Setld(x);
                                            x->Setli(p);
                                            x->Setld(q);
                                            q->Setli(x);
                                            p = q;
                                            cout << "¡¡Se inserto el dato correctamente!!" << endl;
                                    }
                            }
                            p = p->Getld();
                    } while (p != head);
            }
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
                        insertar(c,q.getExp());
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
        public void mostrar(Forma3 a)//Mostrar
        {
            Nodo p=a.head;
            while (p.getLiga()!=null)
            {            
                System.out.print("|"+p.getCoe()+"|"+p.getExp()+"|");   
                p=p.getLiga();
            }     
        }//Fin Mostrar

        public void reconstruir(Forma3 a)//Reconstruir
        {
            Nodo p=a.head;      
        }*/
    }//Fin class
    
    


