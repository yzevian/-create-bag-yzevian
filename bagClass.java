/*
 * [Yi Zhao]
 * [Class INFO6205]
 * [Assignment 1]
 * [NUID:002103352]
 * 
 *  This is the bag class.
 */

package BagClass;

import java.util.Iterator;
import java.util.Random;

public class bagClass<Item> implements Iterable<Item>{
    private Node first;//head
    private int size;//the LinkedList size
    
    private class Node{
        Item item;
        Node next;
    }

    
    public bagClass() {
        size = 0;
        first= null;
    }// the Constructor

    
    public void add(Item T){
        Node oldFirst = first;
        first = new Node();
        first.item = T;
        first.next = oldFirst;
        size++;
    } //To add an element to the bag

   
    public void clear(){
        first = null;
        size = 0;
    } //To clear ALL contents of the bag

    
    public boolean contains(Item T){
        for(Item i : this){
            if(i.equals(T)){
                return true;
            }
        }
        return false;
    } //Return true if the element is in the bag, false if it is not

    
    public Item grab(){
        if (isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(size);
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    } //Return a random element in the bag

    
    public boolean isEmpty(){
        return first == null;
    } //Return true if the bag is empty, otherwise false

    
    public boolean remove(Item T){
        Node current = first;
        Node previous = null;
        while (current != null) {
            if (current.item.equals(T)) {
                if (previous == null) {
                    first = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }//Remove ONE instance of the item T.
    //first step is check whether the element is exist. Return false if non-exist.

    
    public int size(){
        return size;
    }//Return the number of elements in the bag

    
    public Item[] toArray(){
        Item[] nodes = (Item[]) new Object[size];
        int i = 0;
        for (Item item : this) {
            nodes[i++] = item;
        }
        return nodes;
    }//Return an array with all the elements in the bag in the array

    
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (Item item : this) {
            res.append(item).append(" ");
        }
        return res.toString();
    }//Returns a String that displays all the elements in the bag

    
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }//Iterator
}
