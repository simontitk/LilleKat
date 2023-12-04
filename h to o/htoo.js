let [compoundIn, num ] = readline().split(" ");
let compoundOut = readline();

function getStock(compound) {
    let stock = {};
    let i = 0;
    while (i < compound.length) {
        let element = compound.charAt(i);
        let increase = 1;
        let j = i + 1;
        let k = j;
        while (j < compound.length && !isNaN(compound.charAt(j))) {
            j++;
        }
        if (k != j) {
            increase = Number(compound.slice(k, j));
        }
        stock[element] = (stock[element] || 0) + increase;  
        i = j;
    }
    return stock;
}

let stockIn = getStock(compoundIn);
let stockOut = getStock(compoundOut);
let result = Infinity;

for (let element in stockOut) {
    let amount = Math.floor(stockIn[element] * Number(num) / stockOut[element]);
    if (!amount) {
        result = 0;
        break;
    }
    if (amount < result) {
        result = amount;
    }
}

console.log(result);