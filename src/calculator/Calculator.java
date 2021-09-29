/*
*nom : KITCH Naomi
*groupe : TDA
*rôle du programme : exercices TP0
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author naomi
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:\n" +
"1) add\n" +
"2) substract\n" +
"3) multiply\n" +
"4) divide\n" +
"5) modulo");
        
        Scanner sc;
        sc = new Scanner(System.in);
        int operateur;
        operateur = sc.nextInt();
        
        while (operateur <1 || operateur>5) {
            System.out.println("ERREUR, veuillez saisir une valeur comprise entre 1 et 5"); 
            operateur = sc.nextInt();
        }
            
                
    System.out.println("Veuillez saisir une valeur");
    int operande1;
    operande1 = sc.nextInt();
    
    System.out.println("Veuillez saisir une  autre valeur");
    int operande2;
    operande2 = sc.nextInt();
    
    int result = 0;
    
        switch (operateur) {
            case 1:
                result=operande1+operande2;
                break;
            case 2:
                result=operande1-operande2;
                break;
            case 3:
                result=operande1*operande2;
                break;
            case 4:
                result=operande1/operande2;
                break;
            case 5:
                result=operande1%operande2;
                break;
            default:
                break;
        }
    
        /* Autre façon de faire
        
        if (operateur==1) {
        result=operande1+operande2;
    }
    else if (operateur==2) {
        result=operande1-operande2;
    }
    else if (operateur==3){
        result=operande1*operande2;
    }
    else if (operateur==4) {
        result=operande1/operande2;
    }
    else if (operateur==5) {
        result=operande1%operande2;
    }
*/
    
    System.out.println("Le résultat est : "+result);
    }

    private static void While(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
