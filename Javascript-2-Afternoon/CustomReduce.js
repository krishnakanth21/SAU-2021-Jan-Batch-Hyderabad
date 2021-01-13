        
const intArray = [1,2,3,4,5,6];
function customReduce(arr, func) {
  let sum = 0;
  for (var i =0; i< arr.length; i++) {
    sum = func(sum, arr[i]);
  }
  return sum;
}

let result = customReduce(intArray, (a, b) => a + b);
console.log(result);