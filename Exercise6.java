/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Exercise6 {

    public static ArrayList<String> replaceRepetitive(String input) 
    {
        String word="";   
        String [] arr = input.split("\\s");
        ArrayList<String> word1 = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i < word1.size() - 1; i++)
        {
            if(word1.size() > 1){
            int j = i +1;           
            while(j<word1.size() && word1.get(i).equals(word1.get(j))){
                word = word1.get(j);                
                word1.remove(j);                
            }
            
            if (word != "") 
            {                
                word1.set(i, "REPEAT");                
            }
            }            
        }
        return word1;
    }
 
    public static void main(String[] args) 
    {
        String a="i can go go go ";
        System.out.println("Case a Input: " +a);
        System.out.println("Expect output: i can REPEAT");
        System.out.println("Real output:" +replaceRepetitive(a));
        
        String b="chuong dep dep trai trai";
        System.out.println("Case a Input: " +b);
        System.out.println("Expect output: chuong REPEAT REPEAT");
        System.out.println("Real output:" +replaceRepetitive(b));
        
        String c="chuong chuong dep trai";
        System.out.println("Case a Input: " +c);
        System.out.println("Expect output: REPEAT REPEAT");
        System.out.println("Real output:" +replaceRepetitive(c));
        
        String d = "chuong dep trai trai trai";
        System.out.println("Case a Input: " + d);
        System.out.println("Expect output: chuong dep REPEAT");
        System.out.println("Real output:" + replaceRepetitive(d));
        
        String e="mot hai hai ba ba ba ba bon bon";
        System.out.println("Case a Input: " +e);
        System.out.println("Expect output: mot REPEAT REPEAT REPEAT");
        System.out.println("Real output:" +replaceRepetitive(e));
        
    }
    
}