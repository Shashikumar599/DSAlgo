package HashMapp;

import com.sun.jdi.Value;

import java.util.HashMap;

public class MyHashmap<K,V> {
       private static  int size=1<<4;
//       private static int maxsize=1<<30;

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
       public  void add(K Key ,V Value){
           int l=Key.hashCode();
           l=l^(l>>>16);
           l=l%size;
           Entry node=hashmap[l];
           if(node==null){
               hashmap[l]=new Entry(Key,Value);
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
               }
           }
       }
       public void remove(K Key,V Value){
           int l=Key.hashCode();
           l=l^(l>>>16);
           l=l%size;
           remove(Key);
       }
       public void remove(K Key){
           int l=Key.hashCode();
           l=l^(l>>>16);
           l=l%size;
           Entry node=hashmap[l];
           if(node==null)
               return;
           if(node.key==Key){
               hashmap[l]=node.next;
           }
           else{
               Entry Pnode=null;
               while(node!=null){
                   if(node.key==Key){
                       Pnode.next=node.next;
                       break;
                   }
                   Pnode=node;
                   node=node.next;
               }
           }
       }
       public  V getValue(K Key){
           int l=Key.hashCode();
           l=l^(l>>>16);
           l=l%size;
           Entry node=hashmap[l];
           while(node!=null){
               if(node.key==Key){
                   return (V)node.Value;
               }
           }
           return null;
       }
}
