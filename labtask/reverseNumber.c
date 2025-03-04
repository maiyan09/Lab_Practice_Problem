#include <stdio.h>
int main()
{
    int num, reverse = 0;
    scanf("%d", &num);

    while (num > 0)
    {
        int rem = num % 10;
        reverse = reverse*10 + rem;
        num = num / 10;
    }
    printf("%d\n", reverse);
    return 0;
}
