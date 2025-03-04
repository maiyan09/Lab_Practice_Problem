#include <stdio.h>
int main()
{
    int n, first = 0, second = 1, next;
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        printf("%d ", first);
        next = first + second;
        first = second;
        second = next;
    }
    /*nth fibonacci number
    printf("%d ", first);
    */
    return 0;
}