#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using vi = vector<int>;
using pii = pair<int, int>;

const int INF = 1e9;
const ll LINF = 1e18;

void solve() {
    
    ll n=0,m=0,a=0;
    
    bool noExist = true;
    
    cin >>n >>m;
    
    for(int i=1; i <= n; i++){
        cin >> a;
        if(a >= m){
            noExist = false;
            cout << i << endl;
            break;
        }
    }
    if(noExist) cout << "-1" << endl;
    
    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    solve();
    return 0;
}