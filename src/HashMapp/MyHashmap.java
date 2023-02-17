package HashMapp;

import com.sun.jdi.Value;

import java.util.HashMap;

public class MyHashmap<K,V> {
       private static  int size=8;
       private int currentsize;
//       private static int maxsize=1<<30;
       private static double alpha=0.75;
       Entry [] hashmap;
       public MyHashmap(){
//             hashmap=(Entry [])new Object[size];
           hashmap=new Entry[size];
       }
       public MyHashmap(int cap){
           if(cap<=size){
//               hashmap=(Entry[])new Object[size];
               hashmap=new Entry[size];
           }
           else{
                size=calculatesize(cap);
//               hashmap=(Entry[]) new Object[size];
               hashmap=new Entry[size];
           }
       }
       private int calculatesize(int cap){
           int n=cap-1;
           n=n|(n>>>1);
           n=n|(n>>>2);
           n=n|(n>>>4);
           n=n|(n>>>8);
           n=n|(n>>>16);
           return n+1;
       }
       class  Entry<K,V>{
           K key;
           V Value;
           Entry next;
           Entry(K key,V Value){
               this.key=key;
               this.Value=Value;
           }
       }
       void rehash(){
            Entry [] temp=hashmap;

            hashmap=new Entry[size*2];
            size=size*2;
            currentsize=0;
            for(int i=0;i<size/2;i++){
                System.out.println(i);
                Entry node=temp[i];
                while(node!=null){
                    add((K) node.key, (V) node.Value);
                    node=node.next;
                }
            }
//            size=size*2;
       }
       public  void add(K Key ,V Value){
           int l=Key.hashCode();
//           l=l^(l>>>16);
           l=l&(size-1);
           Entry node=hashmap[l];
           if(node==null){
               hashmap[l]=new Entry(Key,Value);
               currentsize++;
           }
           else{
               Entry Previousnode=null;
               while (node!=null){
                   if(node.key==Key){
                       node.Value=Value;
                       break;
                   }
                   Previousnode=node;
                   node=node.next;
               }
               if(node==null){
                   node=new Entry(Key,Value);
                   Previousnode.next=node;
                   currentsize++;
               }
           }
           if(currentsize>=alpha*size){
               rehash();
           }
       }

       public void remove(K Key,V Value){
           remove(Key);
       }
       public void remove(K Key){
           int l=Key.hashCode();
//           l=l^(l>>>16);
           l=l&(size-1);
           Entry node=hashmap[l];
           if(node==null)
               return;
           if(node.key==Key){
               hashmap[l]=node.next;
               currentsize--;
           }
           else{
               Entry Pnode=null;
               while(node!=null){
                   if(node.key==Key){
                       Pnode.next=node.next;
                       currentsize--;
                       break;
                   }
                   Pnode=node;
                   node=node.next;
               }
           }
       }
       public  V getValue(K Key){
           int l=Key.hashCode();
//           l=l^(l>>>16);
           l=l&(size-1);
           Entry node=hashmap[l];
           while(node!=null){
               if(node.key==Key){
                   return (V)node.Value;
               }
           }
           return null;
       }
}
