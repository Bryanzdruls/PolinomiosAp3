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
    
    public  void InsertarFinal(int c, int e, Forma3 a)
    {
        //Nodo x = new Nodo(c,e);
       Nodo x = new Nodo(c, e);

        if (head == null) {
            setHead(x);
            setEnd(x);
        } else {
            Nodo p = new Nodo();
            Nodo Aux = new Nodo();
            p = getHead();
            while (p.getLiga() != null && p.getExp() > e) {
                Aux = p;
                p = p.getLiga();
            }
            if (p.getExp() == e) {
                p.setCoe(c + p.getCoe());
            } else if (p == getHead()) {
                if (e < p.getExp()) {
                    p.setLiga(x);
                    end = x;
                } else {
                    x.setLiga(getHead());
                    setHead(x);
                }
            }//cierre del if
            else if (p == end) {
                if (e > p.getExp()) {
                    Aux.setLiga(x);
                    x.setLiga(p);
                }//cierre del if
                else {
                    p.setLiga(x);
                    end = x;
                }
            }//cierre del else
            else {
                Aux.setLiga(x);
                x.setLiga(p);
            }
        }
                     
    }//Fin insertar ordenado
    public void sumar(Forma3 a, Forma3 b)//Sumar BUENO
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
        String s="";
        while(p!=null)
        {
            if ((p.getCoe()==1 && p.getExp() ==1)||(p.getCoe()==-1 && p.getExp() ==1))
            {//para las x independientes
                if ((p.getCoe()==1 && p.getExp() ==1)&& p.getLiga()!=null) 
                {
                    s+="x";
                }
                else if (p.getCoe()==-1 && p.getExp() ==1)
                {//para las -x independientes
                    s+= "-x";
                }
                else
                {
                    if(p.getLiga()==null)
                    {
                        if (p.getCoe() == 1) {//positivo x fin
                            s+="+x";
                        }
                        else if (p.getCoe()==-1) {//negativo x fin
                            s+="-x";
                        }
                    }//fin x final
                }
            }
            if ((p.getCoe()!= 0 && p.getExp()==0) && p.getLiga()==null) {
                if(p.getCoe()>0)//positivo independiente fin
                {
                    s+="+"+p.getCoe();
                }
                else if (p.getCoe()<0) //negativo independiente fin
                {
                    s+="-"+p.getCoe();
                }
            }
            else
            {
                if ((p.getCoe()!= 0 && p.getExp()!=0)&&p.getLiga()!=null)
                {
                    if (p.getCoe()==1) {
                        s+="+x^"+p.getExp();//x positiva
                    }
                    else if (p.getCoe() == -1) {
                        s+="-x^"+p.getExp();//x negativa
                    }
                    else //-33x^7+218x^2+3x^4+x. -x+37x^4+101-218x^2-x^7
                    {
                        if ((p.getCoe() <0))//Termino normal 
                        {
                            s+=p.getCoe()+"x^"+p.getExp();//negativo
                        }
                        else if((p.getCoe()>0 && p!=head))
                        {
                            s+="+"+p.getCoe()+"x^"+p.getExp();//positivo
                        }
                        else if ((p.getCoe()>0 && p!=head)) {
                            s+=p.getCoe()+"x^"+p.getExp();//posivito al principio
                        }
                    }    
                }
                else
                {
                    if (p.getCoe()!=0 && p.getExp()==0 && p.getLiga()!=null)
                    {//termino independiente
                        if (p.getCoe() <0)
                        {//negativo
                            s+="-"+p.getCoe();
                        }
                        else if(p.getCoe()>0 && p!=head)
                        {
                            s+="+"+p.getCoe();//termino independiente por ahi
                        }
                        else if (p.getCoe()>0 && p!=head) {
                            s+=p.getCoe();//Termino independiente al principio
                        }
                    }                
                }//fin else
            }//fin else        

        p=p.getLiga();
        }//Fin while
        System.out.println("\n Polinomio Reconstruido: ");
        
        System.out.println(s);
    }//Fin reconstruir
}//Fin class
    
    


