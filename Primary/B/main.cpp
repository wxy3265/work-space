#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;
    int a[n];
    int ans = 0;
    for (int i = 0; i < n; i++) cin >> a[i];
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[j] - a[i] > ans) ans = a[j] - a[i];
        }
    }
    cout << ans << endl;
    return 0;
}

