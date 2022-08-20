import java.util.Random;

public class Main {
    public static void main(String[] args) {

     Employee[] employees = new Employee[10];
     String[] fullnames = {
                "Володин Виктор Павлович",
                "Смирнов Валентин Павлович",
                "Иванов Евгений Петрович",
                "Абрамов Александр Амброзьевич",
                "Соболев Кирил Константинович",
                "Варламов Илья Сергеевич",
                "Борисов Сергей Евгеньевич",
                "Данилов Алексей Маркович",
                "Маврин Пётр Иванович",
                "Павлов Никита Олегович"};

     for (Employee.id = 0; Employee.id < employees.length; Employee.id++){
         employees[Employee.id] = new Employee(fullnames[Employee.id], new Random().nextInt(5) +1, new Random().nextInt(100) + 300);
     }

     toString(employees);
     System.out.println("SUM :" + countSumSalary(employees));
     System.out.println("MIN :" + getMinSalary(employees));
     System.out.println("MAX :" + getMaxSalary(employees));
     System.out.println("AVERAGE :" + getAverageSalary(employees));
     getFullnames(employees);

    }

    public static void toString(Employee[] employees){
        for (Employee.id = 0; Employee.id < employees.length; Employee.id++){
            System.out.println(employees[Employee.id]);
        }
    }

    public static int countSumSalary(Employee[] employees){
        int sum = 0;
        for (Employee.id = 0; Employee.id < employees.length; Employee.id++){
           sum = sum + employees[Employee.id].getSalary();
        }
        return sum;
    }

    public static int getMinSalary(Employee[] employees){
        int min = 0;
        for (Employee.id = 0; Employee.id < employees.length; Employee.id++){
            if(min > employees[Employee.id].getSalary()){
                min = employees[Employee.id].getSalary();
            }
        }
        return min;
    }

    public static int getMaxSalary(Employee[] employees){
        int max = 0;
        for (Employee.id = 0; Employee.id < employees.length; Employee.id++){
            if(max < employees[Employee.id].getSalary()){
                max = employees[Employee.id].getSalary();
            }
        }
        return max;
    }

    public static double getAverageSalary(Employee[] employees){
        int length = employees.length;
        return (double)countSumSalary(employees)/length;
    }

    public static void getFullnames(Employee[] employees){
        for (Employee.id = 0; Employee.id < employees.length; Employee.id++){
            System.out.println(employees[Employee.id].getFullName());
        }
    }
}