#include <iostream>
#include <vector>
using namespace std;

void merge(vector<int> &arr, int st, int mid, int end){
    vector <int> temp;
    int i = st, j = mid+1;

    while (i <= mid && j <= end){
        if (arr[i] < arr[j]){
            temp.push_back(arr[i]);
            i++;
        } else {
            temp.push_back(arr[j]);
            j++;
        }
    }
    while (i <= mid){
        temp.push_back(arr[i]);
        i++;
    }
    while (j <= end){
        temp.push_back(arr[j]);
        j++;
    }
    for (int k = 0; k < temp.size(); k++)
    {
        arr[st+k] = temp [k];
    }
}

void mergeSort(vector <int> &arr, int st, int end){
    if (st < end){
        int mid = st + (end-st)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, st, mid, end);
    }
}

int main()
{
    int n;
    cout << "Enter how many number you want: ";
    cin >> n;

    vector <int> arr;
    cout << "Enter your numbers: ";
    for (int i = 0; i < n; i++){
        int x;
        cin >> x;
        arr.push_back(x);
    }
    
    cout << "Before sorting: ";
    for (int i : arr){
        cout << i << " ";
    }

    mergeSort(arr, 0, n-1);
    cout << "\nAfter sorting: ";
    for (int i : arr){
        cout << i << " ";
    }

}
