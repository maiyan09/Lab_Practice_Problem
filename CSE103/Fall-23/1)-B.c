#include <stdio.h>
#include <math.h>

int isPrime(int n)
{
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            return 0;
        }
    }
    return 1;
}
void printPrimeInRange(int low, int high)
{
    for (int i = low; i <= high; i++)
    {
        if (isPrime(i))
        {
            printf("%d ", i);
        }
    }
}

int main()
{
    int high, low;
    scanf("%d %d", &low, &high);
    
    printPrimeInRange(low, high);

    return 0;
}