
package pkgnew;
//this is the  MAIN CLASS

public class New {

   
    public static void main(String[] args) {
  
       insert r=new insert();
       //insertion method
       r.ins(5);
       r.ins(7);
       r.ins(1);
       r.ins(9);
       r.ins(4);
       //traversal order method
       System.out.print("This is the in_order ");
   r.in_order();
   
   System.out.println();
      System.out.print("This is the in_order ");  
   r.post_order();
      
   System.out.println();
        System.out.print("This is the in_order "); 
   r.pre_order();
       
   //search method
   r.search(6);
   r.search(7);
       
   //deletion method
   r.main_delete(4);
        System.out.print("This is the in_order ");
   r.in_order();
   
    }
    
}
