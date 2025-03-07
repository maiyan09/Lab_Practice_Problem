#include <stdio.h>

int main()
{
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    
    int temp = num1;
    num1 = num2;
    num2 = temp;
    
    printf("After swaping %d and %d", num1, num2);

    return 0;
}
