/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;


public class New {

   
    public static void main(String[] args) {
  
       insert r=new insert();
       //insertion
       r.ins(5);
       r.ins(7);
       r.ins(1);
       r.ins(9);
       r.ins(4);
       //traversal order display operation
   r.in_order();
   
   System.out.println();
   r.post_order();
   System.out.println();
   r.pre_order();
   //search operation
   r.search(6);
   r.search(7);
   //deletion
   r.main_delete(4);
   
   
    }
    
}
