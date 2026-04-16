public class PermutationSimple {

    static void permute(int arr[], int index) {

        // if we reach end → print
        if (index == arr.length) {
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // swap
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(arr, index + 1);   // go next

            // swap back (undo)
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        permute(arr, 0);
    }
}