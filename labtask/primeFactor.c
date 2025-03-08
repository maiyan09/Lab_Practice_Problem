#include <stdio.h>
#include <math.h>

int main()
{
    int num;
    scanf("%d", &num);
    
    for (int i = 2; i <= num; i++)
    {
        if (num % i == 0)
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
    
    return 0;
}
