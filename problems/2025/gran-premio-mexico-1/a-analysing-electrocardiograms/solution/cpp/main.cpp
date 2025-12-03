#include <bits/stdc++.h>
using namespace std;

// Tipos comunes
using ll = long long;
using vi = vector<int>;
using pii = pair<int, int>;

// Constantes
const int INF = 1e9;
const ll LINF = 1e18;

void solve(string s) {
    string p;
    cin >> p;

    if(p.size() % s.size() == 0){
        bool flag = true;
        
        for(int i=0; i<p.size(); i++){
            if(p[i] != s.at(i%s.size())){
                flag = false;
                break;
            }
        }
        
        if(flag)cout << "Yes"; else cout << "No";
        
    }
    else
    cout << "No";
    
    cout << "\n";
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s;
    int n=0;

    cin >> s >> n;

     while(n--){
        solve(s);
     }

    return 0;
}   