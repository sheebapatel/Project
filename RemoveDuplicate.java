/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rlanguage;

/**
 *
 * @author owner
 */
import java.util.*;
class RemoveDuplicate
{
    public String RemoveDuplicate1(String cm)
    {
        System.out.println(cm);
        String ans="",ans1="";
	int l,i=0;
        String n1=cm;
        String[] s1=n1.split(" ");
        for(String s:s1)
         {
	    ans="";
	char ch1,ch2;
            i=0;
	l=s.length();
	s+=" ";			// *Adding extra space at the end because last character is compared with something else index out of bound error.
	ch1=s.charAt(0);	// taking ch1 as first character
	while(i<l)
	{			 
		ans= ans+ ch1;  // adding each individual character to the answer string or output string without repeated characters
 
		while(ch1==(ch2=s.charAt(++i)) && i<l)
		{}
	ch1=ch2;	// **to store the previously last character in ch1
	}
        ans1=ans1+ans+" ";
	System.out.println("String after removing repeated characters : \n"+ans); // Printing the string without duplicate characters
    }
        return ans1;
    }
    public static void main(String args[])
    {
		
    }
    } 