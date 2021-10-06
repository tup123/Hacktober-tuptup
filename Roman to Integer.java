class Solution {
public int romanToInt(String s) {
int value = 0 , n = s.length() , i=n-1;
while(i>=0)
{
if(s.charAt(i) == 'V' || s.charAt(i) == 'X')
{
if(i>0 && s.charAt(i-1) == 'I')
{
if(s.charAt(i) == 'V') value += 4;
else value += 9;
i-=2;
}
else{
if(s.charAt(i) == 'V') value+=5;
else value+=10;
i-=1;
}
}
else if(s.charAt(i) == 'L' || s.charAt(i) == 'C')
{
if(i>0 && s.charAt(i-1) == 'X')
{
if(s.charAt(i) == 'L') value += 40;
else value+=90;
i-=2;
}
else{
if(s.charAt(i) == 'L') value += 50;
else value += 100;
i-=1;
}
}
else if(s.charAt(i) == 'D' || s.charAt(i) == 'M')
{
if(i>0 && s.charAt(i-1) == 'C')
{
if(s.charAt(i) == 'D') value+=400;
else value+=900;
i-=2;
}
else{
if(s.charAt(i) == 'D') value+=500;
else value+=1000;
i-=1;
}
}
else
{
value+=1;
i-=1;
}
}

    return value;
}
}
