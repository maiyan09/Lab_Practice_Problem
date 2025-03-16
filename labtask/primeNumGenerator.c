#include <stdio.h>
#include<math.h>
int main()
{
    int num1;
    scanf("%d", &num1);

    for (int i = 2; i <= num1; i++)
    {
        int count = 1;
        for (int j = 2; j <= sqrt(i); j++)
        {
            if (i % j == 0)
            {
                count = 0;
                break;
            }
        }
        if (count == 1)
        {
            printf("%d ", i);
        }
    }
}
