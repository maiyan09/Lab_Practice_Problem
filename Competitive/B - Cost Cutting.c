#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    
    for (int i = 1; i <= n; i++)
    {
        int a, b, c;
        scanf("%d %d %d", &a, &b, &c);
        
        if ((a > b && a < c) || (a > c && a < b))
        {
            printf("Case %d: %d\n", i, a);
        }
        else if ((b > a && b < c) || (b > c || b < a))
        {
            printf("Case %d: %d\n", i, b);
        }
        else
        {
            printf("Case %d: %d\n", i, c);
        }
    }

    return 0;
}