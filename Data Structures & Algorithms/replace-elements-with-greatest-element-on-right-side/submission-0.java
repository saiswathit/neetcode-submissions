class Solution {
    public int[] replaceElements(int[] arr) {
      int length = arr.length;  
      int currMax = arr[length-1];
      arr[length-1] = -1;
      for (int i =length-2; i>=0; i--) {
          if(arr[i] > currMax) {
            int tmp = arr[i];
            arr[i] = currMax;
            currMax = tmp;
          } else {
            arr[i] = currMax;
          }
    
    }
    return arr;
}
}