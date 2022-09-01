public class Employee {

   private static int counter = 0;
   private String fullName;
  private int department;
   private int salary;

   private int id;

   public String getFullName() {
      return this.fullName;
   }

   public int getDepartment() {
      return this.department;
   }

   public int getSalary() {
      return salary;
   }

   public void setDepartment(int department) {
      this.department = department;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public Employee(String fullName, int department, int salary){
      this.fullName=fullName;
      this.department=department;
      this.salary=salary;
      this.id = counter++;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "fullName='" + fullName + '\'' +
              ", department=" + department +
              ", salary=" + salary +
              ", id=" + id +
              '}';
   }
}
