
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
    
    public void delete(in h, int d){
    if(h==null)
        System.out.print("deleted");
    
   Queue<in> queue=new LinkedList<>();
  queue.add(h);
in start;
in finish;
while(!queue.isEmpty()){
    finish=queue.poll();
    
    if(finish.da==d){
        start=finish;
         for(;!queue.isEmpty();){
      in current=queue.poll();
      if(current.lft==start){
            current.lft=null;
          break;}
      else
         queue.add(current.lft);
       if(current.rgh!=null&&current.rgh==start)
           current.rgh=null;
  
  else
         queue.add(current.rgh);
         }
        break;
    }
     if(finish.lft!=null)
        queue.add(finish.lft);
         if(finish.rgh!=null)
        queue.add(finish.rgh);
    
        
        
    }
    }
    
    public void main_delete(int d){
    delete(rot, d);
    }




}


    

