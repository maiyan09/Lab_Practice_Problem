public static boolean checkSequence(int a, int b, int c) {
        int x = a+b+c;
        int y = 3 * (a+1); //if three number are consicutive then their sum must be equal 3*(first_number + 1)
        if (x == y)
            return true;
        else
            return false;
    }
/*
If the first number is x, then the next two are: x+1, x+2
The sum of three consecutive numbers : x + (x+1) + (x+2) = 3x+3
*/
