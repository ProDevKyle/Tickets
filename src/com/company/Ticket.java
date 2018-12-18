package com.company;
import java.util.ArrayList;

public abstract class Ticket
{
    private int serialNumber;
    private static ArrayList<Integer> tickets = new ArrayList<>();

    public Ticket()
    {
        serialNumber = getNextSeriaNumber();
    }

    public abstract double getPrice();

    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSeriaNumber()
    {
        int num = (int) (Math.random() * 900) + 100;
        while (tickets.contains(num))
        {
            num = (int) (Math.random() * 900) + 100;
        }
        tickets.add(num);
        return num;
    }
}
