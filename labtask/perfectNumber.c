#include <stdio.h>
int main()
{
    int num, sum = 0;
    scanf("%d", &num);

    for (int i = 1; i < num; i++)
    {
        if (num % i == 0)
        {
            sum = sum + i;
        }
    }
    if (num == sum)
    {
        printf("Number is Parfect\n");
    }
    else
    {
        printf("Number is not Parfect\n");
    }
    return 0;
}
