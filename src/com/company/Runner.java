package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println(new Walkup());
        System.out.println(new Advance(15));
        System.out.println(new Advance(5));
        System.out.println(new StudentAdvance(15));
        System.out.println(new StudentAdvance(5));
    }
}