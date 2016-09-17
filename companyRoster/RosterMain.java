package misc.companyRoster;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class  RosterMain {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> departmentsWithSalary = new HashMap<>();
        HashMap<String, TreeSet<Employee>> departmentsWithEmployees = new HashMap<>();

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().split("\\s+");
            String name = params[0];
            Double salary = Double.parseDouble(params[1]);
            String position = params[2];
            String department = params[3];
            Employee employee = null;

            if (params.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (params.length == 5) {
                if (isNumber(params[4])) {
                    int age = Integer.valueOf(params[4]);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    String email = params[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            } else {
                int age = Integer.valueOf(params[5]);
                String email = params[4];
                employee = new Employee(name, salary, position, department, email, age);
            }
            if (!departmentsWithEmployees.containsKey(department)) {
                departmentsWithEmployees.put(department, new TreeSet<>());
                departmentsWithSalary.put(department, 0.0);
            }
            departmentsWithEmployees.get(department).add(employee);
            departmentsWithSalary.put(department, departmentsWithSalary.get(department) + salary);
        }
        Map.Entry<String, TreeSet<Employee>> best = departmentsWithEmployees.entrySet().stream().sorted((e1, e2) -> Double.compare(departmentsWithSalary.get(e2.getKey()),
                departmentsWithSalary.get(e1.getKey()))).findFirst().get();
        System.out.printf("Highest Average Salary: %s%n", best.getKey());
        for (Employee employee : best.getValue()) {
            System.out.println(employee);
        }
    }

    private static boolean isNumber(String param) {
        try {
            Integer.parseInt(param);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
