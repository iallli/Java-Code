package com.abc.newApp;

import com.first.application.PrintHello;
import com.first.application.utill.Utill;
import com.first.application1.Test;

public class HelloWorld
{
    public static void main(String[] args)
    {
        PrintHello printHello = new PrintHello();
        printHello.printHello();

        Test test = new Test();
        test.printTest();

        Utill utill = new Utill();
        utill.subUtill();
    }
}
