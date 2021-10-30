#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int s;
	float a;
	cin>>s>>a;
	float sub=a-s-0.5;
	if(a>=(s+0.5) and s%5==0)
	{
	    cout<<fixed;
	    cout<<setprecision(2)<<(sub);
	}
	else cout<<a;
	return 0;
}
