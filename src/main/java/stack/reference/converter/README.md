# Infix to Postfix Converter

A Java program to convert valid infix expression to a postfix expression.

The expression can have the following operators:
- `+`
- `-`
- `%`
- `*`
- `/` 
- and alphabets from `a` to `z`.

The precedence of the operators `+` and `-` is lesser than precedence of operators `*`, `/`, `%`.

Parenthesis have the highest precedence and the expression inside it must be converted first.

| Infix     | Postfix |
|-----------|---------|
| a%b       | ab%     |
| a+b*(c+d) | abcd+*+ |
| a+b+*c+d  | abc*+d+ |

- We are going to use the Stack data structure to solve this problem. 
- We will use a stack to store the operators and parenthesis to enforce the precedence.
- We will start parsing the expression from left to right.

If the current character is - 
* an alphabet, append it to a temporary output String (StringBuilder)
* an operator, pop all the operators (to the temporary output string) that have precedence equal to or higher than the
current operator and then push the current operator
* a right parenthesis `)`, pop all operators (to the temporary output string) until a left parenthesis `(` is encountered
* a left parenthesis `(`, simply push it to the stack

In the end pop all the operators in the stack to the temporary output string

[Infix to Postfix Converter](../converter/InfixToPostfixConverter.java)