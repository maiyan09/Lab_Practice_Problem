#include <stdio.h>

int main() {
    int num1, num2;
    scanf("%d %d", &num1, &num2);

    int n1 = num1;
    int n2 = num2;
    
    while (num2 != 0)
    {
        int rem = num1 % num2;
        num1 = num2;
        num2 = rem;
    }
    printf("GCD is: %d\n", num1);
    //printf("LCM is: %d\n", (n1*n2)/num1);

    return 0;
}
