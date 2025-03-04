#include <stdio.h>
int main()
{
    int num, palindrom = 0;
    scanf("%d", &num);

    int number = num;

    while (num > 0)
    {
        int rem = num % 10;
        palindrom = palindrom*10 + rem;
        num = num / 10;
    }
    if (number == palindrom)
    {
        printf("Number is Palindrom\n");
    }
    else
    {
        printf("Number is not Palindrom\n");
    }
    
    return 0;
}
