package queueCollection;

//Банка UBB разполага с две каси – първата обслужва фирми,
//а втората – физически лица. Времето за обслужване на една фирма
//е 20 единици от време, а на физическо лице – 10. Когато
//едната каса е свободна, а на другата има опашка, то свободната
//каса обслужва клиента, който е първи в опашката на другата каса.
//Времето за обслужване не се определя от номера на касата, а от
//вида на клиента (физическите лица се обслужват за 10 единици
//от време, независимо от касата, а фирмите – за 20). Да се напише
//програма, която моделира горния процес за 300 единици от време и
//печата номерата на обслужените клиенти по следното правило: буква
//В за фирми или буква С за физически лица, следвани от номер на заявката
//за обслужване. Заявка за обслужване се прави с генератора на случайни
//числа – генерира се случайно число   от 0 до 599.  Ако   е налице фирма,
//ако   - физическо лице, а ако   - не пристига клиент(няма заявка).
//Генерираното число съвпада с номера на заявката за обслужване.

import java.util.Deque;
import java.util.Random;
import java.util.ArrayDeque;



public class BankStands {
    public static void main(String[] args) {
        Random clientRequest = new Random();
        Deque<Integer> companies = new ArrayDeque<>();
        Deque<Integer> people = new ArrayDeque<>();
        Deque<Integer> total = new ArrayDeque<>();
        int person = 0;
        int company = 0;
        int random = 0;

        for (int time = 1; time <= 300; time++) {

            //generating randoms and adding them to corresponding queue
            random = clientRequest.nextInt(600);

            if (random <= 50) {
                people.addLast(random);
            }
            if (random >= 550) {
                companies.addLast(random);
            }

            if (person == 0) {
                if (!people.isEmpty()) {
                    System.out.println("B with number " + people.removeFirst() + " started being serviced at " + time);
                    person = 10;
                    //if the desk is free and no one is waiting, we check if we can service a company-client waiting at the other line
                } else if (!companies.isEmpty() && company != 0) {
                    System.out.println("C - company on the people line, with number " + companies.removeFirst() + " started being serviced at " + time);
                    person = 20;
                }
            } else {
                person--;
            }

            if (company == 0) {
                if (!companies.isEmpty()) {
                    System.out.println("C with number " + companies.removeFirst() + " started being serviced at " + time);
                    company = 20;
                    //if the desk is free and no one is waiting, we check if we can service a person-client waiting at the other line
                } else if (!people.isEmpty() && person != 0) {
                    System.out.println("B - person on the company line, with number " + people.removeFirst() + " started being serviced at " + time);
                    company = 10;
                }
            } else {
                company--;
            }
        }
        System.out.println(people.size() + companies.size() + " waiting");
    }
}
