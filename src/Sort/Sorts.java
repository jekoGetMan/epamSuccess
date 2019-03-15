package Sort;

public class Sorts {
    public static void main(String[] args){
    int arr[] = new int[10];
    //input data
    for(int i = 0; i < arr.length; i++){
        arr[i] = (int) Math.round(Math.random() * 10 );
        System.out.print(arr[i] + " ");
    }
    //algorithm
    int j, temp;
    for(int i = 0; i < arr.length; i++) {
        temp = arr[i];
        for(j = i-1; j >=0 && arr[j] > temp; j--){
            arr[j+1] = arr[j];
        }
        arr[j+1] = temp;
    }
    //output data
    System.out.println();
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }

    }
}
