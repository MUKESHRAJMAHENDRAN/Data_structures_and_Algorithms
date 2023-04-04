package com.mukesh;

public class Basics {
    public static void main(String[] args) {
    //    main_1(1);
	main_2(1);
    }
    static void main_2(int n){
      if(n==5){
	  return; 
    }
    System.out.println(n);
    main_2(n+1);
    }

    static void main_1(int n){
        if (n == 5) {
            return;
        }
        System.out.println("Hello world");
        main_1(n + 1);
    }
}
