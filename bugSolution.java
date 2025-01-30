public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); //This line might throw an exception
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds: " + e.getMessage());
        }
        //Alternative: Check index before accessing
        int index = 5; //or get from user input
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.err.println("Index out of bounds");
        }
    }
}