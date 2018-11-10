package com.tkx.tian_demo.morphia;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

import java.util.LinkedList;
import java.util.List;

public class TestMain {

    public static void main(String [] args){
        TestMain t = new TestMain();
        t.addRecord();


    }


    public void addRecord(){
        ConnectConfig cnn = new ConnectConfig();
        cnn.initialize();
        Datastore datastore = cnn.datastore;
        final Employee elmer = new Employee("Elmer Fudd", 50000.0);
        datastore.save(elmer);
        final Employee daffy = new Employee("Daffy Duck", 40000.0);
        datastore.save(daffy);

        final Employee pepe = new Employee("Pepé Le Pew", 25000.0);
        datastore.save(pepe);
        elmer.setDirectReports(new LinkedList<Employee>());

        elmer.getDirectReports().add(daffy);
        elmer.getDirectReports().add(pepe);

        elmer.setBoss(new Boss("kexindage"));

        datastore.save(elmer);
    }

    public void queryRecord(){
        ConnectConfig cnn = new ConnectConfig();
        cnn.initialize();
        Datastore datastore = cnn.datastore;
        final Query<Employee> query = datastore.createQuery(Employee.class);
        final List<Employee> employees = query.asList();
        for (Employee employee:employees){
            System.out.println(employee.toString());
        }

    }

}
