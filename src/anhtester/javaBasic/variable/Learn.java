package anhtester.javaBasic.variable;

public class Learn {
//    public static void main(String[] args) {
//        //sout
//        System.out.println();
//    }

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = {33, 3, 4, 5};
        min(a);// truyền mảng tới phương thức
    }

}
