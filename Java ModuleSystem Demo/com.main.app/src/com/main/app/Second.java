package com.main.app;

import com.first.application.PrintHello;
import com.first.application1.Test;

public class Second
{
    public static void main(String[] args)
    {
        PrintHello printHello = new PrintHello();
        printHello.printHello();

        Test test = new Test();
        test.printTest();

    }
}
