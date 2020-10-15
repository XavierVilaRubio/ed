/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Sergio Sayago
 */
public class Tokenizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testCase_1(); // aquest joc de proves hauria de ser OK
        testCase_2(); // joc de proves incorrecte; expressió mal formada
        testCase_3(); // joc de proves incorrecte; expressió comença amb un closing
    }             
    
    public static void testCase_1 ()
    {
        ArrayList<Symbol> simbols = new ArrayList<Symbol> ();
        
        OpenParentesis OpenParentesis = new OpenParentesis ();
        ClosingParentesis closeParentesi = new ClosingParentesis ();
        
        OpenLlave OpenLlave = new OpenLlave ();
        ClosingLlave closeLlave = new ClosingLlave ();
        
        simbols.add(OpenParentesis);
        simbols.add(OpenLlave);
        simbols.add(closeLlave);
        simbols.add(closeParentesi);

        System.out.println("Test case 1");
        
        System.out.println("-------");
        
        for (Symbol simbol : simbols) {
            System.out.println(simbol.toString());
        }
        
        System.out.println("-------");
        
        if (comprovarExpressio(simbols))
        {
            System.out.println("Resultat: Expressió correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: Expressió incorrecte");
            System.out.println("-------");
        }
    }
    
    public static void testCase_2()
    {
        ArrayList<Symbol> simbols = new ArrayList<Symbol> ();
        
        OpenParentesis OpenParentesis = new OpenParentesis ();
        ClosingParentesis closeParentesi = new ClosingParentesis ();
        
        OpenLlave OpenLlave = new OpenLlave ();
        ClosingLlave closeLlave = new ClosingLlave ();
        
        simbols.add(OpenParentesis);
        simbols.add(OpenLlave);
        simbols.add(closeParentesi);
        simbols.add(closeLlave);
        
        System.out.println("Test case 2");
        
        System.out.println("-------");
        
        for (Symbol simbol : simbols) {
            System.out.println(simbol.toString());
        }
        
        System.out.println("-------");
        
        if (comprovarExpressio(simbols))
        {
            System.out.println("Resultat: Expressió correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: Expressió incorrecte");
            System.out.println("-------");
        }
    }
    
    public static void testCase_3()
    {
        ArrayList<Symbol> simbols = new ArrayList<Symbol> ();
        
        OpenParentesis OpenParentesis = new OpenParentesis ();
        ClosingParentesis closeParentesi = new ClosingParentesis ();
        
        OpenLlave OpenLlave = new OpenLlave ();
        ClosingLlave closeLlave = new ClosingLlave ();
        
        simbols.add(closeParentesi);
        simbols.add(OpenParentesis);
        simbols.add(OpenLlave);        
        simbols.add(closeLlave);
        
        System.out.println("Test case 3");
        
        System.out.println("-------");
        
        for (Symbol simbol : simbols) {
            System.out.println(simbol.toString());
        }
        
        System.out.println("-------");
        
        if (comprovarExpressio(simbols))
        {
            System.out.println("Resultat: Expressió correcte");
            System.out.println("-------");
        }
        else
        {
            System.out.println("Resultat: Expressió incorrecte");
            System.out.println("-------");
        }
    }
    public static boolean comprovarExpressio(ArrayList<Symbol> arr_simbols)
    {
        Stack<Symbol> stack = new Stack<>();
        Iterator<Symbol> iterator = arr_simbols.iterator();
        while(iterator.hasNext()){
            Symbol actual = iterator.next();
            if(actual instanceof OpenLlave || actual instanceof OpenParentesis){
                stack.push(actual);
            }else if(actual instanceof ClosingLlave && !stack.isEmpty() && stack.peek() instanceof OpenLlave){
                stack.pop();
            }else if(actual instanceof ClosingParentesis && !stack.isEmpty() && stack.peek() instanceof OpenParentesis){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
