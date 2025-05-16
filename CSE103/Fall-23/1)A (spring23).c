#include <stdio.h>
#include <ctype.h>

int main()
{
    char ch[100];
    printf("Enter string:\n");
    fgets(ch, sizeof(ch), stdin);
    
    printf("Vowels are: ");
    for (int i = 0; ch[i] != '\0'; i++)
    {
        if (isalpha(ch[i]))
        {
            if ((ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'a' || ch[i] == 'U' || ch[i] == 'O' || ch[i] == 'I' || ch[i] == 'E' || ch[i] == 'A'))
            {
                printf("%c ",  ch[i]);
            }
        }
    }
    printf("\n");
    printf("First Consonant is: ");
    for (int i = 0; ch[i] != '\0'; i++)
    {
        if (isalpha(ch[i]))
        {
            if (!(ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'a' || ch[i] == 'U' || ch[i] == 'O' || ch[i] == 'I' || ch[i] == 'E' || ch[i] == 'A'))
            {
                printf("%c", ch[i]);
                break;
            }
        }
    }
    
    return 0;
}
