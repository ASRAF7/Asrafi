#include<iostream>
using namespace std;
void leastnumR(string str, int n, string &res)
{   if (n == 0)
    {res.append(str);
        return;
    }
    int len = str.length();
    if (len <= n)
        return;
    int m = 0;//m=minimum index
    for (int i = 1; i<=n ; i++)
        if (str[i] < str[m])
            m = i;
    res.push_back(str[m]);
    string new_str = str.substr(m+1, len-m);
    leastnumR(new_str, n-m, res);
}
string leastnum(string str, int n)
{
    string res = "";
    leastnumR(str, n, res);
    return res;
}
int main()
{   string str = "121198";
    clrscr();
    int n =2;
    cout << leastnum(str, n);
    return 0;
}
