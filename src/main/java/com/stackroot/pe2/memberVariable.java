package com.stackroot.pe2;
/* program to intialize the datamember and display using instance of the member class*/

public class memberVariable {
    public static void main(String args[])
    {
        Member objmember=new Member();
        objmember.setName("Harry pot");
        objmember.setAge(30);
        objmember.setSalary(2500);
        System.out.println("member salary" +objmember.getName());
        System.out.println("member salary" +objmember.getAge());
        System.out.println("member salary" +objmember.getSalary());
    }


}
class Member
{
    String name;
    int age;
    float salary;
    /*setting the value for variables*/

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)

    {
        this.age=age;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    /* fetch the value of Datamember*/
    public String getName()
    {
        return name;
    }
    public  int getAge()
    {
     return age;
    }
    public float getSalary()
    {
        return salary;
    }
}

