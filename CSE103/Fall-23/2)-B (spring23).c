#include <stdio.h>
#include <string.h>

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    int *ptr = arr;
    
    int max = *ptr;
    for (int i = 0; i < n; i++)
    {
        if (*(ptr+i) > max)
        {
            max = *(ptr+i);
        }
    }
    printf("Maximum Value: %d", max);
}
