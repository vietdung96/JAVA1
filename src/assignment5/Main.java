package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        News nw = new News(12, "thời tiết", "20/9/2022", "Trần Việt Dũng", "Bão Noru đổ bộ vào miền Trung", 3);
        nw.Display();

        for (int i : nw.RateList) {
            i = sc.nextInt();
        }
       nw.Calculate();

    }
}
