package ch04;

public class Matrix {
    public static void main(String[] args) {
        // 다차원 배열
/*       2차원 배열
        1, 2, 3, 4
        5, 6, 7, 8
        9, 10, 11, 12
 */
        // 2차원 배열 초기화
        // [행] [열]
        int[][] matrix = new int [3][4];  // 3개의 행과 4개의 열

        matrix[0][0] = 1;    // 첫 번째 행의 첫 번째 열 // [0][1] 첫 번째 행의 두 번째 열
        matrix[2][3] = 4;

        // 행단위 반복문
        for (int i = 0; i < 3; i++) {    // i는 행 < 3: 3행이고 0행부터 시작해서
            // 0행, 1행, 2행
            // ....
            // 열단위 반복문
            for (int j = 0; j < 4; j++) {  // j는 열
                // 0행-1열, ... 3행-4열
                matrix[i][j] = i + j;
            }
        }



    }
}