/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashSet;
import javax.swing.JOptionPane;

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
    
    public Forma1()//Sobrecarga de Constructor 
    {
        
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
    public  Forma1 ConvertirF1(String Vs[], Forma1 pf1)//convertir BUENO
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
        for(int p=1;p <=Aux.length-2 ;p+=2)
        {
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
    
    public Forma1 redimensionar(Forma1 a)//por probar
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
    
    public void evaluarPolinomiof1(Forma1 a)//Evaluar BUENO!!!
    {
        int i =1,x,exp  , resul=0;
        x = Integer.parseInt((JOptionPane.showInputDialog(null, "Ingrese un valor para x: ")));
        while(i<=a.getDu())
        {
            exp=a.getDu()-i;
            if(a.Vpf1[i]==1 && a.Vpf1[i]==-1)
            {
                resul+=x;
            }
            if (exp ==0)
            {
                resul = resul + a.Vpf1[i];
            }
            else 
            {      
                resul =(int) (resul +  (a.Vpf1[i]*(Math.pow(x,exp))));
                
            }
            i++;
        }
        System.out.println("\nEl resultado del polinomio evaluado es: \n"+resul);
    }//Evaluar polinomio
   
    public Forma1 sumar(Forma1 a, Forma1 b, Forma1  c)//MALO
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
        while(k<=c.Du)
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
    
    public Forma1 Ajustar(Forma1 a)//Por probar
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
        a.redimensionar(a);
        return a;
    }//Fin ajustar
    
    public void mostrar(Forma1 a)//Mostrar BUENO
    {      
        for (int i = 0; i <= a.getDu(); i++)
        {
            System.out.print("|" + a.getVpf1(i));
        }//Fin for     
    }//Fin mostrar
    
    public  void reconstruir()//BUENO
    {//Reconstruir polinomio en forma 1
        int Exp;        
        for (int i = 1; i <= getN() - 1; i++) {
            if (getVpf1(i) != 0) {
                if (getVpf1(i) < 0) {
                    if (getVpf1(i) < 0 && getVpf1(i) != -1) {
                        System.out.print(getVpf1(i));
                        Exp = getDu() - i;
                        if (Exp != 0) {
                            if (Exp == 1) {
                                System.out.print("x");
                            } else {
                                System.out.print("x^" + Exp);
                            }
                        } 
                    } else {
                        Exp = getDu() - i;
                        if (Exp != 0) {
                            if (Exp == 1) {
                                System.out.print("-x");
                            } else {
                                System.out.print("-x^" + Exp);
                            }
                        }else{
                            System.out.print(getVpf1(i));
                        }                  
                    }
                } else {
                    if (i != 1) {
                        if (getVpf1(i) > 0 && getVpf1(i) != 1) {
                            System.out.print("+" + getVpf1(i));
                            Exp = getDu() - i;
                            if (Exp != 0) {
                                if (Exp == 1) {
                                    System.out.print("x");
                                } else {
                                    System.out.print("x^" + Exp);
                                }//else
                            } /*else {
                                System.out.print("+" + getVpF1(i));
                            }*/
                        } else {
                            Exp = getDu() - i;
                            if (Exp != 0) {
                                if (Exp == 1) {
                                    System.out.print("x");
                                } else {
                                    System.out.print("x^" + Exp);
                                }//else
                            } else {
                                System.out.print("+" + getVpf1(i));
                            }
                        }
                    } else {
                        if (getVpf1(i) > 0 && getVpf1(i) != 1) {
                            System.out.print(getVpf1(i));
                            Exp = getDu() - i;
                            if (Exp != 0) {
                                if (Exp == 1) {
                                    System.out.print("x");
                                } else {
                                    System.out.print("x^" + Exp);
                                }//else
                            } else {
                                System.out.print("+" + getVpf1(i));
                            }
                        } else {
                            Exp = getDu() - i;
                            if (Exp != 0) {
                                if (Exp == 1) {
                                    System.out.print("x");
                                } else {
                                    System.out.print("x^" + Exp);
                                }//else
                            } else {
                                System.out.print("+" + getVpf1(i));
                            }
                        }
                    }
                }//else
            }
        }//fin for
        System.out.println("\n");
    }//fin reconstruir.            
    public void insertarTermino(int coe, int exp)//Por probar
    {
        Forma1 aux;
        int  i=1, expA=0, x=0, pos=0;
        x=exp-getVpf1(0);
        //2x^2+x+1
        if(exp > Vpf1[0])
        {
            aux = new Forma1 (x+getN()); //+1
            aux.Vpf1[0]=exp;
            aux.Vpf1[1]=coe;
            while(i<=getDu())
            {
                expA=getDu()-i;
                pos=getDu()-expA+x;
                aux.Vpf1[pos]=getVpf1(i);
                i++;
            }
        }
        else
        {
            if(exp==Vpf1[0])
            {
                //buscar y sumar
                while(i<=getDu())
                {
                    expA=getDu()-i;
                    if(expA==exp)
                    {
                        setVpf1(i, getVpf1(i)+coe);
                    }
                    i++;
                }
            }
        }
    }//Fin Insertar termino
    
    public void borrarTermino(int coe, int exp)
    {
        
    }
    public void multiplicacionF1(Forma1 a, Forma1 b)//Mala
    {        
        int pos;                 
        setN(a.getN()+ b.getN()-2);
        setVpf1(0,a.getVpf1(0) + b.getVpf1(0));       
        
        for(int i = 1; i <= a.getDu();i++){
            for(int j = 1; j <= b.getDu();j++){
                pos= getDu()-((a.getDu()-i)+(b.getDu()-j));
                setVpf1(pos, getVpf1(pos)+(a.getVpf1(i)*b.getVpf1(j)));                
            }
        }        
    }//FIn multiplicacion

    private void pow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}//Fin class










