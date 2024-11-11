package MyJavaProject.LeetCode;

import java.util.Stack;

public class Valid_perenthses {


    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if (ch=='('||ch=='{'||ch=='[')
            {
                stack.push(ch);
            }
            else if (ch==')'||ch=='}'||ch==']') {
                if (stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if ((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
                {
                    return false;
                }

            }

        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {

        String s="(]";
        if (isValid(s))
        {
            System.out.println("the bracket present");
        }
        else {
            System.out.println("not present");
        }

    }
}
