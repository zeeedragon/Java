package softuni;

//31.ДСП, която преобразува въведена от клавиатурата оценка в букви
//в числова оценка.Оценката в букви се състои от буквите A, B, C, D и F,
//следвани евентуално от знак + или -. Съответните числови еквиваленти са
//4,3,2,1 и 0. Няма F+ или F-. Знакът + увеличава с 0.3, а знакът – намаля
//с 0.3. Разбира се А+ е 4.
//        Пример
//        Вход						Изход
//        А+						4
//        В-						2.7


import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase();
        in.close();

        if (input.charAt(0) == 'A') {
            if (input.charAt(1) == '-') {
                System.out.println(4 - 0.3);
            } else {
                System.out.println(4);
            }
        } else if (input.charAt(0) == 'B') {
            if (input.charAt(1) == '-') {
                System.out.println(3 - 0.3);
            } else {
                System.out.println(3 + 0.3);
            }
        } else if (input.charAt(0) == 'C') {
            if (input.charAt(1) == '-') {
                System.out.println(2 - 0.3);
            } else {
                System.out.println(2 + 0.3);
            }
        } else if (input.charAt(0) == 'D') {
            if (input.charAt(1) == '-') {
                System.out.println(1 - 0.3);
            } else {
                System.out.println(1 + 0.3);
            }
        } else if (input.charAt(0) == 'F') {
            System.out.println(0);
        }
    }
}
