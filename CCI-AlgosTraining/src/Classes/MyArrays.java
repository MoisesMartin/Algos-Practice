package src.Classes;

public class MyArrays {
    private int arraySize = 0;
    private String arrrayName ="";

  
    //Constructor
    public MyArrays(int size, String nameArray){
        this.arraySize = size;
        this.arrrayName = nameArray;
    }
    //get the length of the current array Instance
    public int getArraySize() {
        return arraySize;
    }
    //setArraySize ( non used )
    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }
    //
    public void setArrrayName(String arrrayName) {
        this.arrrayName = arrrayName;
    }
    //
    public String getArrrayName() {
        return "My name is "+arrrayName;
    }
    //returns new array of n elements, with n being the integer specified on constructor
    public int[] createArray(){
        if(arraySize > 0){
            return new int[this.arraySize];
        }else{
            return new int[0];
        }
       
    }
    //prints an array vertically
    public void printArrayVertically(){
        for(int i=0 ; i<arraySize; i++){
            System.out.println(createArray()[i]);
        }
    }
    //prints an array horizontally
    public void printArrayHorizontally(){
        for(int i=0 ; i<arraySize; i++){
            if(!(i == arraySize-1)){
                System.out.print(createArray()[i] + ", ");
            }else{
                System.out.print(createArray()[i]+"\n");
            }
        }
    }
    //
    public int getValueAtIndex(int[] ar, int i){
        if(ar.length > 0){
            return ar[i];
        }else{
            return 0;
        }
    }
    //
    public String toString(){
        String returnVal = "[ " +getArrrayName()+ "->"+ getArraySize() + "]";
        System.out.println(returnVal);
        return returnVal;
    }
}
