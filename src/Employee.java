public class Employee {

   private String fullName;
   int department;
   int salary;

   public static int id;

   public String getFullName() {
      return this.fullName;
   }

   public int getDepartment() {
      return this.department;
   }

   public int getSalary() {
      return salary;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
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
   }

   @Override
   public String toString() {
      return "Employee{" +
              "fullName='" + fullName + '\'' +
              ", department=" + department +
              ", salary=" + salary +
              '}';
   }
}
