#include <stdio.h>

int main()
{
    char symbol;
    int num1, num2;
    
    printf("Enter the operator(+,-,*,/): ");
    scanf("%c", &symbol);
    
    printf("Enter two number: ");
    scanf("%d %d", &num1, &num2);
    
    switch (symbol)
    {
        case '+':
            printf("Sum is: %d\n", num1+num2);
            break;
        case '-':
            printf("subtraction is: %d\n", num1-num2);
            break;
        case '*':
            printf("Multiplication is: %d\n", num1*num2);
            break;
        case '/':
            if (num2 != 0)
            {
                printf("Division is: %.2f\n", (float)num1/num2);
            }
            else{
                printf("denominator cannot be zero\n");
            }
            break;
        default:
            printf("You entered Wrong operator\n");
        
    }

    return 0;
}
