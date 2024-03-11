package src.main;

class Main{
    public static void main(String[] args) {

        int[] myAry = {0,1,0,4,12,0,0,0,14,23,1,0};

        
       //printArray(removeEvenNumbers(myAry));
       //printArray(removeOddNumbers(myAry));
       //printArray(reverseIntegerArray(myAry));//este metodo si crea un nuevo array
        //printArray(reverseIntegerArray2(myAry, 0, myAry.length - 1));//este metodo no crea un nuevo array, se usan swaps
        //System.out.println(findMinimumValue(myAry));
        //System.out.println(findSecondMaxVal(myAry));
        printArray(moveZerosRight(myAry, 1));
    }

    public static int[] generateArray(int length){
        int[] ary = new int[length];
        int counter=0;
        for(int i=0; i<ary.length; i++){
            ary[i] = counter;
            counter++;
        }
        return ary;
    }

    public static int[] removeOddNumbers(int[] ary){
        int oddCount = 0;
        //obtainCount
        for(int i=0; i<ary.length; i++){
            if(ary[i] % 2 != 0){
                oddCount++;
            }
        }
        //
        int[] res =  new int[oddCount];
        int idx = 0;
        for(int i=0; i<ary.length; i++){
            if(ary[i] % 2 != 0){
                res[idx] = ary[i];
                idx++;
            }
        }
        return res;
    }
    public static int[] removeEvenNumbers(int[] ary){
        //sacar el conteo de numeros pares para crear un new array de ese tamaño
        int evenCount = 0;
        //For to traverse and validate how ma
        for(int i=0; i<ary.length; i++){
            //if 
            if(ary[i] % 2 == 0){
                evenCount++;
            }
        }
        //
        int[] res = new int[evenCount];
        int idx = 0;
        for(int j=0; j<ary.length;j++){
            if(ary[j] % 2 == 0){
                res[idx] = ary[j];
                idx++;
            }
        }
       return res;
    }
    public static void printArray(int[] ar){
        int n = ar.length;
        for(int i=0; i<n; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static int[] reverseIntegerArray(int[] ary){
        int n = ary.length, index = 0;
        int[] reversedAry = new int[n];
        for(int i= ary.length -1; i>=0; i--){
            reversedAry[index] = ary[i];
            index++;
        }
        return reversedAry;
    }
    //Este algoritmo no necesita crear un nuevo array, solo cambia todo de posicion, which is pro
    public static int[] reverseIntegerArray2(int[] numbers, int start, int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        return numbers;
    }
    /*
     * Finds the lowest number in a given array
     */
    public static int findMinimumValue(int[] ary){
        //Edge cases
        if(ary == null || ary.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = ary[0];
        for(int i=0; i<ary.length; i++){
            if(ary[i]< min){
                min = ary[i];
            }
        }
        return min;
    }
     /*
     * Finds the second Max Element of an array
     */
    public static int findSecondMaxVal(int[] array){
        // int[] array = {8,8,3,6,7,95,342,34,2,45};
        int maxValue=Integer.MIN_VALUE;
        int secondMaxValue=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > maxValue){
                secondMaxValue = maxValue;//necesitamos asignar el antiguo valor de maxValue por que aqui en esta linea maxValue aun no s actualiza, por lo que en caso de actualizarse, seria el numero mayor
                maxValue = array[i];//En esta linea hacemos el cambio de MaxValue al nuevo valor mas alto en caso de que el if aplique, es por eso que estan en este orden
            }else if(array[i] > secondMaxValue && array[i] != maxValue){
                secondMaxValue = array[i];
            }
        }
        return secondMaxValue;
    }
    /*
     * Move zeros to the end of the array while mantaining the relative order of the elements that are not zero
     */
    public static int[] moveZerosRight(int[] array, int skipTarget){
        //{0,1,0,4,12} -> {1,4,12,0,0}
        //Neta checa este video https://www.youtube.com/watch?v=2ZLl8GAk1X4&t=5137s pq la neta me confundi
        int j=0;//this is a pointer that we will use to focus on zero elements
        for(int i=0; i<array.length; i++){//i will be a pointer that focus on non zero elements
            if(array[i] != skipTarget && array[j] == skipTarget){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != skipTarget){
                j++;
            }
        }
        return array;
    }
}
 