package com.loveablejerk;

public class Employee {

    double totalSalary,commission =500;
    int bonus = 5000, target = 20;

   public Employee(String empName, double basicSalary, double sales){

       isTargetAchieved(empName,basicSalary,sales);

   }


   public void isTargetAchieved(String empName,double basicSalary, double sales){
       if(sales <= target){
           commission = sales * 500;
           totalSalary = basicSalary + commission;
           System.out.println("Hello! " + empName + " Your Total salary for this month with commission of Rs 500 per sale is Rs: " + totalSalary);
       }

       else{
           commission = commission * sales * 2;
           totalSalary = bonus + basicSalary + commission;
           System.out.println("Hello! " + empName + " Congratulations!!! you are qualified for the Bonus and Double Commission this month");
           System.out.println("Special Bonus of Rs 5000 and Commission of Rs 1000 per sale Has been added in your salary");
           System.out.println("Now Your Total Salary For this Month is Rs: " + totalSalary);
       }
   }
}

