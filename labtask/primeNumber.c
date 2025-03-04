#include <stdio.h>
#include <math.h>
int main()
{
    int num, count = 1;
    scanf("%d", &num);

    for (int i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            count = 0;
            break;
        }
    }
    if (count == 1)
    {
        printf("Number is Prime\n");
    }
    else
    {
        printf("Number is not Prime\n");
    }
    return 0;
}
