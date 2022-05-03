/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author goku3
 */
public class Forma1 {
    //Atributos.
    private int Vpf1[], Du, n;
    
     //metodos.
    public Forma1(int tam)//Constructor 
    {
        
        n = tam;
        Du=n-1;
        Vpf1 = new int[n];               
        
    }   

    public int[] getVpf1() {
        return Vpf1;
    }

    public int getDu() {
        return Du;
    }

    public int getN() {
        return n;
    }

    public void setVpf1(int[] Vpf1) {
        this.Vpf1 = Vpf1;
    }

    public void setDu(int Du) {
        this.Du = Du;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getVpf1(int pos) {
        return Vpf1[pos]; 
    }
    
    public void setVpf1(int pos, int d) {
        Vpf1[pos] = d;
    }
    public  Forma1 ConvertirF1(String Vs[], Forma1 pf1)
    {     
        int i = 0 ,Grado=0, K=0 , Pos , h=0 ;   
        int Aux[]=new int[Vs.length];              
        for(int j=0;Vs[i]!=null;j++){
            Aux[j]=Integer.parseInt(Vs[i]);
            i++;            
        }
        /*System.out.println("");
        while(K <= Aux.length-1){            
            System.out.print("|"+Aux[K]);
            K++;
        }*/
        for(int p=1;p <=Aux.length-2 ;p+=2){
            if(Grado < Aux[p]){
                Grado=Aux[p];
            }            
        }                      
        pf1.setN(Grado+2);
        pf1.setDu(Grado+1);
        pf1.Vpf1 = new int [Grado+2];        
        pf1.Vpf1[0]=Grado;
        for(int j=0;Aux[j] !=0 ;j+=2){
            Pos=pf1.Du-Aux[j+1];
            pf1.Vpf1[Pos]=Aux[j];
        }      
        /*System.out.println("\n");
        while(h  <= getDu()){            
            System.out.print("|"+pf1.Vpf1[h]);
            h++;
        }        
        System.out.println("\n");*/
        return pf1;        
    }//Fin COnvertirF1
    
    public Forma1 redimensionar(Forma1 a)
    {
        Forma1 newVpf1;
        newVpf1 = new Forma1(a.Du);
        newVpf1.Du = a.Du;
        for (int i = 0; i <newVpf1.Du; i++)
        {
            newVpf1.Vpf1[i]= a.Vpf1[i];          
        }
        return newVpf1;
    }
    public void evaluar(Forma1 a)
    {
        
    }
    public Forma1 sumar(Forma1 a, Forma1 b, Forma1  c)
    {   
        int i=1, k=1,j=1, expA, expB;
        if (a.Du<b.Du)
        {
            c.Du=b.Du;
            c.Vpf1[0]=c.Du-1;
        }
        else
        {
            if (b.Du<a.Du)
            {
                c.Du=a.Du;
                c.Vpf1[0]=c.Du-1;
            }
        }
        while(i<c.Du)
        {   
            expA=a.Du-i;
            expB=b.Du-j;
            if(expA==expB)
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

                    c.Vpf1[k]=a.Vpf1[i];
                    i++;
                    k++;
                }
                else
                {
                    c.Vpf1[k]=b.Vpf1[j];
                    i++;
                    k++;
                }
            }
        }
        c.Ajustar(c);
        return c;
    }//Fin suma  
    
    public Forma1 Ajustar(Forma1 a)
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
    
    public void mostrar(Forma1 a)//Mostrar
    {
        
        for (int i = 0; i <= a.Du; i++)
        {
            System.out.print("|" + a.Vpf1[i]);
        }//Fin for     
    }//Fin mostrar
    
    
    
    public void evaluarPolinomiof1(Forma1 a, Forma1 b)
    {
        
    }
}//Fin class


