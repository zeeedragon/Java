package misc.oldestFamilyMember;

import java.lang.reflect.Method;
import java.util.Scanner;

public class oldestFamilyMemberMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Method getOldestMethod = Family.class.getMethod("getOldestMember");
        Method addMemberMethod = Family.class.getMethod("addFamilyMember", Person.class);

        Family family = new Family();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {

            String[] tokens = in.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            family.addFamilyMember(person);
        }
        System.out.printf("%s %d",
                family.getOldestMember().getName(),
                family.getOldestMember().getAge());
    }
}
