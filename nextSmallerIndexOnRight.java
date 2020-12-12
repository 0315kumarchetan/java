import java.util.*;

class nextSmallerIndexOnRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        int[] nseR = new int[arr.length];

        st.push(0);
        nseR[arr.length - 1] = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                int pos = st.peek();
                nseR[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while (st.size() > 0) {
            int pos = st.peek();
            nseR[pos] = -1;
            st.pop();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + nseR[i]);
        }
    }
}