package com.assigements;



public class Student {
	int rollno;
    String name;
    static String college ="GGGI"; //Static Variable gets memory once

    /*Constructor of Student class*/
    public Student(int r, String n) {
		// TODO Auto-generated constructor stub
    	rollno = r;
        name = n;
        college = "Sind";
	}

	/*Method For Displaying Student Details*/
    void display()
    {
        System.out.println(rollno+" "+name+" "+college); // print the value of roll no, name and college
    }
}
