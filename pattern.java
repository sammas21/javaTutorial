package com.sam.javabasics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import java.util.Scanner;



public class ClassMain {
		
		
		//Main Method
	    public static void main(String[] args) {
	        
	    	PC p =new PC();
	    	p.udPattern();
	    	p.newPattern();
	    	p.pPattern();
	    }
}

 class PC{
	
	 public void newPattern(){
		 
		 /*
		  
		  
*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
* * * * * * * *  


		  */
		 
		 
		 int limit=4;
		 int lb=2,ub=limit*2-1;
		 for(int i=1; i <=limit+1;i++){
			 
			 for(int j=1; j<=limit*2;j++){
				 if(j<lb||j>ub){
					 System.out.print("* ");
				 }else{
					 System.out.print("  ");
				 }
				 
				 
					 
			 }
			 if(i!=limit)
			 {
				 lb++;
				 ub--;
			 }
			 System.out.println("");
		 }
	 
	 }

	 public void udPattern(){
		 
		 /*
		  
		*         
      * * *       
    * * * * *     
  * * * * * * *   
* * * * * * * * * 
  * * * * * * *   
    * * * * *     
      * * *       
        *          
		  
		   
		  * */
		 
		 int limit=9;
		 int ub=limit/2+1,lb=ub;
		 for(int i=1; i <=limit;i++){
			 
			 for(int j=1; j<=limit;j++){
				 if(j<lb||j>ub){
					 System.out.print("  ");
				 }else{
					 System.out.print("* ");
				 }
				 
				 
					 
			 }
			 if(i<limit/2+1)
			 {
				 lb--;
				 ub++;
			 }else{
				 lb++;
				 ub--; 
			 }
			 System.out.println("");
		 }
	 
	 }
	 public void pPattern(){
		
		/*
		  
		 * * * * * * * * * * * * * * * 
* * * * * * *   * * * * * * * 
* * * * * *       * * * * * * 
* * * * *           * * * * * 
* * * *               * * * * 
* * *                   * * * 
* *                       * * 
*                           * 
* *                       * * 
* * *                   * * * 
* * * *               * * * * 
* * * * *           * * * * * 
* * * * * *       * * * * * * 
* * * * * * *   * * * * * * * 
* * * * * * * * * * * * * * *  
		  
		  
		  
		  
		 */ 
		 
		 
		 
		 
		 int limit=15;
		
		
		
		int v=limit/2+1; 
		int vl=v;
		 for(int i=1; i <=limit;i++){
			 
			 for(int j=1; j<=limit;j++)
			 {  
				 if(i==1||i==limit){
				 System.out.print("* ");
				 }
				 else{
					 if(j<v||j>vl){
						 System.out.print("* "); 
					 }else{
						 System.out.print("  ");
					 }
					 
				 }
				
				 }
			 System.out.println("");
			 if(!(i==1||i==limit)){
				 if(i<=limit/2){
					 v--;
					 vl++;
				 }else{
					 v++;
					 vl--;
			 }
			 
			 
		 }
	 
	 }
	 }
	 }
