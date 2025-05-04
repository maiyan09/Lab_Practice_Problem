#include <stdio.h>

int main()
{
    unsigned int a, b;
    
    while (1)
    {
        scanf("%u %u", &a, &b);
        
        if (a == 0 && b == 0)
        {
            break;
        }
        int count = 0, carry = 0;
        
        while (a > 0 || b > 0)
        {
            int rem1 = a % 10;
            int rem2 = b % 10;
            if (rem1+rem2+carry > 9)
            {
                carry = 1;
                count++;
            }
            else
            {
                carry = 0;
            }
            a = a / 10;
            b = b / 10;
        }
        if (count == 0)
        {
            printf("No carry operation.\n");
        }
        else if (count == 1)
        {
            printf("1 carry operation.\n");
        }
        else
        {
            printf("%d carry operations.\n", count);
        }
    }
    return 0;
}
