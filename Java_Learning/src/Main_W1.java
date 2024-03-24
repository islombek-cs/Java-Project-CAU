public class Main_W1 {
    public static void main(String[] args){

        /* 4.Removing Duplicates from array
        int[] elems = {1,1,2,2,3,4,5};
        int newLength = 1;
        for (int i=1; i<elems.length; i++){
            if (elems[i] != elems[i-1]){
                elems[newLength] = elems[i];
                newLength++;
            }
        }
        for (int j=0; j<newLength; j++){
            System.out.print(elems[j] + " ");
        } */

        /* 3.Check if an Array is Sorted
        int[] elems = {23,34,1,5,6,77,99,8};
        // int[] elems = {1,2,3,4,5};
        boolean isSorted = true;
        for (int i=0; i<elems.length-1; i++){
            if (elems[i] > elems[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("True");
        }else{
            System.out.println("False");
        } */

        /* 2.Reverse an Array
        int[] elems = {23,34,1,5,6,77,99,8};
        int start = 0; int end = elems.length - 1;
        while (start < end){
            int temp = elems[start]; //23
            elems[start] = elems[end]; //8
            elems[end] = temp; //23
            start++; end--;
        }
        for (int elem: elems){
            System.out.print(elem + " ");
        } */

        /* 1.Find the Maximum Element
        int[] elems = {23,34,1,5,6,77,99,8};
        int max = elems[0];
        for (int elem: elems){
            if (elem > max){
                max = elem;
            }
        }
        System.out.println("Max: " + max); */
    }
}
