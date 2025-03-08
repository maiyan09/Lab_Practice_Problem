#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    
    for (int row = n; row >= 1; row--)
    {
        for (int space = 1; space <= n-row; space++)
        {
            printf(" ");
        }
        for (int col = 1; col <= row; col++)
        {
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}
/* Output: n=4

****
 ***
  **
   *
*/
