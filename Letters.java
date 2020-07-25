package com.epam.StreamsAndLambdas;

import java.util.stream.*;
public class Letters{
public static void printStrings(Stream<String> stream)
{
    System.out.print("List is ");
    stream.filter(s->s.startsWith("a")).filter(s -> s.length()==3).forEach(s->{System.out.print(s+" ");});
}
public static void main(String args[])
{
    Stream<String> streamOfArray = Stream.of("air","sand","airtel","hello");
    Letters.printStrings(streamOfArray);
}
}