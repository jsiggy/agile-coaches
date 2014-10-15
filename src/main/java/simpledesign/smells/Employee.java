package simpledesign.smells;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    static int IDs = 0;

    long id;
    UserDetails user;
    BigDecimal salary;
    Date startDate;
    Employee manager;

    public Employee() {
        id = IDs++;
    }

    public long getId() {
        return id;
    }

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (manager != null ? !manager.equals(employee.manager) : employee.manager != null) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        if (startDate != null ? !startDate.equals(employee.startDate) : employee.startDate != null) return false;
        if (user != null ? !user.equals(employee.user) : employee.user != null) return false;

        return true;
    }
}
