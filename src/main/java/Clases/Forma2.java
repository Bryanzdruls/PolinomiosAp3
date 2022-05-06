/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

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
    public Forma2()//Sobrecarga de Constructor 
    {
        Du=n-1;
        Vpf2 = new int[n];                     
    } 

    public int[] getVpf2() {
        return Vpf2;
    }

    public int getDu() {
        return Du;
    }

    public int getN() {
        return n;
    }

    public void setVpf2(int[] Vpf1) {
        this.Vpf2 = Vpf1;
    }

    public void setDu(int Du) {
        this.Du = Du;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getVpf2(int pos) {
        return Vpf2[pos];
    }
    
    public void setVpf2(int pos, int d) {
        Vpf2[pos] = d;
    }
    
    public Forma2 convertirForma2(String Vs[], Forma2 a, int n)
    {
        int i=0, j=0,s=0, k=1;
        int aux[]=new int [n*2];
        System.out.println("tamaño del vs: " + Vs.length);
        System.out.println("tamaño del aux: "+ aux.length);
        int exp[]=new int [aux.length/2];
        System.out.println("numero de terminos es: "+n);
        a.setVpf2(0, n);
        for(j=0;Vs[i]!=null;j++){
            aux[j]=Integer.parseInt(Vs[i]);
            i++;
        }
        
        i=1; j=0;
        while(i<aux.length)
        {
            exp[j]=aux[i];
            j++;
            i=i+2;
        }
        i=0; j=0;
        for (i=0; i<aux.length; i++) //se ordena el vector aux
        {
            for (j=i+1; j<exp.length; j++)
            {
             if(exp[i]<exp[j])
             {
                s= exp[i];
                exp[i] = exp[j];
                exp[j] = s;
             }
           }
        }
        i=0;j=1;
        while(i<exp.length)
        {
            if(exp[i] == aux[j])
            {
                a.setVpf2(k, aux[j-1]);
                a.setVpf2(k+1, aux[j]);
                k=k+2;
                i++;
            }
            j=j+2;
        }
        return a;
    }
    
    public void evaluar(Forma2 a)
    {
        int resul=0, i=0, x=0, exp;
        x=Integer.parseInt((JOptionPane.showInputDialog(null, "Ingrese un valor para x: ")));
        while (i<=a.getDu()) 
        {   
            exp=a.getDu()-i;
            if(a.getVpf2(i)==1 &&a.getVpf2(i)==-1)
            {
                resul+=x;
            }       
            if(exp==0)
            {
                resul+= a.getVpf2(i);
            }
            else
            {
                resul+=((Math.pow(x,a.getVpf2(i))*a.getVpf2(i)));
            }
            
            i++;
        }
        System.out.println("El resultado es: ");
        System.out.print(resul);
    }//Fin evaluar 
    /*    public Forma2 sumar(Forma2 a, Forma2 b, Forma2  c)
    {
    
    }//Fin suma
    public Forma2 multiplicacion(Forma2 a, Forma2 b, Forma2 c)
    {
    
    }*/
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
    
    public void mostrar(Forma2 a)//Mostrar BUENO
    {      
        for (int i = 0; i <= a.getDu(); i++)
        {
            System.out.print("|" + a.getVpf2(i));
        }//Fin for     
    }//Fin mostrar
}//Fin class

