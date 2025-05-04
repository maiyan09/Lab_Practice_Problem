#include <stdio.h>
#include <string.h>

int main()
{
    while (1)
    {
        char ch[1005];
        scanf("%s", ch);
        
        int length = strlen(ch);
        
        if (length == 1 && ch[0] == '0')
        {
            break;
        }
        int sum = 0;
        int i, j;
        
        for (i = 0; i < length; i=i+2)
        {
            sum += ch[i]-'0';
        }
        for (j = 1; j < length; j=j+2)
        {
            sum -= ch[j]-'0';
        }
        if (sum % 11 == 0)
        {
            printf("%s is a multiple of 11.\n", ch);
        }
        else
        {
            printf("%s is not a multiple of 11.\n", ch);
        }
    }
        
    return 0;
}
