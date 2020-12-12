import java.util.*;

class nextSmallerIndexOnLeft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        int[] nse = new int[arr.length];

        st.push(arr.length - 1);
        nse[0] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                int pos = st.peek();
                nse[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while (st.size() > 0) {
            int pos = st.peek();
            nse[pos] = -1;
            st.pop();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + nse[i]);
        }
    }
}