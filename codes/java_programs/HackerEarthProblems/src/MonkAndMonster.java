/*Monk And Monster

Monster is troubling the Monk. Monk is given a task to completely traverse the string P
. Monster owns a string Q

.

Monk cannot traverse the string P
if there is an index i in P such that Q is a prefix of the sub-string of P

starting at 'i' until Monster allows him to do so.Monk is rich so he pays the monster whenever he finds such an index and Monster asks him for money.

Monster takes different amounts of money for allowing a jump at index i. Thus, you are given 2
strings P and Q and a cost array. The size of the array is N which is same as length of P

.Determine the maximum amount Monster can get from Monk. By jump it means that if Monk jumps at index 'i' then he reaches index 'i+|Q|'.

Note:

N
is guaranteed to be equal to |P|

Monk cannot jump at any index until Q
is a prefix of substring at index i of P

.

If Monk doesn’t jump at any particular index he doesn’t pay anything.

Monster may(i.e it is not necessary) ask for money from Monk if Q
is a prefix of substring at index i of P

. He may also let him go for free if he thinks he can gain more in future.

Input:

First line contains number of testcases T.

Each testcase consists of four lines:
First line consists of string P
.
Second line consists of string Q.(Both strings consist of lowercase English characters only).
Next line contains an integer N

.
Next line contains an integer cost array.

Output:

Output the maximum amount Monster can get.

Constraints:

1≤T≤10

2≤|Q|≤|P|≤105

N=|P|

1≤Cost[i]≤20

Sample Input

3

aaaaa

aa

5

1 6 3 10 2 

qwer

asd

4

1 2 3 4 

oksirok

ok

7

4 2 5 11 12 4 6 

Sample Output

16 

0 

8

Explanation

In 1st case the match occurs at index 1,2,3,4
. So Monster takes money from him at index 2 and 4 (6+10) which leads to a maximum gain of 16

.

In 2nd case there isn't any match so answer is 0

.

In 3rd case the match occurs at index 1
and 6 thus Monster takes money at both these indexes and gaining amount of (4+4)=8.*/
public class MonkAndMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
