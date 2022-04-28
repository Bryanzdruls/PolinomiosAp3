package Main;

import java.util.Scanner;

public class PolinomioAp3 {

    public static void main(String[] args)
    {
        Scanner Leer = new Scanner(System.in);
        String sCadena = "-2x+5+8x^2-2", s = "";
        char[] Vc = sCadena.toCharArray();
        String[] Vs = new String[Vc.length];
        int j = 0;

        for (int i = 0; i < Vc.length; i++) {
            System.out.print("|" + Vc[i]);
        }

        for (int i = 0; i < Vc.length; i++) {
            if (Vc[i] == '-' || Character.isDigit(Vc[i]))
            {   
                if(i<Vc.length-1)
                {
                    if (Character.isDigit(Vc[i]))
                    {
                        s += Vc[i];
                        if (Vc[i + 1] == '-'  || Vc[i + 1] == '+')
                        {
                            Vs[j] = s;
                            j++;
                            Vs[j] = "0";
                            j++;
                            s = "";
                        }
                    }
                    else
                    {
                        s += Vc[i];
                    }
                }
                else//Termino independiente sin elevar
                {
                    s += Vc[i];                  
                    Vs[j] = s;
                    j++;
                    s = "";
                    s+= "0";
                    Vs[j] = s;
                    j++;
                    s = "";
                }
            }
            else
            {
                if(i<Vc.length-1)
                {
                    if (Vc[i] == 'x')
                    {
                      if (s.equals(""))
                      {
                        Vs[j]="1";
                        j++;
                      }
                      else
                      {
                        if(s.equals("-"))
                        {
                          s += "1";
                          Vs[j] = s;                      
                          j++;
                          s="";
                        }
                        else
                        {
                          Vs[j] = s;
                          j++;
                          s = "";
                        }
                      }                  
                      if (Vc[i + 1] == '^')
                      {
                          i += 2;
                          s += Vc[i];
                          Vs[j] = s;
                          j++;
                          s = "";
                      }
                      else
                      {
                        Vs[j] = "1";
                        j++;
                      }
                    }
                }
                else//x independiente
                {
                    s+= "1";                  
                    Vs[j] = s;
                    j++;
                    s = "";
                    s+= "0";
                    Vs[j] = s;
                    j++;
                    s = "";
                }
          }
        }//Fin si
        System.out.println("");
        for (int i = 0; i < Vc.length; i++) {
            System.out.print("|" + Vs[i]);
        }//Fin for
  }//Fin Main
}//Fin Class
