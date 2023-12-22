let spaces = [0, 0, 0, 0, 0];
let [h, w] = readline().split(" ");
let L1 = readline();
for (let i=0; i<h-1; i++) {
    let L2 = readline();
    for (let j=0; j<w-1; j++) {
        let spots = L1.slice(j, j+2) + L2.slice(j, j+2);
        if (spots.includes("#")) {
            continue;
        }
        spaces[[...spots].filter(c=>c==="X").length]++;
    }
    L1 = L2;
}
spaces.forEach(s=>console.log(s));