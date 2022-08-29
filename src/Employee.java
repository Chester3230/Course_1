public class Employee {

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

   public Employee(String fullName, int department, int salary, int id){
      this.fullName=fullName;
      this.department=department;
      this.salary=salary;
      this.id = id;
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
