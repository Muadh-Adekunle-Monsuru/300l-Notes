The decimal number system comprises of digits from 0-9. The base of the DNS is 10. 
Digital systems, and digital circuits requires familiarity with other numbering systems. 
- Binary 
- Hexadecimal
- Octal
These number systems have certain advantages over decimal number system and octal number system.
---

9's Compliment in Decimal Number System:
It can be obtained by subtracting every digit of a number by 9.
9's compliment of 27 = 72

|  | 2 | 7 |
| ---- | ---- | ---- |
| - | 9 | 9 |
|  | -- | -- |
|  | 7 | 2 |

Significance of 9's compliment: The procedure of subtraction can be done in much easier step with the aid of 9's compliment. When we subtract 2 numbers then we subtract the subtrahend from the minuend. But with 9's compliment we need not the do subtraction.  

In the case of: **307 - 27** 

Subtrahend: 27  
minuend: 307

Eg:
678 - 234 first find the 9's compliment the subtrahend from then add it to the minuend

9's compliment of 234

|  | 2 | 3 | 4 |
| ---- | ---- | ---- | ---- |
| - | 9 | 9 | 9 |
|  | -- | -- | -- |
|  | 7 | 6 | 5 |


|  | 6 | 7 | 8 |
| ---- | ---- | ---- | ---- |
| - | 7 | 6 | 5 |
|  | -- | -- | -- |
|  | *1* 4 | 4 | 3 |
|  |  |  | *1* |
|  | 4 | 4 | 4 |
|  |  |  |  |
![[2024_01_08 9_39 AM Office Lens (3).jpg | 200]]



---

## 10's Compliment

The 10's compliment of any decimal number can be obtained. By adding 1 to the 9's compliment of the same number. 

10's compliment of 7:

first the 9's compliment of 7 is 2
the 10's compliment: 2 + 1 = 3

The 10's compliment of a decimal number is crutial in subtracting one number from other. The subtraction can be achieved with the help of addition of 10's compliment of subtraend with minuend. When a smaller number is to be subtracted from a larger number in this case one carry would be generated and the carry is ignored the rest of the digits of the addition is the answer
![[2024_01_08 9_39 AM Office Lens (1).jpg|200]]


Larger number subtracted from a smaller number so there will be no carry generation, after addition of the 10's compliment of the subtraend with the minuend.  This indicates that the resultant answer is negative. The final answer can be evaluated by taking the 10's compliment of the number which is obtained by taking the addition 

![[2024_01_08 9_39 AM Office Lens (2).jpg|200]]