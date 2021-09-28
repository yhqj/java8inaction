package com.java8.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//3.3
public class Example {

    public static String processFile() throws IOException{
        try(  BufferedReader br =new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static String processFile2(BufferedReaderProcessor p) throws IOException{
        try(  BufferedReader br =new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String oneLine = processFile2((BufferedReader br)-> br.readLine());
    }
}
