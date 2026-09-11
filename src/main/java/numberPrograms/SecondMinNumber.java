package numberPrograms;

public class SecondMinNumber {
    public static void main(String[] args){
        int num=79162;
        int min=9;
        int secondMin=9;
        while(num>0){
            int digit=num%10;
            if(digit<min){
                secondMin=min;
                min=digit;
            }
            else if(digit>min && digit<secondMin){
                secondMin=digit;
            }
            num=num/10;
        }
        System.out.println(secondMin);
        System.out.println(min);
    }
}
/*1. The three important variables

Imagine two boxes:

        MIN          SECOND MIN
         ↓                ↓
       [ ? ]            [ ? ]

Whenever we see a new digit, we ask:

Question 1:

Is this digit smaller than MIN?

If YES → it becomes the new MIN.

But the old MIN doesn't disappear! It moves to SECOND MIN.

if (digit < min) {
    secondMin = min;
    min = digit;
}

Think:

Before:
MIN = 3
SECOND = 5

New digit = 2

After:
MIN = 2
SECOND = 3

So remember:

New MIN comes → old MIN becomes SECOND MIN.

2. What if the digit is NOT smaller than MIN?

Then we check:

else if (digit > min && digit < secondMin) {
    secondMin = digit;
}

This means:

"The digit is bigger than MIN, but smaller than the current SECOND MIN."

Therefore, it deserves the second position.

Example:

MIN = 2
SECOND MIN = 5

New digit = 3

3 is:

2 < 3 < 5

So:

MIN = 2
SECOND MIN = 3
3. The complete thought process

Every new digit goes through this decision:

              New digit
                  |
                  ↓
        Is digit < MIN?
             /       \
           YES        NO
            |          |
            ↓          ↓
      Old MIN →     Is digit > MIN
      SECOND MIN    AND digit < SECOND MIN?
                         /       \
                       YES        NO
                        |          |
                        ↓          ↓
                  digit becomes   Ignore
                  SECOND MIN

That's the entire logic.*/
