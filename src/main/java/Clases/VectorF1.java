/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author goku3
 */
public class VectorF1 {
    //Atributos.
    private int Vpf1[], Du, n;
    
     //metodos.
    public VectorF1(int tam) 
    {
        n = tam;
        Du=n-1;
        Vpf1 = new int[n];               
    }   
    
    public VectorF1 sumar(VectorF1 a, VectorF1 b, VectorF1  c)
    {   
        int i=0, k=0,j=0, expA, expB;
        while(i<c.Du)
        {   
            expA=a.Du-i;
            expB=b.Du-j;
            if(expA==expB  && (i!=0 && j!=0))
            {
                c.Vpf1[k]=a.Vpf1[i]+b.Vpf1[j];
                i++;
                j++;
                k++;
            }
            else
            {
                if(expA>expB)
                {
                    c.Vpf1[0]= a.Vpf1[0];
                    c.Vpf1[k]=a.Vpf1[i];
                    i++;
                    k++;
                }
                else
                {
                    c.Vpf1[0]= b.Vpf1[0];
                    c.Vpf1[k]=b.Vpf1[j];
                    i++;
                    k++;
                }
            }
        }
        //Ajustar(c);
        return c;
    }//Fin suma
    
    
    public VectorF1 Ajustar(VectorF1 a)
    {
        int cont=0, i=1;
        while(i<=a.Du && a.Vpf1[i]==0)
        {
            cont++;
            i++;       
        }
        while(i>=a.Du)
        {
            a.Vpf1[i-cont]=a.Vpf1[i];
            i++;    
        }
        a.Vpf1[0]=a.Vpf1[0]-cont;
        Du=a.Vpf1[0]+1;
        return a;
    }//Fin ajustar
}//Fin class

