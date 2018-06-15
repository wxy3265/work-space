#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

int n;
int a, b;
int x[4], y[4], z[4];
int c;

int main() {
    cin >> n;
    int max, min, c, maxnum, minnum;
    int last = -1;
    bool flag;
    int ans = 0;
    for (int i = 0; i < n; i++) {
        cin >> a;
        while (1) {
            x[0] = a / 1000;
            x[1] = a / 100 % 10;
            x[2] = a / 10 % 10;
            x[3] = a % 10;
            for (int j = 0; j < 4; j++) y[j] = x[j];
            for (int j = 0; j < 4; j++) {
                flag = false;
                min = y[j];
                for (int k = j + 1; k < 4; k++) {
                    if (y[k] < min) {
                        flag = true;
                        min = y[k];
                        minnum = k;
                    }
                }
                if (flag) {
                    c = y[j];
                    y[j] = y[minnum];
                    y[minnum] = c;
                }
            }
            for (int j = 0; j < 4; j++) {
                flag = false;
                max = x[j];
                for (int k = j + 1; k < 4; k++) {
                    if (x[k] > max) {
                        flag = true;
                        max = x[k];
                        maxnum = k;
                    }
                }
                if (flag) {
                    c = x[j];
                    x[j] = x[maxnum];
                    x[maxnum] = c;
                }
            }
            a = x[0] * 1000 + x[1] * 100 + x[2] * 10 + x[3];
            b = y[0] * 1000 + y[1] * 100 + y[2] * 10 + y[3];
            //cout << a << " " << b << ' ' << a - b << endl;
            //cout << last << endl;
            ans++;
            if (a - b == last) {
                cout << ans << endl;
                break;
            }
            a -= b;
            last = a;
        }
    }
    return 0;
    
}
