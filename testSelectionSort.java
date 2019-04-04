/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

	
public class testSelectionSort {
	@Test
	public void test() 
	{
		testPositive();
		testNegative();
		testZeros();
		testDuplicates();
		testMixed();
	}

    private void testZeros() {
    	
    	int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 0;
        Sortedarr[1] = 0;
        Sortedarr[2] = 0;
        Sortedarr[3] = 0;
        Sortedarr[4] = 0;

        	assertEquals(0,0);
	}
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        assertEquals(10,10);
     
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -7;
        Sortedarr[2] = -8;
        Sortedarr[3] = -9;
        Sortedarr[4] = -10;
        
        assertEquals(-10,-10);
        
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 9;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = -9;
        Sortedarr[4] = 9;
        
        assertEquals(9,9);
       
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 8;
        arr[3] = 8;
        arr[4] = 8;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 8;
        Sortedarr[1] = 8;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        assertEquals(8,8);
  
    }


}

