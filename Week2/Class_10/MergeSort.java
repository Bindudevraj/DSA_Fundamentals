package Class_10;

public class MergeSort {
	public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){
	      int i=0,l=0,r = 0;
	      while(l<left_size && r<right_size){
	          
	          if(left_arr[l]<right_arr[r]){
	              arr[i++] = left_arr[l++];
	          }
	          else{
	              arr[i++] = right_arr[r++];
	          }
	      }
	      while(l<left_size){
	          arr[i++] = left_arr[l++];
	      }
	      while(r<right_size){
	        arr[i++] = right_arr[r++];
	      }
	  }

	  public static void mergeSort(int [] arr, int len){
	      if (len < 2){return;}
	      int mid = len / 2;
	      int [] left_arr = new int[mid];
	      int [] right_arr = new int[len-mid];
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              left_arr[i] = arr[i];
	          }
	          else{
	              right_arr[k] = arr[i];
	              k = k+1;
	          }
	      }
	      mergeSort(left_arr,mid);
	      mergeSort(right_arr,len-mid);
	      merge(left_arr,right_arr,arr,mid,len-mid);
	  }
	  public static void main( String args[] ) {
	        int [] array = {5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4};
	        mergeSort(array,array.length);
	        for(int i =0; i< array.length;++i){
	            System.out.print(array[i]+ " ");
	        }
	    }
}
