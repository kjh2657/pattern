package com.aroo.design;


import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        String[][] a = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}
                , {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}
                , {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}
                , {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}
                , {"PXPXP", "XPXPX", "PXPXP", "XPXXX", "PXOOO"}
                , {"PXOOO", "OOOOO", "OOOOP", "OOOOP", "OOOOP"}};


        int[] solution = solution(a);
        Arrays.stream(solution).forEach(System.out::println);


    }

    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];


        for (int i = 0; i < places.length; i++) {
//        for(int i= 1 ; i< 2; i++){
            answer[i] = checkDis(i, places);
        }

        return answer;
    }

    private static int checkDis(int i, String[][] places) {
        for (int j = 0; j < places[i].length; j++) {

            if (j != places[i].length - 1) {
                for (int k = 0; k < places[i][j].length(); k++) {
                    char c = places[i][j].charAt(k);
                    if (k != places[i][j].length() - 1) {
                        if (c == 'P') {
                            if (places[i][j].charAt(k + 1) == 'P' || places[i][j + 1].charAt(k) == 'P') {
                                return 0;
                            } else if (places[i][j + 1].charAt(k + 1) == 'P' &&
                                    (places[i][j].charAt(k + 1) == 'O' || places[i][j + 1].charAt(k) == 'O')) {
                                return 0;
                            } else if (k > 0 && places[i][j + 1].charAt(k - 1) == 'P' &&
                                    (places[i][j].charAt(k - 1) == 'O' || places[i][j + 1].charAt(k) == 'O')) {
                                return 0;
                            } else if (j > 0 && places[i][j - 1].charAt(k + 1) == 'P' &&
                                    (places[i][j - 1].charAt(k) == 'O' || places[i][j].charAt(k + 1) == 'O')) {
                                return 0;
                            } else if (j < places[i].length - 2 && places[i][j + 1].charAt(k) == 'O' && places[i][j + 2].charAt(k) == 'P') {
                                return 0;
                            } else if (k < places[i][j].length() - 2 && places[i][j].charAt(k + 1) == 'O' && places[i][j].charAt(k + 2) == 'P') {
                                return 0;
                            }
                        }
                    } else {
                        if (c == 'P'){
                            if (places[i][j+1].charAt(k) == 'P' )
                                return 0;
                            if (j < places[i].length - 2 && places[i][j + 1].charAt(k) == 'O' && places[i][j + 2].charAt(k) == 'P') {
                                return 0;
                            }
                        }
                    }
                }
            } else  {
                for (int k = 0; k < places[i][j].length() - 1; k++) {
                    if (places[i][j].charAt(k) == 'P' && places[i][j].charAt(k + 1) == 'P') {
                        return 0;
                    } else if (places[i][j].charAt(k) == 'P' && k < places[i][j].length() - 2 && places[i][j].charAt(k + 1) == 'O' && places[i][j].charAt(k + 2) == 'P') {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
