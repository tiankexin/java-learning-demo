package com.tkx.tian_demo.morphia;

import lombok.Data;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.List;

@Entity("employees")
@Indexes(
        @Index(value = "salary", fields = @Field("salary"))
)
@Data
class Employee {

    @Id
    private ObjectId id;
    private String name;
    @Reference
    private Employee manager;
    @Reference
    private List<Employee> directReports;
    @Property("wage")
    private Double salary;

    private Boss boss;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                ", directReports=" + directReports +
                ", salary=" + salary +
                '}';
    }
}
