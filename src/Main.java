import java.util.Random;

public class Main {
    
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        
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

     for (int i = 0; i < employees.length; i++){
         employees[i] = new Employee(fullnames[i], new Random().nextInt(5) +1, new Random().nextInt(100) + 300, i);
     }

     toString(employees);
     System.out.println("SUM :" + countSumSalary(employees));
     System.out.println("MIN :" + getMinSalary(employees));
     System.out.println("MAX :" + getMaxSalary(employees));
     System.out.println("AVERAGE :" + getAverageSalary(employees));
     getFullnames(employees);

    }

    public static void toString(Employee[] employees){
        for ( int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    public static int countSumSalary(Employee[] employees){
        int sum = 0;
        for ( int i = 0; i < employees.length; i++){
           sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static int getMinSalary(Employee[] employees){
        int min = getMaxSalary(employees) + 1;
        for (int i = 0; i < employees.length; i++){
            if(min > employees[i].getSalary()){
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static int getMaxSalary(Employee[] employees){
        int max = 0;
        for (int i = 0; i < employees.length; i++){
            if(max < employees[i].getSalary()){
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public static double getAverageSalary(Employee[] employees){
        int length = employees.length;
        return (double)countSumSalary(employees)/length;
    }

    public static void getFullnames(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getFullName());
        }
    }
}