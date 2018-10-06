const bubbleSort = arr => {
    var n = arr.length;
    for (let i = 0; i < n; i++) {
        for (let j = 0;j < n -i -1; j++) {
            if (arr[j] > arr[j + 1]) {
                var temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                console.log(arr);
            }
        }
    }
    return arr;
}


const arr = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];
console.log(bubbleSort(arr));
