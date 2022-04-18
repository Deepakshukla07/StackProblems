package com.company;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int[]arr={1,3,2,4};
        int[] arr = {4, 5, 2, 10, 8};
//        nextNearestGreater(arr);
//        nextNearestGreaterLeftSide(arr);
//        nextNearestSmallerLeftSide(arr);
        nearestSmallerOnRightSide( arr);


    }
//    greater on right side

    public static void nextNearestGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v = new Vector<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.size() == 0)
                v.add(-1);

            else if (st.size() > 0 && st.peek() > arr[i]) {
                v.add(st.peek());
            } else if (st.size() > 0 && st.peek() <= arr[i]) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0)
                    v.add(-1);
                else
                    v.add(st.peek());
            }
            st.push(arr[i]);

        }
        Collections.reverse(v);
        System.out.println(v);
    }

//    next nearest greater on left side
    public static void nextNearestGreaterLeftSide(int[] arr) {
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) v.add(-1);

            else if (!st.isEmpty() && st.peek() > arr[i])
                v.add(st.peek());
            else if (!st.isEmpty() && st.peek() <= arr[i]) {
                while (!st.isEmpty() && st.peek() <= arr[i])
                    st.pop();
                if (!st.isEmpty())
                    v.add(-1);
                else
                    v.add(st.peek());
            }
            st.push(arr[i]);

        }
        System.out.println(v);
    }

    public static void nextNearestSmallerLeftSide(int[] arr) {
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) v.add(-1);
            else if (!st.isEmpty() && st.peek() < arr[i])
                v.add(st.peek());
            else if (!st.isEmpty() && st.peek() >= arr[i]) {
                while (!st.isEmpty() && st.peek() >= arr[i])
                    st.pop();
                if (st.isEmpty())
                    v.add(-1);
                else
                    v.add(st.peek());


            }
            st.push(arr[i]);

        }
        System.out.println(v);

    }

    public static void nearestSmallerOnRightSide(int[] arr) {
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v = new Vector<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty()) v.add(-1);

            else if (!st.isEmpty() && st.peek() < arr[i])
                v.add(st.peek());
            else if(!st.isEmpty() && st.peek()>=arr[i]){
                while(!st.isEmpty() && st.peek()>=arr[i])
                    st.pop();
                if(st.isEmpty()) v.add(-1);

                else
                    v.add(st.peek());
            }
            st.push(arr[i]);


        }
        Collections.reverse(v);
        System.out.println(v);
    }
}
