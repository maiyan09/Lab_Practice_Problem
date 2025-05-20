#include <stdio.h>

int minimum(int arr[], int n);

int main()
{
    int n, m;
    printf("Enter Size for two  matrix: ");
    scanf("%d %d", &n, &m);
    int arr1[n], arr2[n];

    printf("First array:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr1[i]);
    }
    printf("Second array:\n");
    for (int i = 0; i < m; i++)
    {
        scanf("%d", &arr2[i]);
    }

    printf("Minimum Value For First Array: %d\n", minimum(arr1, n));
    printf("Minimum Value For Second Array: %d\n", minimum(arr2, n));
    return 0;
}

int minimum(int arr[], int n)
{
    int min = arr[0];
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
    }
    return min;
}
