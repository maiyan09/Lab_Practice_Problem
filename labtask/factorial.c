#include <stdio.h>
int main()
{
    int num;
    scanf("%d", &num);

    long long int fact = 1;

    for (int i = 1; i <= num; i++)
    {
        fact = fact * i;
    }
    printf("%lld\n", fact);
    return 0;
}