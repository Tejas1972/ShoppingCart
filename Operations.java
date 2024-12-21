public class Operations{
    
    public static void printArray(int[] arr,int lSize){
        for(int i=0;i<lSize;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static int[] resizeArray(int[] arr,int size){
        int[] arr2 = new int[size];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static int insertElement(int[] arr,int lSize,int pos,int val){
        if(pos > lSize){
            System.out.println("From insert Logical Size is lSize");
            return lSize;
        }
        for(int i=pos;i<lSize;i++){
            arr[i+1] = arr[i]; 
        }
        arr[pos] = val;
        return lSize+1;
    }

    public static int deleteElement(int[] arr,int pos,int lSize){
        if(pos > lSize-1){
            System.out.println("From delete Logical Size is lSize");
            return lSize;
        }

        for(int i = pos;i<=lSize-1;i++){
            arr[i] = arr[i+1];
        }
        return lSize-1;
    } 
    
    public static void main(String[] args) {
        int arr[] = new int[2];
        int count = 0;
        arr[count++] = 1;
        arr[count++] = 2;

        arr = resizeArray(arr,5);
        count = insertElement(arr,count,2,23);
        printArray(arr,count);
        count = deleteElement(arr, 2,count);
        printArray(arr, count);
    }
}