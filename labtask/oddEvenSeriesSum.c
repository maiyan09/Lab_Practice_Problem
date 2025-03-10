#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    
    float sum = 0;
    
    for (int i = 1; i <= n; i++)
    {
      if (i % 2 == 0)
      {
        sum = sum - (1.0)/i;
      }
      else
      {
        sum = sum + (1.0)/i;
      }
    }
    printf("%f\n", sum);

    return 0;
}

/*
  1 - 1/2 + 1/3 - 1/4 + ... + 1/n
*/
