#include <stdio.h>

int main()
{
    int num1, num2, gcd;
    scanf("%d %d", &num1, &num2);
    
    int small = (num1 < num2) ? num1 : num2;
    
    for (int i = 1; i <= small; i++)
    {
        if (num1 % i == 0 && num2 % i == 0)
        {
            gcd = i;
        }
    }
    printf("GCD is: %d\n", gcd);
  //printf("LCM is: %d\n", (num1*num2)/gcd);
    
    return 0;
}
