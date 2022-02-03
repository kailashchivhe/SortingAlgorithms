package com.kailash;

import com.kailash.helper.SortHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        * To print output to file uncomment the below code.
        * */
//        PrintStream o = new PrintStream(new File("output3.txt"));
//        PrintStream console = System.out;
//        System.setOut(o);

        System.out.println("*******************************************************************************");
        System.out.println("***>><<<*>>> Time Complexities for below input sizes: <<<*>>><<***");
        System.out.println("*>><<<*>>>   1K 2K 4K 5K 10K 20K 40K 50K 60K 80K 100K <<<*>>><<*");
        System.out.println("*******************************************************************************");

        SortHelper.initiateSorting();

//        System.setOut(console);
    }
}
