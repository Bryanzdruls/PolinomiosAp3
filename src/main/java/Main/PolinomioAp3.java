package Main;

import Clases.Forma1;
import Clases.Forma2;
import Clases.Forma3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PolinomioAp3 {

    public static void main(String[] args) {
        Forma1 Pf1 = new Forma1(5);
        Forma2 Pf2 = new Forma2(0);
        Forma3 Pf3 = new Forma3();
        ManejoString();
        int opc = 0;
        do {
            opc = menu();
             switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Funciona");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (opc != 4);
    }//Fin Main

    public static int menu() {
        //Opcion facil
        /*int opc= Integer.parseInt(JOptionPane.showInputDialog(null,"+++MENU+++"
        +"1. Ingresar a Forma 1"
        + "2. Ingresar a Forma 2"
        + "Ingresar a Forma 3"
        +"4.Salir"));
        System.out.println("");
        return opc;*/

        //Opcion chuky
        return Integer.parseInt(JOptionPane.showInputDialog("+++MENU+++\n"
                + "1. Ingresar a Forma 1\n"
                + "2. Ingresar a Forma 2\n"
                + "Ingresar a Forma 3\n"
                + "4.Salir\n" + "Ingrese una opcion: "));
    }//Fin Menu

    public static void ManejoString() {
        Scanner Leer = new Scanner(System.in);
        String sCadena;
        sCadena = JOptionPane.showInputDialog("Ingrese un polinomio: ");
        System.out.println(sCadena);
        String s = "";
        char[] Vc = sCadena.toCharArray();
        String[] Vs = new String[Vc.length];
        int j = 0;
        for (int i = 0; i < Vc.length; i++) 
        {
            if (Vc[i] == '-' || Character.isDigit(Vc[i])) 
            {
                if (Character.isDigit(Vc[i])) 
                {
                    s += Vc[i];
                    if (i < Vc.length - 1) 
                    {
                        if (Vc[i + 1] == '-' || Vc[i + 1] == '+') 
                        {
                            Vs[j] = s;
                            j++;
                            Vs[j] = "0";
                            j++;
                            s = "";
                        }
                    } else 
                    {
                        Vs[j] = s;
                        j++;
                        s = "";
                        if (i + 1 == Vc.length) 
                        {
                            Vs[j] = "0";
                        }

                    }

                } else 
                {
                    s += Vc[i];
                }
            } else 
            {
                if (Vc[i] == 'x') 
                {
                    if (s.equals("")) 
                    {
                        Vs[j] = "1";
                        j++;
                    } else
                    {
                        if (s.equals("-")) 
                        {
                            s += "1";
                            Vs[j] = s;
                            j++;
                            s = "";
                        } else
                        {
                            
                            Vs[j] = s;
                            j++;
                            s = "";
                        }
                    }
                    if (i <= Vc.length - 2) 
                    {
                        if (Vc[i + 1] == '^') 
                        {
                            i += 2;
                            s += Vc[i];
                            Vs[j] = s;
                            j++;
                            s = "";
                        } else 
                        {
                            Vs[j] = "1";
                            j++;
                        }
                    } else
                    {
                        Vs[j] = "1";
                        j++;
                    }//Fin else
                }//fin if
            }//Fin else
        }//Fin for
        System.out.println("");
        for (int i = 0; i < Vc.length; i++) {
            System.out.print("|" + Vs[i]);
        }//Fin for        
    }//Fin ManejoString
}//Fin Class
