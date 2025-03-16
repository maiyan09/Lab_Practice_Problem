#include <stdio.h>
#include <limits.h>

int main()
{
    int arr[4][3]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
    
    int max = INT_MIN, min= INT_MAX;
    for (int i = 0 ; i < 4; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (arr[i][j] > max)
            {
                max = arr[i][j];
            }
            if (arr[i][j] < min)
            {
                min = arr[i][j];
            }
        }
    }
    printf("max is: %d and min is %d", max, min);

	return 0;
}
