#include <iostream>

using namespace std;

int main() {
    int day[7];
    int max = 0, maxn = 0;
    for (int i = 0; i < 7; i++) {
        int a;
        cin >> a >> day[i];
        day[i] += a;
        if (day[i] > 8 && day[i] > max) {
            max = day[i];
            maxn = i + 1;
        }
    }
    cout << maxn << endl;
    return 0;
}
