readline();
console.log(readline()
            .split(" ")
            .map(e => Number(e))
            .reduce((sum, i) => sum+i, 0)
            );