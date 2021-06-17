public class Main{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int temp[] = {arr[0],arr[1]};
        int newarr[] = new int[arr.length];
        int j=0; int c=0;
        for(int i=2;i<arr.length;i++){
            newarr[j++] = arr[i]; 
        }
        int p=arr.length-2;{
            while(c<2 && p<arr.length){
            newarr[p] = temp[c];
            c++;
            p++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
    
}
