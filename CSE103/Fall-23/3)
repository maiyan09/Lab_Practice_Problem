#include <stdio.h>

struct smartPhone
{
    long long int imei;
    int processor;
    float screen;
    int battery;
    int price;
    
};

int phoneScreenSize(struct smartPhone phone[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (phone[i].screen >= 5.0)
        {
            count++;
        }        
    }
    return count;
}

long long int imeiNumber(struct smartPhone phone[], int n)
{
    int max = phone[0].battery, index = 0;
    for (int i = 1; i < n; i++)
    {
        if (phone[i].battery > max)
        {
            max = phone[i].battery;
            index = i;
        }
    }
    return phone[index].imei;
}
int main()
{
    int n;
    scanf("%d", &n);
    
    struct smartPhone phone[n];
    
    for (int i = 0; i < n; i ++)
    {
        printf("Enter IMEI: ");
        scanf("%lld", &phone[i].imei);
        
        printf("Enter processor: ");
        scanf("%d", &phone[i].processor);
        
        printf("Enter screen: ");
        scanf("%f", &phone[i].screen);
        
        printf("Enter battery: ");
        scanf("%d", &phone[i].battery);
        
        printf("Enter price: ");
        scanf("%d", &phone[i].price);
    }
    
    int screenSize = phoneScreenSize(phone, n);
    printf("Screen size of at least 5 inches: %d\n", screenSize);
    
    long long int batteryIMEI = imeiNumber(phone, n);
    printf("IMEI number of the smartphone with the highest battery capacity: %lld\n", batteryIMEI);

    return 0;
}
