package jahnavi_magapu.collections;

import java.util.*;
public class App 

{

    public static void main( String[] args )

    {

    	Scanner sc = new Scanner(System.in);

    	CustomArrayList customarraylist =new CustomArrayList();

    	System.out.println("Intializing with 10 Integers");

    	customarraylist.adding(new Integer(1));

    	customarraylist.adding(new Integer(2));

    	customarraylist.adding(new Integer(3));

    	customarraylist.adding(new Integer(4));

    	customarraylist.adding(new Integer(5));

    	customarraylist.adding(new Integer(6));

    	customarraylist.adding(new Integer(7));

    	customarraylist.adding(new Integer(8));

    	customarraylist.adding(new Integer(9));

    	customarraylist.adding(new Integer(10));

    	System.out.print("All Elements in list after adding ");

        System.out.println(customarraylist);

        System.out.println("Enter how many elements you want to remove");

        int removeelements  = sc.nextInt();

    	for(int i = 0; i < removeelements; i++) {

    		System.out.println("Enter the index you want to remove");

    		int n = sc.nextInt();

    		customarraylist.remove(n);

    	}

    	System.out.println(" All the elemnets in the list after Removing");

    	System.out.println(customarraylist);

    	

    	System.out.println("Enter how many elements you want to fetch");

    	int fetchelements  = sc.nextInt();

    	for(int i = 0; i < fetchelements; i++) {

    		System.out.println("Enter the elemen you want to fetch");

    		int n = sc.nextInt();

    		customarraylist.fetching(n);

    	}  	

    	

    	System.out.print("All Elements in list after fetching ");

        System.out.println(customarraylist);

    	System.out.println("Fectching");

    	

      System.out.print("All Elements in list are ");

       System.out.println(customarraylist);

       System.out.println("Number of elements in list are:"+customarraylist.size());

        

    }

}
