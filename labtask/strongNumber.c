//A strong number is a positive integer where the sum of the factorials of its digits equals the original number
//    145= 1! + 4! + 5! = 1 + 24 + 120 = 145 
#include <stdio.h>
int main()
{
    int num, sum = 0;
    scanf("%d", &num);
    int originalNumber = num;

    while (num > 0)
    {
        long long int fact = 1;
        int rem = num % 10;
        for (int i = 1; i <= rem; i++)
        {
            fact = fact * i;
        }
        sum = sum + fact;
        num = num / 10;
    }

    if (originalNumber == sum)
    {
        printf("Strong Number\n");
    }
    else
    {
        printf("Not Strong Number\n");
    }
    return 0;
}
