package homework6;

import java.util.Scanner;

public class KrestikiNoliki {

    public static void main(String[] args) {

        System.out.println("Начинаем игру крестики-нолики.");
        Scanner input = new Scanner(System.in);
        int[][] game = new int[3][3];
        int x1=0;
        int y1=0;
        int x2, y2;
        int xk1=0;
        int yk1=0;
        int x3=0;
        int y3=0;
        int x4=0;
        int y4=0;
        boolean k=true;
        int hod=0;

        do {hod++;
            System.out.println("Ход " + hod);
            System.out.println("Введите значение координаты 'x' (целое число от 0 до 2 включительно):");
            int x = input.nextInt();
            System.out.println("Введите значение координаты 'y' (целое число от 0 до 2 включительно):");
            int y = input.nextInt();

                    game[x][y] = 1;
                    //ход игрока
                   //ход компутера
                    if (hod==1 && x==1 && y==1)
                        game[0][0] = 5;
                    else if (hod==1 && x!=1 && y!=1)
                        game[1][1] = 5;

                    else if (hod>1 && game[0][0] + game[0][1] + game[0][2] == 2 ){ //строка 1 почти собрана
                        if  (game[0][0]!=1)
                            game[0][0]=5;
                        else if (game[0][1]!=1)
                            game[0][1]=5;
                        else if (game[0][2]!=1)
                            game[0][2]=5;}

                    else if (hod>1 && game[1][0] + game[1][1] + game[1][2] == 2 ){ //строка 2 почти собрана
                        if  (game[1][0]!=1)
                            game[1][0]=5;
                        else if (game[1][1]!=1)
                            game[1][1]=5;
                        else if (game[1][2]!=1)
                            game[1][2]=5;}

                    else if (hod>1 && game[2][0] + game[2][1] + game[2][2] == 2 ){ //строка 3 почти собрана
                        if  (game[2][0]!=1)
                            game[2][0]=5;
                        else if (game[2][1]!=1)
                            game[2][1]=5;
                        else if (game[2][2]!=1)
                            game[2][2]=5;}

                    else if (hod>1 && game[0][0] + game[1][0] + game[2][0] == 2 ){ //столбик 1 почти собран
                        if  (game[0][0]!=1)
                            game[0][0]=5;
                        else if (game[1][0]!=1)
                            game[1][0]=5;
                        else if (game[2][0]!=1)
                            game[2][0]=5;}

                    else if (hod>1 && game[0][1] + game[1][1] + game[2][1] == 2 ){ //столбик 2 почти собран
                        if  (game[0][1]!=1)
                            game[0][1]=5;
                        else if (game[1][1]!=1)
                            game[1][1]=5;
                        else if (game[2][1]!=1)
                            game[2][1]=5;}

                    else if (hod>1 && game[0][2] + game[1][2] + game[2][2] == 2 ){ //столбик 3 почти собран
                        if  (game[0][2]!=1)
                            game[0][2]=5;
                        else if (game[1][2]!=1)
                            game[1][2]=5;
                        else if (game[2][2]!=1)
                            game[2][2]=5;}

                    else if (hod>1 && game[0][0] + game[1][1] + game[2][2] == 2 ){ //диагональ 1 почти собрана
                        if  (game[0][0]!=1)
                            game[0][0]=5;
                        else if (game[1][1]!=1)
                            game[1][1]=5;
                        else if (game[2][2]!=1)
                            game[2][2]=5;}

                    else if (hod>1 && game[2][0] + game[1][1] + game[0][2] == 2 ){ //диагональ 2 почти собрана
                        if  (game[2][0]!=1)
                            game[2][0]=5;
                        else if (game[1][1]!=1)
                            game[1][1]=5;
                        else if (game[0][2]!=1)
                            game[0][2]=5;}
//проверка на случай если игрок ходит рандомно и не пытается собрать весь ряд
                    else if (hod==2) {
                       if (game[0][0]==0)  game[0][0]=5;
                       else if (game[0][1]==0)  game[0][1]=5;
                       else if (game[0][2]==0)  game[0][2]=5;
                       else if (game[1][0]==0)  game[1][0]=5;
                       else if (game[1][1]==0)  game[1][1]=5;
                       else if (game[1][2]==0)  game[1][2]=5;
                       else if (game[2][0]==0)  game[2][0]=5;
                       else if (game[2][1]==0)  game[2][1]=5;
                       else if (game[2][2]==0)  game[2][2]=5;
                    }
                    else if (hod==4) {
                        if (game[0][0]==0)  game[0][0]=5;
                        else if (game[0][1]==0)  game[0][1]=5;
                        else if (game[0][2]==0)  game[0][2]=5;
                        else if (game[1][0]==0)  game[1][0]=5;
                        else if (game[1][1]==0)  game[1][1]=5;
                        else if (game[1][2]==0)  game[1][2]=5;
                        else if (game[2][0]==0)  game[2][0]=5;
                        else if (game[2][1]==0)  game[2][1]=5;
                        else if (game[2][2]==0)  game[2][2]=5;
                    }
                        // проверка на возможность продолжения игры
                    if (game[0][0] + game[0][1] + game[0][2] == 3 || game[0][0] + game[0][1] + game[0][2] == 15 ||//строка 1 собрана
                            game[1][0] + game[1][1] + game[1][2] == 3 || game[1][0] + game[1][1] + game[1][2] == 15 || //строка 2 собрана
                            game[2][0] + game[2][1] + game[2][2] == 3 || game[2][0] + game[2][1] + game[2][2] == 15 || //строка 3 собрана
                            game[0][0] + game[1][0] + game[2][0] == 3 || game[0][0] + game[1][0] + game[2][0] == 15 || //столбик 1 собран
                            game[1][0] + game[1][1] + game[1][2] == 3 || game[1][0] + game[1][1] + game[1][2] == 15 || //столбик 2 собран
                            game[2][0] + game[2][1] + game[2][2] == 3 || game[2][0] + game[2][1] + game[2][2] == 15 || //столбик 3 собран
                            game[0][0] + game[1][1] + game[2][2] == 3 || game[0][0] + game[1][1] + game[2][2] == 15 || //диагональ 1 собрана
                            game[2][0] + game[1][1] + game[0][2] == 3 || game[2][0] + game[1][1] + game[0][2] == 15 ||
                            (game[0][0]!=0 && game[0][1]!=0 && game[0][2]!=0 && game[1][0]!=0 && game[1][1]!=0 && game[1][2]!=0 && game[2][0]!=0 && game[2][1]!=0 && game[2][2]!=0)) { //диагональ 2 собрана
                        k = false;
                        }
                    //вывод актуальной матрицы в консоль
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(game[i][j] + " ");
                        }
                        System.out.println();
                    }
        }
        while (k) ;
        System.out.println("GAME OWER");
    }
  }





