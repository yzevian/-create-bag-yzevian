/*
 * [Yi Zhao]
 * [Class INFO6205]
 * [Assignment 1]
 * [NUID:002103352]
 * 
 *  This is the main class.
 */

package BagClass;

import java.util.Arrays;

public class mainClass {
	public static void main(String args[]) {
		bagClass<Double> bc = new bagClass<Double>();
		//create a object 
		
		System.out.print(bc.isEmpty()+"\n");
		
		/*for(int i=0; i<5; i++) {
			bc.add(i);
		}*/
		
		bc.add(0.1);
		bc.add(1.1);
		bc.add(2.1);
		bc.add(3.1);
		bc.add(4.1);
		bc.add(5.1);
		//Check elements add method
		
		//System.out.print(bc.toArray()+"\n");
		
		System.out.print("size: "+bc.size()+"\n");
		//Check size calculation method
		
		System.out.print("contains? "+bc.contains(1.1)+"\n");
		System.out.print("contains? "+bc.contains(7.1)+"\n");
		//Check element contains method
		
		System.out.print("grab: "+bc.grab()+"\n");
		System.out.print("grab: "+bc.grab()+"\n");
		System.out.print("grab: "+bc.grab()+"\n");
		//Check grab method
		
		System.out.print("isEmpty: "+bc.isEmpty()+"\n");
		//Check isEmpty method
		
		System.out.print("Remove? "+bc.remove(5.1)+"\n");
		System.out.print("Remove? "+bc.remove(20.1)+"\n");
		//Check element remove method
		
		System.out.print("size: "+bc.size()+"\n");
		
		System.out.print("Array: "+Arrays.toString(bc.toArray())+"\n");
		//Check toArray method
		
		System.out.print("String: "+bc.toString()+"\n");
		//Check toString method
		
		bc.clear();
		System.out.print("isEmpty: "+bc.isEmpty()+"\n");
		//Check clear method
					
				
	}

}
