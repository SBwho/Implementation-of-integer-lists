package HOMEWORK_1;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList {

    ArrayList<Integer> lin = new ArrayList<>();

    public void add(int a){
        lin.add(a);
    } // add closing bracket

    public void remove(int b){
        lin.remove(b);
    }// remove closing bracket

    public void add(int index,int a){
        lin.add(index,a);
    } // add closing bracket

    public void printList(){
        for( int i: lin){
            System.out.print(i+" ");
        }
        System.out.println("");

    }//printlist closing bracket

    public int size(){
        return lin.size();
    }
    public int index(){
        int a= size();
        return a+1;

    }
    public void  sort(){
        Collections.sort(lin);
        
        }

    
}// integerlist closing bracket
