#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

bool isPnum(int a) {
    for (int i = 2; i < a - 1; i++) {
        if (a % i == 0) return false;
    }
    return true;
}

int main() {
    int n;
    cin >> n;
    int x;
    for (int j = 0; j < n; j++) {
        cin >> x;
        for (int i = 0; true; i++) {
            if (isPnum(x + i)) {
                cout << x + i << endl;
                break;
            }
            if (isPnum(x - i)) {
                cout << x - i << endl;
                break;
            }
        }
    }
    return 0;
}

