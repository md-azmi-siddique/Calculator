package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {

    public static void sata(){

        Stack<String> num = new Stack<String>();
        num.push("0");
        num.push("1");
        num.push("2");
        num.push("3");
        num.push("4");
        System.out.println(num);
        System.out.println("Stack target is on: "+num.peek());
        System.out.println("Pop value: "+num.pop());
        System.out.println("New Stack target is on: "+num.peek());
        System.out.println(num);

        Queue<String> enter = new LinkedList<String>();
        enter.add("0");
        enter.add("1");
        enter.add("2");
        enter.add("3");
        enter.add("4");
        System.out.println(enter);
        System.out.println("Target is on: "+enter.peek());
        enter.remove();
        System.out.println(enter);
        System.out.println("Target is on: "+enter.peek());


        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        s.push("How");
        s.push("are");
        s.push("you");
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        System.out.println(q);

    }
}
