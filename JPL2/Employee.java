public class Employee
{
    String name;
    long empNo;
    int deptNo;
    char empPosition; // ‘E’: Entry, ‘M’: Manager, ‘D’: Director, ‘P’: Project Leader
    int yearsOfExp;
    float salary;
    private String newLine = System.getProperty("line.separator");
    // Create and implement default constructor.
        Employee()
        {
            name = "";
            empNo = 0;
            deptNo = 0;
            empPosition = 'E';
            yearsOfExp = 0;
            salary = 0;
            print();
        }
        
        Employee(String setName, int num, int dept, char pos, int exp, double sal)
        {
            name = setName;
            empNo = (long)num;
            deptNo = dept;
            empPosition = pos;
            empPosition = Character.toUpperCase(empPosition);
            yearsOfExp = exp;
            salary = (int) sal;
            print();
        }
        
        Employee(String setName, int num, int dept, char pos, int exp)
        {
            name = setName;
            empNo = (long)num;
            deptNo = dept;
            empPosition = pos;
            yearsOfExp = exp;
            salary = 0;
            print();
        }
    // Create and implement second constructor.
    // Create and implement third constructor.
    // this method should return the text of the position of the employee
        public String getPosition()
        {
            empPosition = Character.toUpperCase(empPosition);
            String position = "N/A";
            if(empPosition == 'E')
                position = "Entry";
            if(empPosition == 'M')
                position = "Manager";
            if(empPosition == 'D')
                position = "Director";
            if(empPosition == 'P')
                position = "Project Leader";
            
            return position;
        }
    // this method should calculate the salary (see below)
        public void calculateSalary()
        {
            if(salary == 0 && deptNo != 0)
            {
                switch(empPosition)
                {
                    case 'E':
                        if(yearsOfExp < 2)
                            salary = 50000;
                        else if(yearsOfExp >= 2)
                            salary = 55000;
                        break;
                    case 'M':
                        salary = 70000;
                        break;
                    case 'D':
                        salary = 80000;
                    case 'P':
                        if(yearsOfExp < 4)
                            salary = 60000;
                        else if(yearsOfExp >= 4)
                            salary = 65000;
                        break;
                }
            }
        }
    // this routine should print the values of the data members
        public void print()
        {
            calculateSalary();
            System.out.println(
                    newLine +
                    "Employee Name:       " + name + newLine + 
                    "Employee Number:     " + empNo + newLine +
                    "Department Number:   " + deptNo + newLine +
                    "Position:            " + getPosition() + newLine +
                    "Years of Experience: " + yearsOfExp + newLine + 
                    "Salary:              " + salary);
        }

} //end of class

