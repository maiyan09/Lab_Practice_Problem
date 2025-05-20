#include <stdio.h>

int main()
{
    int n, m;
    printf("Enter Row and Colom: ");
    scanf("%d %d", &n, &m);
    int arr1[n][m], arr2[n][m];

    printf("First array:\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("Second array:\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%d", &arr2[i][j]);
        }
    }
    int count = 1;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (arr1[i][j] != arr2[i][j])
            {
                count = 0;
                break;
            }
        }
    }
    if (count)
    {
        printf("STRICTLY IDENTICAL\n");
    }
    else
    {
        printf("NOT STRICTLY IDENTICAL\n");
    }

    return 0;
}
