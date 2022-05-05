package Main;

import Clases.Forma1;
import Clases.Forma2;
import Clases.Forma3;
import javax.swing.JOptionPane;

public class PolinomioAp3 {

    public static void main(String[] args) 
    {
        Forma1 Pf1 = new Forma1(20);
        Forma1 Pf1_2 = new Forma1(20);
        Forma1 Pf1_3 = new Forma1(20);
        
        Forma2 Pf2 ;
        Forma3 Pf3;
        String [] Vs=ManejoString();
        int opc = 0, nTerminos=0,MExp=0, coef=0, expo=0;
        int [] Vi = new int[Vs.length];
        for (int i = 0; i < Vi.length; i++) {
            Vi[i]=0;
        }
        do 
        {   
            coef =0;
            expo=0;
            opc = menu();
             switch (opc) 
             {
                case 1://Forma 1
                    Pf1.ConvertirF1(Vs, Pf1);
                    Pf1.redimensionar(Pf1);
                    //2x^4-2x^5+x-3
                    opc=menuFormas();
                    switch (opc)//operaciones forma 1 the fredi´s favorite structuc 
                    {
                        case 1://Evaluar polinomio  
                            Pf1.evaluarPolinomiof1(Pf1);
                            break;
                        case 2://Sumar 2 polinomios
                            Vs=ManejoString();
                            Pf1_2.ConvertirF1(Vs, Pf1_2);
                            Pf1_2.redimensionar(Pf1_2);
                            System.out.println("\nPolinomio f1 2");
                            Pf1_2.mostrar(Pf1_2);
                            Pf1_3.sumar(Pf1, Pf1_2, Pf1_3);
                            System.out.println("Suma: ");
                            Pf1_3.mostrar(Pf1_3);
                            break;
                        case 3://Multiplicar 2 terminos  
                            Vs=ManejoString();
                            Pf1_2.ConvertirF1(Vs, Pf1_2);
                            System.out.println("\nPolinomio f1 2");
                            Pf1_2.mostrar(Pf1_2);
                            
                            Pf1_3.multiplicacionF1(Pf1, Pf1_2);
                            System.out.println("Multiplicacion: ");
                            Pf1_3.mostrar(Pf1_3);
                            break;
                        case 4://mostrar.
                                System.out.println("Impresion forma1:");
                                Pf1.mostrar(Pf1);
                            break;
                        case 5://Reconstruir BUENO
                                System.out.println("\nReconstruccion: \n");
                                Pf1.reconstruir();                            
                            break;
                        case 6://Insertar
                                coef=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Coeficiente: "));
                                expo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
                                Pf1.insertarTermino(coef,expo);
                            break;
                        case 7://borrar termino
                                coef=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Coeficiente: "));
                                expo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
                                Pf1.borrarTermino(coef, expo);
                            break;
                        case 8://Volver                     
                            break;
                        case 9://Salir                  
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null,"Opcion incorrecta.");
                    }
                    opc=0;
                    break;
                case 2://Forma 2
                    //nTerminos= Vs.length/2;
                    //Pf2 = new Forma2(nTerminos*2);
                    opc= menuFormas();
                    switch (opc)//operaciones forma 1 the fradi´s favorite structuc 
                    {
                        case 1://Evaluar polinomio                           
                            break;
                        case 2://Sumar 2 polinomios
                            Vs=ManejoString();
                            Pf1_2.ConvertirF1(Vs, Pf1_2);
                            Pf1_2.redimensionar(Pf1_2);
                            Pf1_3.sumar(Pf1, Pf1_2, Pf1_3);
                            System.out.println("Suma: ");
                            Pf1_3.mostrar(Pf1_3);
                            break;
                        case 3://Multiplicar 2 terminos                     
                            break;
                        case 4:////mostrar.
                                System.out.println("Impresion forma1:");
                                Pf1.mostrar(Pf1);
                            break;
                        case 5:
                            
                            break;
                        case 6://Reconstruir /mostrar en string original                
                            break;
                        case 7://Insertar/borrar termino                        
                            break;
                        case 8://Volver                       
                            break;

                        default:
                            JOptionPane.showMessageDialog(null,"Opcion incorrecta.");
                    }
                    break;
                case 3://Forma 3
                    opc= menuFormas();
                    switch (opc)//operaciones forma 1 the fradi´s favorite structuc 
                    {
                        case 1:                           
                            break;
                        case 2:                           
                            break;
                        case 3:                           
                            break;
                        case 4:                           
                            break;
                        case 5:                           
                            break;
                        case 6:                           
                            break;
                        case 7:                           
                            break;
                        case 8:                           
                            break;

                            
                        default:
                            JOptionPane.showMessageDialog(null,"Opcion incorrecta.");
                    }
                    break;
                case 4://Salir
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar mi programa!");
                    break;
                default:
                     JOptionPane.showMessageDialog(null,"Opcion incorrecta.");
                    break;
            }//Fin case menu
        } while (opc != 4);//Fin do while
    }//Fin Main

    public static int menu()//Menu
    {
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
    
    public static int menuFormas()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("MENU FORMA 1\n"
                + "1. Evaluar Polinomio\n"
                + "2. Sumar 2 polinomios\n"
                + "3. Multiplicar 2 Polinomio\n"
                + "4. Mostrar forma\n"
                + "5. Reconstruir\n"
                + "6. Insertar/borrar termino\n"
                + "7. Volver\n"
                + "8. Salir\n"
                + "Ingrese una opcion: "));
    }

    public static String[] ManejoString() //MAnejo string.
    {
        
        String sCadena;
        sCadena = JOptionPane.showInputDialog("Ingrese un polinomio: ");
        System.out.println(sCadena);
        String s = "";
        char[] Vc = sCadena.toCharArray();
        String[] Vs = new String[Vc.length+1];
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
        for (int i = 0; i < Vc.length; i++) //impresion
        {
            System.out.print("|" + Vs[i]);
        }//Fin for        
        return Vs;
    }//Fin ManejoString
}//Fin Class
