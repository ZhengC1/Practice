// Insertion Sort
const insertionSort = arr => {
   for(let i = 1; i < arr.length; i++) {
       let min = arr[i];
       let j = i - 1;
       while (j >= 0 && min < arr[j]) {
           arr[j + 1] = arr[j];
           j--;
           console.log(arr);
       }
       arr[j+1] = min;
   }
    return arr
}

const arr = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];


console.log(insertionSort(arr));
