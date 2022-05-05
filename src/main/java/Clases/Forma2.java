/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author goku3
 */
public class Forma2 {
    //Atributos.
    private int Vpf2 [], Du, n;
    
     //metodos.
    public Forma2(int tam)//Constructor 
    {
        n = tam;
        Du=n-1;
        Vpf2 = new int[n];               
        
    }   

    public int[] getVpf1() {
        return Vpf2;
    }

    public int getDu() {
        return Du;
    }

    public int getN() {
        return n;
    }

    public void setVpf1(int[] Vpf1) {
        this.Vpf2 = Vpf1;
    }

    public void setDu(int Du) {
        this.Du = Du;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getVpf1(int pos) {
        return Vpf2[pos];
    }
    
    public void setVpf1(int pos, int d) {
        Vpf2[pos] = d;
    }
    
    public Forma2 sumar(Forma2 a, Forma2 b, Forma2  c)
    {   
        int i=0, k=0,j=0, expA, expB;
        while(i<c.Du)
        {   
            expA=a.Du-i;
            expB=b.Du-j;
            if(expA==expB  && (i!=0 && j!=0))
            {
                c.Vpf2[k]=a.Vpf2[i]+b.Vpf2[j];
                i++;
                j++;
                k++;
            }
            else
            {
                if(expA>expB)
                {
                    c.Vpf2[0]= a.Vpf2[0];
                    c.Vpf2[k]=a.Vpf2[i];
                    i++;
                    k++;
                }
                else
                {
                    c.Vpf2[0]= b.Vpf2[0];
                    c.Vpf2[k]=b.Vpf2[j];
                    i++;
                    k++;
                }
            }
        }
        //Ajustar(c);
        return c;
    }//Fin suma  
    public Forma2 Ajustar(Forma2 a)
    {
        int cont=0, i=1;
        while(i<=a.Du && a.Vpf2[i]==0)
        {
            cont++;
            i++;       
        }
        while(i>=a.Du)
        {
            a.Vpf2[i-cont]=a.Vpf2[i];
            i++;    
        }
        a.Vpf2[0]=a.Vpf2[0]-cont;
        Du=a.Vpf2[0]+1;
        return a;
    }//Fin ajustar
}//Fin class

