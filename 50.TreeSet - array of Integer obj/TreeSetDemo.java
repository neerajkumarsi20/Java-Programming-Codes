
import java.util.*;
class TreeSetDemo{
    public static void main(String[] args){
        TreeSet<Integer> al=new TreeSet<Integer>();//Creating object of template class
        al.add(100);
        al.add(10);
        al.add(90);
        System.out.println("Length..."+al.size());
        //System.out.println("Elements...."+al);
        //al.remove(object)
        //al.remove(index)   
        //System.out.println("..."+al.get(0));
        //String r=al.remove(0);
        //System.out.println(r);
        //System.out.println("..."+al.set(0,r));
        //al.add(2,r);
        for(var s:al)
            System.out.println(s);
    }
}
