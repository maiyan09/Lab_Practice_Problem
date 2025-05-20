#include <stdio.h>

struct laptop
{
    int model;
    int speed;
    int ram;
    int hardDisk;
    int price;
};

int highSpeedProcessor(struct laptop L[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (L[i].speed > 2)
        {
            count++;
        }
    }
    return count;
}

int lowestPrice(struct laptop L[], int n)
{
    int min = L[0].price, index;
     for (int i = 1; i < n; i++)
     {
         if (L[i].price < min)
         {
             min = L[i].price;
             index = i;
         }
     }
     return L[index].model;
}

int main()
{
    int n;
    printf("Enter Number of laptop: ");
    scanf("%d", &n);

    struct laptop L[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter Laptop model: ");
        scanf("%d", &L[i].model);

        printf("Enter Laptop speed: ");
        scanf("%d", &L[i].speed);

        printf("Enter Laptop RAM size: ");
        scanf("%d", &L[i].ram);

        printf("Enter Laptop Hard Disk(Bytes): ");
        scanf("%d", &L[i].hardDisk);

        printf("Enter Laptop price: ");
        scanf("%d", &L[i].price);
    }

    int result = highSpeedProcessor(L, n);
    printf("%d  Laptops has a processor speed of at least 2.0 GHz.\n");

    int resultModel = lowestPrice(L, n);
    printf("Laptop with the lowest price model number is: %d", resultModel);


    return 0;
}
