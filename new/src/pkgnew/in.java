
package pkgnew;
import java.util.LinkedList;
import java.util.Queue;

class in{ 

int da;
in lft;
in rgh;
public in(int x){
da=x;
lft=null;
rgh=null;

}}/*
class bin{
in rot;
public bin(){
rot=null;
}
public void ins(int r){
    rot=free(rot, r);

}
public in free(in f, int e){
if (rot==null)
    return new in(e);
if(e<rot.da)
    rot.lft=free(rot.lft, e);
else if(e>rot.da)
    rot.rgh=free(rot.rgh, e);
return rot;
}
}*/   
class insert{
in rot;
public insert(){
this.rot=null;
}
public void ins(int r){
    rot=free(rot, r);

}//insert operation

public in free(in ro, int e){
if (ro==null)
    return new in(e);
if(e<ro.da)
    ro.lft=free(ro.lft, e);
else if(e>ro.da){
    ro.rgh=free(ro.rgh, e);}
return ro;
}
public void disp(in rot){
if(rot!=null){
disp(rot.lft);
System.out.print(rot.da);
disp(rot.rgh);
}
}
public void in_order(){
disp(rot);
}


public void disp1(in rot){
if(rot!=null){
    System.out.print(rot.da);
    disp1(rot.lft);
disp1(rot.rgh);


}}
public void pre_order(){
disp1(rot);
}
public void disp2(in ro){
if(ro!=null){
    
    disp2(ro.lft);
disp2(ro.rgh);
System.out.print(ro.da);

}}

public void post_order(){
disp2(rot);
}


    //this is the search operation
public void searc(in e, int q){
int r=1;
if(e==null)
    System.out.print(" not found ");
Queue<in> queue=new LinkedList<>();
    queue.add(e);
    for(;!queue.isEmpty();){
        in current=queue.poll();
        if(current.da==q){
           System.out.print(" found ");
        break;}
        if(current.lft==null)
           System.out.print(" ");   
           else 
            queue.add(current.lft);
        if(current.rgh==null){
         
            
        }
        else
                 queue.add(current.rgh);
     
          if(current.lft==null&&current.rgh==null&&queue.isEmpty()){
                 System.out.print(" not found ");
          break;
        
    
    }
}}
    public void search(int q){
        searc(rot, q);
    
    }


    //this is the deletion operation
    
    public void delete(in h, int d){
    if(h==null)
          return h;
    
     if (d < h.da) {
         
           h.lft = delete(h.lft, d);  
        }  
     else if (d > h.da) {
           h.rgh = delete(h.rgh, d);
        }
     else
     {
           
            if (h.lft == null) {
            return h.rgh;
            } 
            else if (h.rgh == null) {
                return  h.lft; 
            }

            //  Node with 2 children
            in sd=findMin(h.rgh);
         h.da=sd.da;
           h.rgh=delete(h.rgh, sd.da);
        }
     
        return h;
    }
    
    
    //  minimum value node in  subtree
    public in findMin(in root) {
        int min=root.da;
        while (root.lft != null) {
            min = root.lft.da;
          
        }
        return root;}




}


    

