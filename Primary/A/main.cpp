#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

int main() {
    int x, y;
    int ans;
    int ws = 1;
    int z;
    while (1) {
        ans = 0;
        z = 0;
        cin >> x >> y;
        if (x == 0 && y == 0) break;
        for (ws = 10; x * 10 > ws && y * 10 > ws; ws *= 10) {
            //            cout <<  (int)((x % ws) / ws) + (int)((y % ws) /ws) << endl;
            //            cout << ((x % ws) * 10 / ws + (y % ws) * 10 / ws) << " " << x % ws << " " << y % ws<< endl;
            if ((x % ws) * 10 / ws + (y % ws) * 10 / ws >= 10) {
                ans++;
                x +=  ws;
            }
        }
        cout << ans << endl;
    }
    return 0;
}
