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
         employees[i] = new Employee(fullnames[i], new Random().nextInt(5) +1, new Random().nextInt(100) + 300);
     }

     printEmployess();
     System.out.println("SUM :" + countSumSalary());
     System.out.println("MIN :" + getMinSalary());
     System.out.println("MAX :" + getMaxSalary());
     System.out.println("AVERAGE :" + getAverageSalary());
     printFullnames();

    }

    private static void printEmployess(){
        for ( int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    private static int countSumSalary(){
        int sum = 0;
        for ( int i = 0; i < employees.length; i++){
           sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    private static int getMinSalary(){
        int min = getMaxSalary() + 1;
        for (int i = 0; i < employees.length; i++){
            if(min > employees[i].getSalary()){
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    private static int getMaxSalary(){
        int max = 0;
        for (int i = 0; i < employees.length; i++){
            if(max < employees[i].getSalary()){
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    private static double getAverageSalary(){
        int length = employees.length;
        return (double)countSumSalary()/length;
    }

    private static void printFullnames(){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getFullName());
        }
    }
}
