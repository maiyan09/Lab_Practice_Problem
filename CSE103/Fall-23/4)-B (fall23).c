#include <stdio.h>
#include <ctype.h>

int main()
{
    char ch[100];
    fgets(ch, sizeof(ch), stdin);
    
    printf("Consonants are: ");
    for (int i = 0; ch[i] != '\0'; i++)
    {
        if (isalpha(ch[i]))
        {
            if (!(ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'a' || ch[i] == 'U' || ch[i] == 'O' || ch[i] == 'I' || ch[i] == 'E' || ch[i] == 'A'))
            {
                printf("%c ",  ch[i]);
            }
        }
    }
    
    return 0;
}
