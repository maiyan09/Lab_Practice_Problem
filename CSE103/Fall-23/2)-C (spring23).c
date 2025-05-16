#include <stdio.h>

int main()
{
    FILE *file;
    file = fopen("wannaCry.txt", "w");
    
    if (file == NULL)
    {
        printf("File does't exist.\n");
    }
    else
    {
        printf("File opened succecsully\n");
    }
    fclose(file);
    
    return 0;
}
