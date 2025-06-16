

    class Employee
    {
        int empid;
        String name;
        double salary;
        public  void Displaydetails()
        {
            System.out.println("EmplId is "+ empid);
            System.out.println("Empname is "+ name);
            System.out.println("Empsal is "+ salary);
        }

        public static void main(String[] args) {
            Employee e = new Employee();
            e.empid=1;
            e.name="Harsha";
            e.salary=1001.2;

            e.Displaydetails();
        }

    }


