#include <stdio.h>

int main()
{
    int num1, num2, lcm;
    scanf("%d %d", &num1, &num2);
    
    int max = (num1 < num2) ? num2 : num1;
    int i = max;
    
    while (1)
    {
        if ((i % num1 == 0) && (i % num2 == 0))
        {
            lcm = i;
            break;
        }
        i = i + max;
        //or i++;
    }
    printf("LCM is: %d\n", lcm);  
    
    return 0;
}
