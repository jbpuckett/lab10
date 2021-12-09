/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
SelectionSort sort = new SelectionSort();
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
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
        
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
    
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
    
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = 0;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
    
    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = 9;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 9;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = 0;
        Sortedarr[2] = 9;
        Sortedarr[3] = 9;
        Sortedarr[4] = 9;
        
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr, Sortedarr));
    }
}
