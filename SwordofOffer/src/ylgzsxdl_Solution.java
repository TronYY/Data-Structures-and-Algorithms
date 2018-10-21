package jzoffer;

import java.util.Stack;

public class ylgzsxdl_Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
		while (!stack1.empty())
			stack2.push(stack1.pop());
        stack1.push(node);//压入时，先把上面部分挪到2号栈
		while (!stack2.empty())
			stack1.push(stack2.pop());
        
    }
    
    public int pop() {
        return stack1.pop();
    }
}
