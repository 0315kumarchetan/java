import java.util.*;

class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        int[] rb = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);

        rb[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int[] lb = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        for (int i = 1; i <= arr.length - 1; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + rb[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + lb[i]);
        }
        System.out.println();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;

            if (max < area) {
                max = area;
            }

        }

        System.out.print(max);

    }
}