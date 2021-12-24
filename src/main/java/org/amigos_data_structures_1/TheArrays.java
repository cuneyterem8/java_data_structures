package org.amigos_data_structures_1;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] arrays = new String[5];
        arrays[0] = "element0";
        arrays[1] = "element1";

        System.out.println(Arrays.toString(arrays));

        int[] nums = {10, 20};

        System.out.println(Arrays.toString(nums));

        for(int num : nums)  {
            System.out.println(num);
        }

        Arrays.stream(nums).forEach(System.out::println);

        char[][] board = new char[][] {
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'}
        };

        board[0][0] = 'X'; board[1][0] = 'X'; board[0][1] = 'X';

        System.out.println(Arrays.deepToString(board));
    }
}
